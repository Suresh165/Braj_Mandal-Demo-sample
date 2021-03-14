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

import com.example.braj_mandal.mathura.Jaigurudev;
import com.example.braj_mandal.mathura.Janmabhoom;
import com.example.braj_mandal.mathura.dwarkadhish;
import com.example.braj_mandal.mathura.gita_mandir;

public class Mathura extends AppCompatActivity {

    private LinearLayout l_Janmabhoom,l_dwarkadhish,l_gita_mandir,l_Jaigurudev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathura);

        l_Janmabhoom = findViewById(R.id.Janmabhoom);
        l_dwarkadhish = findViewById(R.id.dwarkadhish);
        l_gita_mandir = findViewById(R.id.gita_mandir);
        l_Jaigurudev = findViewById(R.id.Jaigurudev);

        l_Janmabhoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mathura.this, Janmabhoom.class);
                Toast.makeText(Mathura.this, "Welcome to Janmabhoom", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        l_dwarkadhish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mathura.this, dwarkadhish.class);
                Toast.makeText(Mathura.this, "Welcome to  dwarkadhish", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        l_gita_mandir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mathura.this, gita_mandir.class);
                Toast.makeText(Mathura.this, "Welcome to gita_mandir", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        l_Jaigurudev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mathura.this, Jaigurudev.class);
                Toast.makeText(Mathura.this, "Welcome to Jaigurudev", Toast.LENGTH_SHORT).show();
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
                Intent intent = new Intent(Mathura.this, MainActivity.class);
                Toast.makeText(this, "This is Braj Mandal", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}