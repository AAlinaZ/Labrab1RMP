package com.example.introoo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isDay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rootLayout = findViewById(R.id.rootLayout);
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            if (isDay) {
                rootLayout.setBackgroundColor(Color.BLACK);
                textView.setText("Ночь");
                textView.setTextColor(Color.WHITE);
                isDay = false;
            } else {
                rootLayout.setBackgroundColor(Color.WHITE);
                textView.setText("День");
                textView.setTextColor(Color.BLACK);
                isDay = true;
            }
        });
    }
}