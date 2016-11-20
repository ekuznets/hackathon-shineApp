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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_links);
        getSupportActionBar().setTitle("Links for you <3");

        // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);


        banana.link = new String[5];
        banana.text = new String[5];
        banana.link[0] = "http://www.cmha.ca/mental-health/understanding-mental-illness";
        banana.text[0] = "Understanding Mental Illnesses";
        banana.link[1] = "http://www.cmha.ca/mental_health/mental-health-meter/#.WDCkzNUrKpp";
        banana.text[1] = "Mental Health Meter";

        // Defined Array values to show in ListView
//        String[] values = new String[] {
//                "Understanding Mental Illnesses"
//        };
//
//        String[] links = new String[] {
//                "http://www.cmha.ca/mental-health/understanding-mental-illness/"
//        };


        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, banana.text);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                //String  itemValue    = (String) listView.getItemAtPosition(position);

                Uri uri = Uri.parse(banana.link[itemPosition]); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                // Show Alert
//                Toast.makeText(getApplicationContext(),
//                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
//                        .show();

            }

        });
    }
    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }
}
