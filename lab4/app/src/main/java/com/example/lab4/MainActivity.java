package com.example.lab4;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Resources resources = getResources();
        int textColor = resources.getColor(R.color.textViewFontColor, null);
        int backcroundColor = resources.getColor(R.color.textViewBackColor);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        ConstraintLayout.LayoutParams layoutParams = new  ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT , ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        TextView textView = new TextView(this);
        textView.setText("Hello Android");
        textView.setTextSize(32);
        textView.setTextColor(textColor);
        textView.setBackgroundColor(backcroundColor);
        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);
        setContentView(constraintLayout);
    }
}