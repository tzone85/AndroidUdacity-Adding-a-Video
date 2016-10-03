package com.example.android.videodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView vV = (VideoView) findViewById(R.id.videoView);
        //It's also possible to http onto an online video (but there can be problems with the emmulator at times)
        vV.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.thandolwethuberita);

        //add video controllers to the video
        MediaController mediaCon = new MediaController(this);
        mediaCon.setAnchorView(vV);
        vV.setMediaController(mediaCon);

        vV.start();
    }
}
