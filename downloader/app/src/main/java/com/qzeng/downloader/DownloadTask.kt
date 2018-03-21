package com.qzeng.downloader

import android.util.Log

/**
 * Created by qzeng on 3/21/2018.
 */
class DownloadTask(private val fileEntity: FileEntity):Thread(){

    override fun run() {
        super.run()
        Log.d("DownloadTask","hehe${fileEntity.toString()}")
       var networkEngine= DefaultNetWorkEngine()
       networkEngine.download(fileEntity)
    }
}