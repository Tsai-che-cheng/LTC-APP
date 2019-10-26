package com.example.hc_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BrushingAndOralCleaning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brushing_and_oral_cleaning);

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
    public void b  (View v) {
        Intent it = new Intent(BrushingAndOralCleaning.this, Brushing.class);
        startActivity(it);
    }
    public void f  (View v) {
        Intent it = new Intent(BrushingAndOralCleaning.this, Flossing.class);
        startActivity(it);
    }
    public void soc  (View v) {
        Intent it = new Intent(BrushingAndOralCleaning.this, SpecialOralCare.class);
        startActivity(it);
    }
    public void adc  (View v) {
        Intent it = new Intent(BrushingAndOralCleaning.this, ActiveDentureCare.class);
        startActivity(it);
    }
}
