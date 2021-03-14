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

import com.example.braj_mandal.mathura.dwarkadhish;
import com.example.braj_mandal.vrindavan.Banke_Bihari;
import com.example.braj_mandal.vrindavan.Nidhivan;
import com.example.braj_mandal.vrindavan.prem_mandir_vrindavan;
import com.example.braj_mandal.vrindavan.shri_rangji;

public class vrindawan extends AppCompatActivity {
    private LinearLayout l_banke_bihari_mandir,l_prem_mandir_vrindavan,l_Nidhivan,l_shri_rangji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrindawan);

        l_banke_bihari_mandir = findViewById(R.id.banke_bihari_mandir);
        l_prem_mandir_vrindavan = findViewById(R.id.prem_mandir_vrindavan);
        l_Nidhivan = findViewById(R.id.nidhivan_temple);
        l_shri_rangji = findViewById(R.id.shri_rangji);

        l_banke_bihari_mandir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vrindawan.this, Banke_Bihari.class);
                Toast.makeText(vrindawan.this, "Welcome to Vrindavan", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });

        l_prem_mandir_vrindavan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vrindawan.this, prem_mandir_vrindavan.class);
                Toast.makeText(vrindawan.this, "Welcome to prem_mandir_vrindavan", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });

        l_Nidhivan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vrindawan.this, Nidhivan.class);
                Toast.makeText(vrindawan.this, "Welcome to Nidhivan", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });

        l_shri_rangji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vrindawan.this, shri_rangji.class);
                Toast.makeText(vrindawan.this, "Welcome to shri_rangji", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
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
                Intent intent = new Intent(vrindawan.this, MainActivity.class);
                Toast.makeText(this, "This is Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}