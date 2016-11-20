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

public class emotion extends AppCompatActivity {
    private resourcesPair emotionall = new resourcesPair();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion);
        emotionall.link = new String[4];
        emotionall.text = new String[4];

        emotionall.link[0] = "http://www.sfu.ca/healthycampuscommunity/learningenvironments/WLE/services_supports.html";
        emotionall.text[0] = "Support tools for being stress";

        emotionall.link[1] = "http://www.sfu.ca/content/dam/sfu/students/health/pdf/WellnessGuide/v3.pdf";
        emotionall.text[1] = "SFU Wellness Wheel";

        emotionall.link[2] = "http://www.sfu.ca/students/health/resources/wellness/wellnessquiz.html";
        emotionall.text[2] = "SFU Wellness Wheel (Quiz)";

        emotionall.link[3] = "http://www.cmha.ca/mental-health/your-mental-health/";
        emotionall.text[3] = "Suggestions for to keep the balance";

        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, emotionall.text);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Uri uri = Uri.parse(emotionall.link[position]); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }

        });
    }
}
