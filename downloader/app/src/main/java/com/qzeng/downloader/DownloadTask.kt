package com.qzeng.downloader

import android.util.Log
import java.io.File

/**
 * Created by qzeng on 3/21/2018.
 */
class DownloadTask(val fileEntity: FileEntity):Thread(){

    override fun run() {
        super.run()
        Log.d("DownloadTask","hehe${fileEntity.toString()}")
    }
}