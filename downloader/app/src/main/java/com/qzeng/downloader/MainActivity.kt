package com.qzeng.downloader

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setSupportActionBar(toolbar)

    fab.setOnClickListener { view ->
      Snackbar.make(view, "a file is downloading", Snackbar.LENGTH_LONG)
          .setAction("Action", null).show()

      var fileUrl = "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1784954478,3132021255&fm=27&gp=0.jpg"
      //you can check the file downloaded whether successfully or failed by watching your sdcard
      DownloadManager.download(fileUrl)
    }

  }

}
