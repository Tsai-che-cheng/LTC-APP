package com.example.hc_app;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity{

    private WebView myWebView;
    private WebViewClient myWebViewClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.hide();
        }

        class MyJavaScriptInterface
        {
            @JavascriptInterface
            @SuppressWarnings("unused")
            public void processHTML(String res)
            {
                // process the html as needed by the app
                if (res.equals("Your response has been recorded.")) {
                    Log.d("processHTML", "FINISH!!!!! ");
                    finish();
                }
            }
        }

        myWebView = findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.addJavascriptInterface(new MyJavaScriptInterface(), "HTMLOUT");

        myWebViewClient = new WebViewClient(){
            @Override
            public void onPageFinished(WebView view, String url)
            {
                /* This call inject JavaScript into the page which just finished loading. */
                myWebView.loadUrl("javascript:window.HTMLOUT.processHTML(document.getElementsByClassName('freebirdFormviewerViewResponseConfirmationMessage')[0].textContent);");
            }
        };

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(myWebViewClient);
        myWebView.loadUrl("https://docs.google.com/forms/d/1GPiBGENmqcMDF2Z5b8Hrf2UIBWFJgvDQ5N82qmDup3o/viewform");
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK && myWebView.canGoBack()){
            myWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
