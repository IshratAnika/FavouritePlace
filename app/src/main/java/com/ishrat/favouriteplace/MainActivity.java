package com.ishrat.favouriteplace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //button object declarition
    Button btnSajek, btnSaintMartin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link to java object with design button
        btnSaintMartin = findViewById(R.id.btn_saintmartin);
        btnSajek = findViewById(R.id.btn_sajek);

        btnSaintMartin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SaintMartinActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Saint Martin", Toast.LENGTH_SHORT).show();
            }

        });
        btnSajek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SajekActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Sajek", Toast.LENGTH_SHORT).show();
            }

        });
    }

}



