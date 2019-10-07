package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_assistmedical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistmedical);
    }
    public void BH  (View v){
        Intent it = new Intent(activity_assistmedical.this,MainActivity.class);
        startActivity(it);
    }
    public void BG  (View v){
        Intent it = new Intent(activity_assistmedical.this, GuidelineActivity.class);
        startActivity(it);
    }
}
