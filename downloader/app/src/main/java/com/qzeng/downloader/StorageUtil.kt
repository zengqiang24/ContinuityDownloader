package com.qzeng.downloader

import android.os.Environment

fun getSdCardFile():String?{
  val sdcardRoot = Environment.getExternalStorageDirectory()
  return sdcardRoot.absolutePath
}