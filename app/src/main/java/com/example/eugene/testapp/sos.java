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

public class sos extends AppCompatActivity {
    private resourcesPair SOS = new resourcesPair();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);
        SOS.link = new String[4];
        SOS.text = new String[4];



        SOS.link[0] = "http://www.sfu.ca/students/health/contact-us.html";
        SOS.text[0] = "SFU Health & Counselling Services";

        SOS.link[1] = "http://wctr.sfss.ca/womens-centre/about-the-centre";
        SOS.text[1] = "SFU Women's Centre";

        SOS.link[2] = "http://www.lib.sfu.ca/about/branches-depts/slc/contact";
        SOS.text[2] = "SFU Student Learning Commons";

        SOS.link[3] = "http://ooc.sfss.ca/staff";
        SOS.text[3] = "Out on Campus";

        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, SOS.text);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Uri uri = Uri.parse(SOS.link[position]); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }

        });
    }
}
