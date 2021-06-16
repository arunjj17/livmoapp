package com.example.myapplication;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class vid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid);

        VideoView videoView= findViewById(R.id.video);

        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.virushka);
        videoView.setVideoURI(uri);

        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}