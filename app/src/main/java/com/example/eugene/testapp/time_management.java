package com.example.eugene.testapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class time_management extends AppCompatActivity {
    private resourcesPair time = new resourcesPair();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bored);

        time.link = new String[6];
        time.text = new String[6];

        time.link[0] = "http://www.sfu.ca/students/health/apps/sleep--getting-enough-/sleep-to-succeed.html";
        time.text[0] = "Sleep to Succeed (Suggestions)";

        time.link[1] = "http://www.sfu.ca/students/health/apps/sleep--getting-enough-/about-us.html";
        time.text[1] = "Sleep to Succeed (Resources)";

        time.link[2] = "http://www.lib.sfu.ca/about/branches-depts/slc/learning/time-management/top-fifty-time-management-strategies";
        time.text[2] = "Top 50 Time Management Strategies";

        time.link[3] = "https://youtu.be/y2X7c9TUQJ8";
        time.text[3] = "How To Multiply Your Time";

        time.link[4] = "https://youtu.be/s4thQcgLCqk";
        time.text[4] = "The art of doing twice as much in half the time";

        time.link[5] = "https://www.youtube.com/watch?v=29oN50olk6g&list=PLCOFxn51URkctPTXYpFuIt7S8h3Ud9UrQ&index=4";
        time.text[5] = "Creating a Master Weekly Schedule";



        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, time.text);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Uri uri = Uri.parse(time.link[position]); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }

        });
    }
}
