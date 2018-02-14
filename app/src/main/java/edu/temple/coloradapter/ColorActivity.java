package edu.temple.coloradapter;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Intent receivedIntent = getIntent();
        String color = receivedIntent.getStringExtra(PaletteActivity.colorSelected);
        View colorView = findViewById(R.id.colorView);

        colorView.setBackgroundColor(Color.parseColor(color));

    }
}
