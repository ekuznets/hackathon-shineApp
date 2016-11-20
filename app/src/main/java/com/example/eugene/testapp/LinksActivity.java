package com.example.eugene.testapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class LinksActivity extends AppCompatActivity {
    ListView listView;
    private resourcesPair  banana = new resourcesPair();

    public void bored(View view) {
        Intent intent = new Intent(this, bored.class);
        startActivity(intent);
    }
    public void time_management(View view) {
        Intent intent = new Intent(this, time_management.class);
        startActivity(intent);
    }
    public void sos(View view) {
        Intent intent = new Intent(this, sos.class);
        startActivity(intent);
    }
    public void emotion(View view) {
        Intent intent = new Intent(this, emotion.class);
        startActivity(intent);
    }
    public void motivation(View view) {
        Intent intent = new Intent(this, motivation.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_links);
        getSupportActionBar().setTitle("Links for you <3");


        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

        String input = "11111";

        int size =0;
        int counter = 0;
        int length_string = input.length();

        for(int i =0; i < length_string ; i++)
        {
            if (input.charAt(i) == '1')
            {
                size++;
            }
        }

        String[] activity = new String[size];

        if (input.charAt(0) == '1')
        {
            activity[counter] = "Bored";
            counter++;
        }

        if (input.charAt(1) == '1')
        {
            activity[counter] = "Time Management";
            counter++;
        }

        if (input.charAt(2) == '1')
        {
            activity[counter] = "Motivation";
            counter++;
        }

        if (input.charAt(3) == '1')
        {
            activity[counter] = "Emotionally Overwhelmed";
            counter++;
        }

        if (input.charAt(4) == '1')
        {
            activity[counter] = "SOS";
            //counter++;
        }

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, activity);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                if (position==0)
                {
                    bored(view);
                }
                if (position==1)
                {
                    time_management(view);
                }
                if (position==2)
                {
                    motivation(view);
                }
                if (position==3)
                {
                    emotion(view);
                }
                if (position==4)
                {
                    sos(view);
                }


            }

        });
    }
    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }

}











































