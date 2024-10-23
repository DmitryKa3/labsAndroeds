package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ButtonClickCounter extends AppCompatActivity {
    TextView myTextView;
    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_click_counter);
        myTextView = findViewById(R.id.textView);
        myButton = findViewById(R.id.button);
        myButton.setOnClickListener(оMyButton);

    }
    View.OnClickListener оMyButton = new View.OnClickListener() {
        int counter = 0;
        @Override
        public void onClick(View v) {
            myTextView.setText(String.valueOf(++counter));
        }
    };
}