package com.example.week2022_08_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);




       Cat sym= (Cat) getIntent().getExtras().get("theCat");

        Toast.makeText(this, sym.sayMyName(),Toast.LENGTH_SHORT).show();

    }
}