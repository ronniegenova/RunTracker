package com.example.runtracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class AddRunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_run);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    protected void save() {
        //TODO Update once I have all the real values.
        Date date = new Date();
        Run.Type type = Run.Type.BASE;
        //TODO Better way to do this?
        double miles = (TextInputEditText)findViewById(R.id.milesTextInput).getText();
        double intensity = 0.0;
        int elevGain = 0;
        Shoe shoe = new Shoe();

        Run run = new Run(date, type, miles, intensity, elevGain, shoe);
    }
}
