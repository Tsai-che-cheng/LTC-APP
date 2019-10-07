package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_turnover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turnover);
    }
    public void BH  (View v){
        Intent it = new Intent(activity_turnover.this,MainActivity.class);
        startActivity(it);
    }
    public void BG  (View v){
        Intent it = new Intent(activity_turnover.this, GuidelineActivity.class);
        startActivity(it);
    }
}
