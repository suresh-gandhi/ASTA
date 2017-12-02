package com.example.android.asta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;
import java.util.List;

import static com.example.android.asta.R.id.historicalChart;
import static com.example.android.asta.R.id.performanceChart;

public class PerformanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_performance);

        BarChart performanceChart = (BarChart) findViewById(R.id.performanceChart);

        List<BarEntry> barEntries = new ArrayList<>();
        // TODO: Adding the fake data presently but it needs to be fetched from the server.
        // TODO: Also display the icon along with the values as well as the present month icon in a special manner.
        barEntries.add(new BarEntry(1, 20));
        barEntries.add(new BarEntry(2, 18));
        barEntries.add(new BarEntry(3, 16));
        barEntries.add(new BarEntry(4, 14));
        barEntries.add(new BarEntry(5, 12));
        barEntries.add(new BarEntry(6, 10));
        barEntries.add(new BarEntry(7, 8));
        barEntries.add(new BarEntry(8, 6));
        barEntries.add(new BarEntry(9, 4));
        barEntries.add(new BarEntry(10, 2));

        BarDataSet dataSet = new BarDataSet(barEntries, "Label");
        // TODO: Styling needs to be performed.

        BarData barData = new BarData(dataSet);
        performanceChart.setData(barData);
        performanceChart.invalidate();
    }
}
