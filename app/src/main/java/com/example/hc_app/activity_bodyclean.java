package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class activity_bodyclean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyclean);
    }
    public void BH  (View v){
        Intent it = new Intent(activity_bodyclean.this,MainActivity.class);
        startActivity(it);
    }
    public void BG  (View v){
        Intent it = new Intent(activity_bodyclean.this, GuidelineActivity.class);
        startActivity(it);
    }
    public void WearClo  (View v) {
        Intent it = new Intent(activity_bodyclean.this, wear_clothes.class);
        startActivity(it);
    }
    public void cleanhear  (View v) {
        Intent it = new Intent(activity_bodyclean.this, clean_menu.class);
        startActivity(it);
    }
}
