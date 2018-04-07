package com.qzeng.downloader

import java.io.*
import java.net.HttpURLConnection
import java.net.URL

/**
 * Created by qzeng on 3/21/2018.
 */
class DefaultNetWorkEngine : INetWorkEngine {
  private val BUFFERSIZE: Int = 4096
  var fileSaveDir: String = getSdCardFile()!!
  @Throws(IOException::class)
  override
  fun download(fileUrl: String) {
    var url = URL(fileUrl)
    val conn = url.openConnection() as HttpURLConnection
    if (conn.responseCode == HttpURLConnection.HTTP_OK) {
       val disposition = conn.getHeaderField("Content-Disposition")
      var fileName = extractFileName(disposition, fileUrl)

      val inputStream = conn.inputStream
      val fullFileSavePath = fileSaveDir + File.separator + fileName
      DownloadLogger.d("file save path...$fullFileSavePath")
      val fileOutputStream = FileOutputStream(fullFileSavePath)
      var byteRead = -1
      val byteArray = ByteArray(BUFFERSIZE)
       while (true) {
        byteRead = inputStream.read(byteArray)
        if (byteRead<0)
        break
        fileOutputStream.write(byteArray, 0, byteRead)
      }
      inputStream.close()
      fileOutputStream.close()
      DownloadLogger.d("file downloaded...")
    }else{
      DownloadLogger.w("file downloaded fail...")
    }
  }

  private fun extractFileName(disposition: String?, url: String): String? {
     return if (disposition!=null&&disposition.indexOf("filename=") > 0)
      disposition.substring(disposition.indexOf("filename=") + 10,
          disposition.length - 1)
    else
      url.substring(
          url.lastIndexOf("/") + 1,
          url.length)
  }



}