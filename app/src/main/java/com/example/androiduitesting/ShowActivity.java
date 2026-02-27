package com.example.androiduitesting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView clickedCity = findViewById(R.id.clicked_city);
        Button backButton = findViewById(R.id.back_button);

        String cityName = getIntent().getStringExtra("city");
        if (cityName != null) {
            clickedCity.setText(cityName);
        }

        backButton.setOnClickListener(view -> finish());
    }
}
