package com.example.hc_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Calendar;

public class PerinealIrrigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perineal_irrigation);

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
    public void youtube  (View v) {
        Uri uri=Uri.parse("https://www.youtube.com/watch?v=llhKB3LC0MQ");
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}
