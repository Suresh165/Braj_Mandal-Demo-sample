package com.example.braj_mandal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private LinearLayout L_mathura,L_vrindawan,L_barsana,L_nandgaon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        L_mathura =  findViewById(R.id.mathura);
        L_vrindawan =  findViewById(R.id.vrindawan);
        L_barsana =  findViewById(R.id.barsana);
        L_nandgaon =  findViewById(R.id.nandgaon);


        L_mathura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Mathura.class);
                Toast.makeText(MainActivity.this, "Welcome to Mathura", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_vrindawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,vrindawan.class);
                Toast.makeText(MainActivity.this, "Welcome to Vrindavan", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_barsana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Barsana.class);
                Toast.makeText(MainActivity.this, "Welcome to Barsana", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });

        L_nandgaon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mathura = new Intent(MainActivity.this,Nandgaon.class);
                Toast.makeText(MainActivity.this, "Welcome to Nandgaon", Toast.LENGTH_SHORT).show();
                startActivity(mathura);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.home:
                Toast.makeText(this, "This is Braj Mandal", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}