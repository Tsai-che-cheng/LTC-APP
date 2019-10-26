package com.example.hc_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class activity_assistmedical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistmedical);
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
    public void gb  (View v) {
        Intent it = new Intent(activity_assistmedical.this, GlycerinBall.class);
        startActivity(it);
    }
    public void cbm  (View v) {
        Intent it = new Intent(activity_assistmedical.this,CarryingBloodMeter.class);
        startActivity(it);
    }
    public void scfws  (View v) {
        Intent it = new Intent(activity_assistmedical.this,SimpleCareForWoundSecretions.class);
        startActivity(it);
    }
    public void bpc  (View v) {
        Intent it = new Intent(activity_assistmedical.this, BodyPipelineCleaning.class);
        startActivity(it);
    }
    public void os  (View v) {
        Intent it = new Intent(activity_assistmedical.this, OralSuction.class);
        startActivity(it);
    }
}
