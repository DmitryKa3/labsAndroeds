package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView myTextView;
    Button myButton;
    ImageButton imageButton;

    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.textView3);
        myButton = findViewById(R.id.button);
        imageButton = findViewById(R.id.imageButton);
        myButton.setOnClickListener(оMyButton);
        }

        View.OnClickListener оMyButton = new View.OnClickListener() {
            @Override // ключевое слово для переопределения метода
            public void onClick(View v) {

                myTextView.setText("Все ок)");
                imageButton.setVisibility(View.VISIBLE);
            }
        };
    }