package com.example.hc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tsai.MainActivity;
import com.example.tsai.R;

public class clean_body extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_body);
    }
    public void BH  (View v){
        Intent it = new Intent(clean_body.this, MainActivity.class);
        startActivity(it);
        finish();
    }
    public void BG  (View v){
        Intent it = new Intent(clean_body.this, clean_menu.class);
        startActivity(it);
        finish();
    }
}
