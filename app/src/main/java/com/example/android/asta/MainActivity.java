package com.example.android.asta;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;

//TODO: Have to see which are to be made as global variables and which are to be made as local variables.
// TODO: Also watch the video of backwards compatibility of Vector Assets. It needs to be looked over.
// TODO: Comments should also be written for making the code more descriptive and readable.
// TODO: MPAndroidChart License accordingly or tell him about the project so that it becomes open and he can mention it in his projects.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Grabbing the necessary references.
        LinearLayout everyonesArea = (LinearLayout) findViewById(R.id.everyonesIconAreaMainActivity);
        LinearLayout calenderArea = (LinearLayout) findViewById(R.id.calenderIconAreaMainActivity);
        LinearLayout historicalArea = (LinearLayout) findViewById(R.id.histoicalIconAreaMainActivity);

        everyonesArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent performanceIntent = new Intent(MainActivity.this, PerformanceActivity.class);
                startActivity(performanceIntent);
            }
        });

        calenderArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calenderIntent = new Intent(MainActivity.this, CalenderActivity.class);
                startActivity(calenderIntent);
            }
        });

        historicalArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historicalIntent = new Intent(MainActivity.this, HistoricalActivity.class);
                startActivity(historicalIntent);
            }
        });

    }

}
