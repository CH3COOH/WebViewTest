package jp.ch3cooh.webviewtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView

import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mWebView = findViewById<WebView>(R.id.webView)
        mWebView.webViewClient = WebViewClient()

        val settings = mWebView.settings
        settings.javaScriptEnabled = true
//        settings.useWideViewPort = true
//        settings.loadWithOverviewMode = true

        mWebView.loadUrl("https://blog.ch3cooh.jp")
    }
}
