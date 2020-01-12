package com.example.hc_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class WebViewActivity extends AppCompatActivity {

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

        class MyJavaScriptInterface {
            @JavascriptInterface
            @SuppressWarnings("unused")
            public void processHTML(String res) {
                // process the html as needed by the app
//                if (res.equals("Your response has been recorded.")) {
                if (res != "") {
                    Calendar c = Calendar.getInstance();//get calendar
                    int today = c.get(Calendar.DAY_OF_YEAR);//get day of year

                    SharedPreferences sharecheck = getSharedPreferences("check", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharecheck.edit();
                    int saveInt = sharecheck.getInt("write", 0);

                    editor.putInt("write", 100);//put data
                    editor.putInt("day", today);
                    editor.commit();

                    System.out.println("today: " + today);
                    Log.d("processHTML", "today: " + today);
                    Log.d("processHTML", "FINISH!!!!! ");
                    finish();
                }
            }
        }

        myWebView = findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.addJavascriptInterface(new MyJavaScriptInterface(), "HTMLOUT");

        myWebViewClient = new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
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
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //Intent it = new Intent(WebViewActivity.this, MainActivity.class);
            //startActivity(it);
            myWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
