package com.example.hc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tsai.MainActivity;
import com.example.tsai.R;
import com.example.tsai.activity_bodyclean;

public class wear_clothes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wear_clothes);
    }
    public void BH  (View v){
        Intent it = new Intent(wear_clothes.this, MainActivity.class);
        startActivity(it);
        finish();
    }
    public void BG  (View v){
        Intent it = new Intent(wear_clothes.this, activity_bodyclean.class);
        startActivity(it);
        finish();
    }
}
