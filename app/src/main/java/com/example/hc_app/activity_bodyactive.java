package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_bodyactive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyactive);
    }
    public void BH  (View v){
        Intent it = new Intent(activity_bodyactive.this,MainActivity.class);
        startActivity(it);
    }
    public void BG  (View v){
        Intent it = new Intent(activity_bodyactive.this, GuidelineActivity.class);
        startActivity(it);
    }
}
