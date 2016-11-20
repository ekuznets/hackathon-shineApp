package com.example.eugene.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class optionsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String message = getIntent().getStringExtra("NAME");
        TextView frontText = (TextView) findViewById(R.id.FrontText);
        frontText.setText("Hello, " + message + "!\n You can continue with:");
        getSupportActionBar().setTitle("Main Menu");
    }
    public void startTest(View view) {
        Intent intent = new Intent(this, TakingTestActivity.class);
        startActivity(intent);
    }

    public void showResources(View view) {
        Intent intent = new Intent(this, LinksActivity.class);
        startActivity(intent);
    }

    public void aboutUs(View view) {
        Intent intent = new Intent(this, aboutUsActivity.class);
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        finish();
        return true;
    }

}
