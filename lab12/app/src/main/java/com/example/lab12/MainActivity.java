package com.example.lab12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView myImageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myImageView = findViewById(R.id.imageView);
        Button buttonRotateCenter = findViewById(R.id.rotatecenter);
        Button buttonRotateCorner = findViewById(R.id.rotatecorner);
        final Animation animationRotateCenter = AnimationUtils.loadAnimation(
                this, R.anim.rotate_center);
        final Animation animationRotateCorner = AnimationUtils.loadAnimation(
                this, R.anim.rotate_corner);
        buttonRotateCenter.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageView.startAnimation(animationRotateCenter);
            }
        });
        buttonRotateCorner.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageView.startAnimation(animationRotateCorner);
            }
        });
    }
}
