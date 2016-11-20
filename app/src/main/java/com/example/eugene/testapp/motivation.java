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

public class motivation extends AppCompatActivity {
    private resourcesPair motivate = new resourcesPair();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);

        motivate.link = new String[3];
        motivate.text = new String[3];

        motivate.link[0] = "http://www.lifehack.org/389944/15-motivational-quotes-to-help-you-keep-going-when-times-are-tough?ref=mail&mtype=daily_newsletter&mid=20160503_customized&uid=871421&action=click";
        motivate.text[0] = "Life Hacks";

        motivate.link[1] = "https://youtu.be/mgmVOuLgFB0";
        motivate.text[1] = "Why Do We Fall";

        motivate.link[2] = "https://youtu.be/6kxSrPD__BA";
        motivate.text[2] = "Never give up by Nick Vujicic";


        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, motivate.text);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        // ListView Item Click Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Uri uri = Uri.parse(motivate.link[position]); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }

        });
    }
}
