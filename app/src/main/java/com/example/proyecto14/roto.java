package com.example.proyecto14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class roto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roto);
    }
    public void regresar (View view){
        Intent c = new Intent(this,MainActivity.class);
        startActivity(c);
    }
}