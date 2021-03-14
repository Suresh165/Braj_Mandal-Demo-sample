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

public class Barsana extends AppCompatActivity {

    private LinearLayout l_kushal_bihari,l_Radha_Rani,l_Man_Ghar,l_Sri_Chitra_Sakhee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barsana);

        l_kushal_bihari = findViewById(R.id.kushal_bihari);
        l_Radha_Rani = findViewById(R.id.Radha_Rani);
        l_Man_Ghar = findViewById(R.id.Man_Ghar);
        l_Sri_Chitra_Sakhee = findViewById(R.id.Sri_Chitra_Sakhee);

        l_kushal_bihari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kushal = new Intent(Barsana.this,kushal_bihari.class);
                Toast.makeText(Barsana.this, "Welcome to Kushal bihari Temple", Toast.LENGTH_SHORT).show();
                startActivity(kushal);
                finish();
            }
        });

        l_Radha_Rani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kushal = new Intent(Barsana.this,Radha_Rani.class);
                Toast.makeText(Barsana.this, "Welcome to Radha_Rani Temple", Toast.LENGTH_SHORT).show();
                startActivity(kushal);
                finish();
            }
        });

        l_Man_Ghar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kushal = new Intent(Barsana.this,Man_Ghar.class);
                Toast.makeText(Barsana.this, "Welcome to Man_Ghar Temple", Toast.LENGTH_SHORT).show();
                startActivity(kushal);
                finish();
            }
        });

        l_Sri_Chitra_Sakhee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kushal = new Intent(Barsana.this,Sri_Chitra_Sakhee.class);
                Toast.makeText(Barsana.this, "Welcome to Sri_Chitra_Sakhee Temple", Toast.LENGTH_SHORT).show();
                startActivity(kushal);
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
                Intent intent = new Intent(Barsana.this, MainActivity.class);
                Toast.makeText(this, "This is Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}