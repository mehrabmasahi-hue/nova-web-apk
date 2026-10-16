package com.nova.web;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.app.Activity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView wv = new WebView(this);
        WebSettings s = wv.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        wv.loadUrl("file:///android_asset/index.html");
        setContentView(wv);
    }
}
