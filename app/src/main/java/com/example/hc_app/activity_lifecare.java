package com.example.hc_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class activity_lifecare extends AppCompatActivity {
    private VideoView video;
    private String videoFile="test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecare);
        video = (VideoView) findViewById(R.id.videoTest);
        int id = getResources().getIdentifier(videoFile, "raw", this.getPackageName());
        final String path = "android.resource://" + this.getPackageName() + "/" + id;
        video.setVideoURI(Uri.parse(path));
        video.setMediaController(new MediaController(this));
        video.start();
    }
    /*public void onPause(){
        super.onStop();
        video.stopPlayback();
    }*/
    public void BH  (View v){
        Intent it = new Intent(activity_lifecare.this,MainActivity.class);
        startActivity(it);
    }
    public void BG  (View v){
        Intent it = new Intent(activity_lifecare.this, GuidelineActivity.class);
        startActivity(it);
    }
}
