package com.example.tsai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_bodyactive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyactive);
    }
    public void BH  (View v){
        Intent it = new Intent(activity_bodyactive.this,MainActivity.class);
        startActivity(it);
        finish();
    }
    public void BG  (View v){
        Intent it = new Intent(activity_bodyactive.this,Guideline.class);
        startActivity(it);
        finish();
    }
}
