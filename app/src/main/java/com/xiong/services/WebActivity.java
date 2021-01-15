package com.xiong.services;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class WebActivity extends Activity {
    private WebView mWebView;

    private TextView tv_title;

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        setContentView(R.layout.activity_web);
        tv_title = (TextView) findViewById(R.id.tv_title);
        tv_title.setText(getIntent().getStringExtra("title"));
        Log.e("TAG",getIntent().getStringExtra("title"));
        Log.e("TAG",getIntent().getStringExtra("url"));
        findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                finish();
            }
        });
        mWebView = (WebView) findViewById(R.id.webView1);
        mWebView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView param1WebView, String param1String) {
                return false;
            }
        });
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);//是否允许执行js，默认为false。设置true时，会提醒可能造成XSS漏洞
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);//设置js可以直接打开窗口，如window.open()，默认为false
        webSettings.setAppCacheEnabled(true);//是否使用缓存
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setSupportZoom(true);//是否可以缩放，默认true
        webSettings.setUseWideViewPort(true);//设置此属性，可任意比例缩放。大视图模式
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setDisplayZoomControls(true);
        webSettings.setDefaultFontSize(12);
        webSettings.setBuiltInZoomControls(true);//是否显示缩放按钮，默认false
        webSettings.setLoadWithOverviewMode(true);//和setUseWideViewPort(true)一起解决网页自适应问题
        webSettings.setDomStorageEnabled(true);//DOM Storage
        mWebView.getSettings().setDatabaseEnabled(true);
        webSettings.setUserAgentString("User-Agent:Android");//设置用户代理，一般不用
        mWebView.loadUrl(getIntent().getStringExtra("url"));
//        mWebView.loadUrl("https://www.baidu.com/");
    }

    public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
        if (paramInt == 4) {
            if (mWebView.canGoBack()) {
                mWebView.goBack();
                return true;
            }
            finish();
            return true;
        }
        return false;
    }
}


/* Location:              C:\Users\28556\Desktop\app-release(43寸)\dex\classes_dex2jar.jar!\com\xiong\smartlegalservices\WebActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */