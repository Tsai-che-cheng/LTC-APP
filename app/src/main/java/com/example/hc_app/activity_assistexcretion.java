package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_assistexcretion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistexcretion);
    }
    public void BH  (View v){
        activity_assistexcretion.this.finish();
    }
    public void BG  (View v){
        Intent it = new Intent(activity_assistexcretion.this, GuidelineActivity.class);
        startActivity(it);
    }
}
