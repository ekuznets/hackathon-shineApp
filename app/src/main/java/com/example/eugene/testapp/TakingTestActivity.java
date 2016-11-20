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


public class TakingTestActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taking_test);

        listView = (ListView) findViewById(R.id.list);
        // Defined Array values to show in ListView
        String[] values =
                {   "*I am keep getting distracted from my main task\n" +
                        "*I have nothing to do right now…\n" +
                        "*I need to a break from my current task",

                        "*I am having hard time to finish what I planned for the day.\n" +
                                "*I worry about my friends and family more than myself.\n" +
                                "*I am bad at organize my priorities\n" +
                                "*I am not getting enough sleep\n"+
                                "*I believe I can change everything with or without I have control of it",

                        "*I feel like people around me is better than me\n" +
                                "*I know that I am almost there to accomplish my goal/task and I need a little more push to finish it\n" +
                                "*I am keep getting distracted from my main task\n" +
                                "*I just want to give up",

                        "*I think about past often and imagine ‘what if’s and maybe’s’\n" +
                                "*I can’t feel happy because of my future worries\n" +
                                "*I can’t find peace in myself\n" +
                                "*I having trouble with my relationship with my friends and family",

                        "*I don’t have friends or family around me to support me.\n" +
                                "*I need to talk someone but I don’t have anyone to go and talk.\n" +
                                "*I am feeling down and having serious thoughts about giving up from life."
                };
        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign adapter to ListView
        listView.setAdapter(adapter);
    }
}