package com.example.tsai;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.hide();
        }

        WebView myWebView = findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        // myWebView.loadUrl("https://forms.gle/QxCeM54KMK1Xu48K8");
        myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScd-qGgwRtVHZP2u5AwcU87IwK1QI65holtWLIpt3WKrRn0cA/viewform");
        // myWebView.loadUrl("https://www.google.com");
    }
}
