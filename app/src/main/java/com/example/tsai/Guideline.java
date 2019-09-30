package com.example.tsai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Guideline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);
    }
    public void BH  (View v){
        Intent it = new Intent(Guideline.this,MainActivity.class);
        startActivity(it);
        finish();
    }
    public void TLC  (View v){
        Intent it = new Intent(Guideline.this,activity_lifecare.class);
        startActivity(it);
        finish();
    }
    public void TBC  (View v){
        Intent it = new Intent(Guideline.this,activity_bodyclean.class);
        startActivity(it);
        finish();
    }
    public void TLS  (View v){
        Intent it = new Intent(Guideline.this,activity_lifesign.class);
        startActivity(it);
        finish();
    }
    public void TNGF  (View v){
        Intent it = new Intent(Guideline.this,activity_NGF.class);
        startActivity(it);
        finish();
    }
    public void TTO  (View v){
        Intent it = new Intent(Guideline.this,activity_turnover.class);
        startActivity(it);
        finish();
    }
    public void TBA  (View v){
        Intent it = new Intent(Guideline.this,activity_bodyactive.class);
        startActivity(it);
        finish();
    }
    public void THS  (View v){
        Intent it = new Intent(Guideline.this,activity_helpstairs.class);
        startActivity(it);
        finish();
    }
    public void TAM  (View v){
        Intent it = new Intent(Guideline.this,activity_assistmedical.class);
        startActivity(it);
        finish();
    }
    public void TAE  (View v){
        Intent it = new Intent(Guideline.this,activity_assistexcretion.class);
        startActivity(it);
        finish();
    }
    public void TPC  (View v){
        Intent it = new Intent(Guideline.this,activity_professioncare.class);
        startActivity(it);
        finish();
    }
    public void TEC  (View v){
        Intent it = new Intent(Guideline.this,activity_emergencyconcept.class);
        startActivity(it);
        finish();
    }
    public void TDP  (View v){
        Intent it = new Intent(Guideline.this,activity_deathbedpeaceful.class);
        startActivity(it);
        finish();
    }
}
