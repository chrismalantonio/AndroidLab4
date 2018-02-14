package edu.temple.coloradapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] colors = {"White", "Maroon", "Red", "Yellow", "Green", "Teal", "Blue", "Purple", "Fuchsia", "Grey"};
    public static String colorSelected = "color";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        ColorAdapter adapter = new ColorAdapter(this, colors);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            View mainView = (View) findViewById(R.id.layout);
            Intent colorIntent = new Intent(PaletteActivity.this, ColorActivity.class);
            colorIntent.putExtra(colorSelected, colors[i]);
            if (!colorIntent.getStringExtra(colorSelected).equals("White")){
                startActivity(colorIntent);
            }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
