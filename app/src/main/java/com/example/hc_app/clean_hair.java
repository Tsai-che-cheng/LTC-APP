package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class clean_hair extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_hard);
    }
    public void BH  (View v){
        Intent it = new Intent(clean_hair.this, MainActivity.class);
        startActivity(it);
    }
    public void BG  (View v){
        Intent it = new Intent(clean_hair.this, clean_menu.class);
        startActivity(it);
    }
}
