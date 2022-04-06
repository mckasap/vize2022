package com.example.week2022_08_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cat siyam= new Cat("Duman");

        Intent mint= new Intent(MainActivity.this,SecondActivity.class);

        mint.putExtra("theCat",siyam);

        startActivity(mint);

    }
}