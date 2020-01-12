package com.example.hc_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;


public class activity_lifecare extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecare);

        //=========after 30 day to do questionnaire start========
        SharedPreferences sharecheck = getSharedPreferences("check", MODE_PRIVATE);
        int firstloginofday = sharecheck.getInt("day", 0);
        int saveInt = sharecheck.getInt("write", 0);
        Calendar c = Calendar.getInstance();
        int today = c.get(Calendar.DAY_OF_YEAR);
        SharedPreferences.Editor editor = sharecheck.edit();
        if (today-firstloginofday>=30 && saveInt ==100) {
            editor.putInt("write", 200);//put data
            editor.commit();
            startActivity(new Intent(this, WebViewActivity_After.class));
            finish();
        }
        //=========after 30 day to do questionnaire end========

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
    public void aito  (View v) {
        Intent it = new Intent(activity_lifecare.this, AssistInTurningOver.class);
        startActivity(it);
    }
    public void baoc  (View v) {
        Intent it = new Intent(activity_lifecare.this, BrushingAndOralCleaning.class);
        startActivity(it);
    }
    public void cn  (View v) {
        Intent it = new Intent(activity_lifecare.this, CutNails.class);
        startActivity(it);
    }
    public void awm  (View v) {
        Intent it = new Intent(activity_lifecare.this, AssistWithMedication.class);
        startActivity(it);
    }
    public void pi  (View v) {
        Intent it = new Intent(activity_lifecare.this, PerinealIrrigation.class);
        startActivity(it);
    }
    public void ue  (View v) {
        Intent it = new Intent(activity_lifecare.this, UrinaryExcretion.class);
        startActivity(it);
    }
    public void ie  (View v) {
        Intent it = new Intent(activity_lifecare.this, IntestinalExcretion.class);
        startActivity(it);
    }

}
