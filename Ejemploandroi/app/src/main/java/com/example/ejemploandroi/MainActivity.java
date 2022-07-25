package com.example.ejemploandroi;

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

    public void Vista2(View view){
        Intent Botonvista2 = new Intent( this,Vista2.class);
        startActivity(Botonvista2);

    }

}