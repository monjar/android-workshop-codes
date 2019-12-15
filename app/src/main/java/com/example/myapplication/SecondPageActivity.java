package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondPageActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page_layout);

        Intent intent = getIntent();
        String str = intent.getStringExtra("Key");
        Log.i("EXTERA DATA", "i got: " + str);

        Button button = findViewById(R.id.buttonSecondPage);
        button.setText(str);
//        Intent intent = getIntent();
//        TextView tv = findViewById(R.id.taskPageName);
//        String string = intent.getStringExtra("taskName");
//
//        tv.setText(string);
    }
}
