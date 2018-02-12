package com.example.harshi.is;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Main6Activity extends AppCompatActivity {

    private static WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        browser = (WebView)findViewById(R.id.webView);
        String url = "http://www.rithassan.org/DeptIs.htm";
        browser.getSettings().getJavaScriptEnabled();
        browser.loadUrl(url);
    }
}
