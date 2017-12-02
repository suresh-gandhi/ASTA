package com.example.android.asta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

// TODO: 1. X, Y Axis labelling needs to be done.

public class HistoricalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);

        LineChart historicalChart = (LineChart) findViewById(R.id.historicalChart);

        List<Entry> entries = new ArrayList<>();
        // TODO: Adding the fake data presently but it needs to be fetched from the server.
        // TODO: Also display the icon along with the values as well as the present month icon in a special manner.
        entries.add(new Entry(1, 14));
        entries.add(new Entry(2, 15));
        entries.add(new Entry(3, 11));
        entries.add(new Entry(4, 12));
        entries.add(new Entry(5, 18));
        entries.add(new Entry(6, 15));

        // TODO: What the fuck do we mean by enabling the label.
        LineDataSet dataSet = new LineDataSet(entries, "Label");
        // TODO: Styling needs to be performed.

        LineData lineData = new LineData(dataSet);
        historicalChart.setData(lineData);
        historicalChart.invalidate();
    }
}
