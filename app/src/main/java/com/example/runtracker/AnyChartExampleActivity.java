package com.example.runtracker;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;

import java.util.ArrayList;
import java.util.List;


public class AnyChartExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_any_chart_example);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);

        Pie pie = AnyChart.pie();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("Wriggles", 20));
        data.add(new ValueDataEntry("Myra Bean", 20));
        data.add(new ValueDataEntry("HUNNICANS!", 60));

        pie.data(data);
        pie.title("Those I love the most");
       // pie.labels().position("outside");

        anyChartView.setChart(pie);
    }
}
