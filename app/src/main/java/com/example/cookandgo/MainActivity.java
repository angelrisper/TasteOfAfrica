package com.example.cookandgo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        Button select_regions = findViewById(R.id.select_regions);
        select_regions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_activity_regions=new Intent(getApplicationContext(),Regions.class);
                startActivity(start_activity_regions);
            }
        });
    }

}
