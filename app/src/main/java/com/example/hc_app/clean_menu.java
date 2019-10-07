package com.example.hc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tsai.MainActivity;
import com.example.tsai.R;
import com.example.tsai.activity_bodyclean;

public class clean_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_menu);
    }
    public void BH  (View v){
        Intent it = new Intent(clean_menu.this, MainActivity.class);
        startActivity(it);
        finish();
    }
    public void BG  (View v){
        Intent it = new Intent(clean_menu.this, activity_bodyclean.class);
        startActivity(it);
        finish();
    }
    public void cleanhard  (View v){
        Intent it = new Intent(clean_menu.this, clean_hair.class);
        startActivity(it);
        finish();
    }
    public void cleanbody (View v){
        Intent it = new Intent(clean_menu.this,clean_body.class);
        startActivity(it);
        finish();
    }
}

