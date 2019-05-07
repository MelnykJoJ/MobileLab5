package com.example.kn20android.mobilelab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart barChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart = (BarChart) findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(70f,0));
        barEntries.add(new BarEntry(50f,1));
        barEntries.add(new BarEntry(80f,2));
        barEntries.add(new BarEntry(90f,3));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Dates");

        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("March");
        theDates.add("April");
        theDates.add("May");
        theDates.add("June");

        BarData theData = new BarData(theDates,barDataSet);
        barChart.setData(theData);

        barChart.setTouchEnabled(true);
        barChart.setDragEnabled(true);
        barChart.setScaleEnabled(true);


    }


}