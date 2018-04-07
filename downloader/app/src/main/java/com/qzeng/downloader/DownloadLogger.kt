package com.qzeng.downloader

import android.util.Log

object DownloadLogger {
  private const val TAG = "downloader"

  fun d(txt: String) {
    if (BuildConfig.DEBUG)
      Log.d(TAG, txt)
  }

  fun w(warn: String) {
    if (BuildConfig.DEBUG)
      Log.w(TAG, warn)
  }
}