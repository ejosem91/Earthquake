package com.example.lenovo.earthquake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<QuakeObject> earthList= new ArrayList<>();
        earthList.add(new QuakeObject("7.2","San Francisco","Feb,2,2003"));
        earthList.add(new QuakeObject("4.0","Los Angeles","July 20,2002"));
        earthList.add(new QuakeObject("3.9","Tokyo","Nov 10, 2014"));
        earthList.add(new QuakeObject("3.9","Cuba","Nov 10, 2013"));
        earthList.add(new QuakeObject("3.9","San Pedro","Nov 10, 2015"));
        earthList.add(new QuakeObject("3.9","El Salvador","Nov 10, 2016"));

        ListView eartquakeListView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this,earthList);

        eartquakeListView.setAdapter(earthquakeAdapter);
    }
}
