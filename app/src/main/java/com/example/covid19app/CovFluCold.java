package com.example.covid19app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CovFluCold extends AppCompatActivity {
    private WebView mywebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cov_flu_cold);

        Intent intent=getIntent();
        mywebView=(WebView)findViewById(R.id.webview);
        WebSettings webSettings=mywebView.getSettings();
        mywebView.loadUrl("https://www.discovery.co.za/corporate/covid19-defference-between-flu-and-common-cold");
        webSettings.setJavaScriptEnabled(true);     //javaScripts will support if present

    }
    public class myWebClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon){
            super.onPageStarted(view,url,favicon);
        }
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public void onBackPressed(){
        if(mywebView.canGoBack()) {
            mywebView.goBack();
        } else{
                super.onBackPressed();

            }
        }
    }
