package com.example.proyecto14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void yes (View view){
        Intent i = new Intent(this,corazon.class);
        startActivity(i);
    }
    public void no (View view){
        Intent b = new Intent(this,roto.class);
        startActivity(b);
    }
}