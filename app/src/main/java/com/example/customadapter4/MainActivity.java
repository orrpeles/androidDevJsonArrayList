package com.example.customadapter4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Oncreate: Started");
        ListView mListview = findViewById(R.id.listView);

        // create fake quake objects
//        quake quake1 = new quake("4.6", "LA", "14/4/96");
//        quake quake2 = new quake("4.6", "LA", "14/4/96");
//        quake quake3 = new quake("4.6", "LA", "14/4/96");
//        quake quake4 = new quake("4.6", "LA", "14/4/96");
//        quake quake5 = new quake("4.6", "LA", "14/4/96");
//        quake quake6 = new quake("4.6", "LA", "14/4/96");

        // get list of earthquakes from queryUtils
        ArrayList<quake> earthquakes = QueryUtils.extractEarthQuakes();
        // set the adapter to the layout and the arraylist and activate it;
        earthquakeAdapter adapter = new earthquakeAdapter(this, R.layout.model, earthquakes);
        mListview.setAdapter(adapter);

//        earthquake.add(quake1);
//        earthquake.add(quake2);
//        earthquake.add(quake3);
//        earthquake.add(quake4);
//        earthquake.add(quake5);
//        earthquake.add(quake6);

        //create adapter, pass this activity as context, match to our listview model, and the arraylist)
//        earthquakeAdapter adapter = new earthquakeAdapter(this, R.layout.model, earthquake);
        // take our listview and set the cusotm adapter to it
//        mListview.setAdapter(adapter);
        }
    }

