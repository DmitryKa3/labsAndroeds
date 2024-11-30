package com.example.lab11;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.graphics.drawable.AnimationDrawable;

public class MainActivity extends AppCompatActivity
{
    AnimationDrawable mAnimation;
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.imageView);
        mImageView.setBackgroundResource(R.drawable.animation);
        mAnimation = (AnimationDrawable) mImageView.getBackground();
        Button mStart = findViewById(R.id.btnStart);
        mStart.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mAnimation.start();
            }
        });
        Button mStop = findViewById(R.id.btnStop);
        mStop.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                mAnimation.stop();
            }
        });
    }
}
