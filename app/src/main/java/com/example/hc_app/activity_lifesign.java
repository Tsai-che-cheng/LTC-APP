package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_lifesign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifesign);
    }
    public void BH  (View v){
        Intent it = new Intent(activity_lifesign.this,MainActivity.class);
        startActivity(it);
    }
    public void BG  (View v){
        Intent it = new Intent(activity_lifesign.this, GuidelineActivity.class);
        startActivity(it);
    }
}
