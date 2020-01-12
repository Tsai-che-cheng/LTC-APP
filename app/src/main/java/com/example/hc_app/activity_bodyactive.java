package com.example.hc_app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class activity_bodyactive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodyactive);

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
    public void pjm  (View v) {
        Intent it = new Intent(activity_bodyactive.this, PassiveJointMovement.class);
        startActivity(it);
    }
    public void sauam  (View v) {
        Intent it = new Intent(activity_bodyactive.this, ShoulderAndUpperArmMovement.class);
        startActivity(it);
    }
    public void eafm  (View v) {
        Intent it = new Intent(activity_bodyactive.this, ElbowAndForearmMovement.class);
        startActivity(it);
    }
    public void wm  (View v) {
        Intent it = new Intent(activity_bodyactive.this, WristMovement.class);
        startActivity(it);
    }
    public void tmj  (View v) {
        Intent it = new Intent(activity_bodyactive.this, ThumbMetacarpophalangealJoint.class);
        startActivity(it);
    }
    public void tkm  (View v) {
        Intent it = new Intent(activity_bodyactive.this, ThumbKnuckleMovement.class);
        startActivity(it);
    }
    public void ffmj  (View v) {
        Intent it = new Intent(activity_bodyactive.this, FourFingerMetacarpophalangealJoint.class);
        startActivity(it);
    }
    public void fk  (View v) {
        Intent it = new Intent(activity_bodyactive.this, FirstKnuckle.class);
        startActivity(it);
    }
    public void hakm  (View v) {
        Intent it = new Intent(activity_bodyactive.this,HipAndKneeMovement.class);
        startActivity(it);
    }
    public void am  (View v) {
        Intent it = new Intent(activity_bodyactive.this,AnkleMovement.class);
        startActivity(it);
    }
    public void tm  (View v) {
        Intent it = new Intent(activity_bodyactive.this,ToeMovement.class);
        startActivity(it);
    }
    public void body  (View v) {
        Uri uri=Uri.parse("https://www.youtube.com/watch?v=nzQfCAs1s40");
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}
