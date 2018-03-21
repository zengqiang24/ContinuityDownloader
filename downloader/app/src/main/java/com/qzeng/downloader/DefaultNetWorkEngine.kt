package com.qzeng.downloader

import java.net.HttpURLConnection
import java.net.URL

/**
 * Created by qzeng on 3/21/2018.
 */
class DefaultNetWorkEngine:INetWorkEngine {
    override fun download(fileEntity: FileEntity) {
        var url=URL(fileEntity.url)
        val conn = url.openConnection() as HttpURLConnection
        val inputStream = conn.inputStream


    }


}