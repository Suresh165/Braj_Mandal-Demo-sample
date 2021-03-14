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
import com.example.braj_mandal.nandgaon.Nandbaba;
import com.example.braj_mandal.nandgaon.pawan_sarovar;

public class Nandgaon extends AppCompatActivity {

    private LinearLayout l_Nandbaba,l_pawan_sarovar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandgaon);

        l_Nandbaba = findViewById(R.id.Nandbaba);
        l_pawan_sarovar = findViewById(R.id.pavana_sarovara);

        l_Nandbaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nandgaon.this, Nandbaba.class);
                Toast.makeText(Nandgaon.this, "Welcome to Nandgaon", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        l_pawan_sarovar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nandgaon.this, pawan_sarovar.class);
                Toast.makeText(Nandgaon.this, "Welcome to pawan_sarovar", Toast.LENGTH_SHORT).show();
                startActivity(intent);
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
                Intent intent = new Intent(Nandgaon.this, MainActivity.class);
                Toast.makeText(this, "This is Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}