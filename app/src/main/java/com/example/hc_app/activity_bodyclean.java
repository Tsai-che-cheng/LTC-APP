package com.example.tsai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.hc_app.clean_menu;
import com.example.hc_app.wear_clothes;

public class activity_bodyclean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyclean);
    }
    public void BH  (View v){
        Intent it = new Intent(activity_bodyclean.this,MainActivity.class);
        startActivity(it);
        finish();
    }
    public void BG  (View v){
        Intent it = new Intent(activity_bodyclean.this,Guideline.class);
        startActivity(it);
        finish();
    }
    public void WearClo  (View v) {
        Intent it = new Intent(activity_bodyclean.this, wear_clothes.class);
        startActivity(it);
        finish();
    }
    public void cleanhear  (View v) {
        Intent it = new Intent(activity_bodyclean.this, clean_menu.class);
        startActivity(it);
        finish();
    }
}
