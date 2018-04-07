package com.qzeng.downloader

import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor

object DownloadManager {
  var netWorkEngine:INetWorkEngine = DefaultNetWorkEngine()

   fun setINetWorkEngine(engine: INetWorkEngine){
     this.netWorkEngine=engine
   }

  fun download(url : String){
     Executors.newCachedThreadPool().execute({
       netWorkEngine.download(url)
     })
  }
}