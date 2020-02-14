package com.example.runtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadAddRun(View theView) {
        Intent intent = new Intent(this, AddRunActivity.class);
        startActivity(intent);
    }
    public void loadAnyChartExample(View theView) {
        Intent intent = new Intent(this, AnyChartExampleActivity.class);
        startActivity(intent);
    }
}
