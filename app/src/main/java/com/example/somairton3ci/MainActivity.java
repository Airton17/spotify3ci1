package com.example.somairton3ci;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
 MediaPlayer media;
    ImageView coverImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coverImage = findViewById(R.id.imageA);
        Glide.with(this).load("https://img.youtube.com/vi/ysSxxIqKNN0/0.jpg").into(coverImage);
        media = MediaPlayer.create(getApplicationContext(), R.raw.teste);
    }


    @Override
    protected void onResume() {
        super.onResume();
        media.start();
    }
}
