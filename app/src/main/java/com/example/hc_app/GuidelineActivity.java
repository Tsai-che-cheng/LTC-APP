package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class GuidelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guideline);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.menu_guideline, menu);
        //return super.onCreateOptionsMenu(menu);

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_guideline, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                return true;
            case R.id.action_home:
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void TLC  (View v){
        Intent it = new Intent(GuidelineActivity.this, activity_lifecare.class);
        startActivity(it);
    }
    public void tb  (View v){
        Intent it = new Intent(GuidelineActivity.this, TurnBody.class);
        startActivity(it);
    }
    public void TBC  (View v){
        Intent it = new Intent(GuidelineActivity.this,activity_bodyclean.class);
        startActivity(it);
    }
    public void TLS  (View v){
        Intent it = new Intent(GuidelineActivity.this, activity_lifesign.class);
        startActivity(it);
    }
    public void TNGF  (View v){
        Intent it = new Intent(GuidelineActivity.this, activity_NGF.class);
        startActivity(it);
    }
    public void TBA  (View v){
        Intent it = new Intent(GuidelineActivity.this,activity_bodyactive.class);
        startActivity(it);
    }
    public void THS  (View v){
        Intent it = new Intent(GuidelineActivity.this, activity_helpstairs.class);
        startActivity(it);
    }
    public void TAM  (View v){
        Intent it = new Intent(GuidelineActivity.this,activity_assistmedical.class);
        startActivity(it);
    }
    public void TAE  (View v){
        Intent it = new Intent(GuidelineActivity.this,activity_assistexcretion.class);
        startActivity(it);
    }
    public void TPC  (View v){
        Intent it = new Intent(GuidelineActivity.this, activity_professioncare.class);
        startActivity(it);
    }
    public void TEC  (View v){
        Intent it = new Intent(GuidelineActivity.this,activity_emergencyconcept.class);
        startActivity(it);
    }
    public void TDP  (View v){
        Intent it = new Intent(GuidelineActivity.this,activity_deathbedpeaceful.class);
        startActivity(it);
    }
}
