package com.example.eugene.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Welcome to Shine!");
    }
    /** Called when the user clicks the Send button */
    public void startMainMenu(View view) {
        Intent intent = new Intent(this, optionsActivity.class);
        EditText editText = (EditText) findViewById(R.id.userName);
        String message =  editText.getText().toString();
        if(message.isEmpty())
        {
            message = "Anonymous";
        }
        intent.putExtra("NAME", message);
        startActivity(intent);
    }
}
