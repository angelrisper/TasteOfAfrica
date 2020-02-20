package com.example.cookandgo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Regions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regions);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button north_africa= findViewById(R.id.north_africa);
        north_africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button west_africa=findViewById(R.id.west_africa);
        west_africa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
      Button south_africa=findViewById(R.id.south_africa);
      south_africa.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

          }
      });
      Button east_africa=findViewById(R.id.east_africa);
      east_africa.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              
          }
      });
    }

}
