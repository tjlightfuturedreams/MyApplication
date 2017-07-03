package com.example.lightfuture.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AutoCompleteTextView;

/**
 * Created by lightfuture on 2017/7/3.
 */

public class RegActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        regs();
    }
    protected void regs(){
        webView=(WebView) findViewById(R.id.homeNews);
        WebSettings wbs=webView.getSettings();
        wbs.setJavaScriptEnabled(true);
        wbs.setAllowFileAccess(true);
        wbs.setCacheMode(WebSettings.LOAD_DEFAULT);
        wbs.setDefaultTextEncodingName("gbk");
        webView.loadUrl("http://www.renfa888.com/mobile/register.php");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                return true;
            }
        });
    }
}
