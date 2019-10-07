package com.example.tsai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_NGF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ngf);
    }
    public void BH  (View v){
        Intent it = new Intent(activity_NGF.this,MainActivity.class);
        startActivity(it);
        finish();
    }
    public void BG  (View v){
        Intent it = new Intent(activity_NGF.this,Guideline.class);
        startActivity(it);
        finish();
    }
}
