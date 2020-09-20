package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Fase1 extends AppCompatActivity {
    Button btnDica1;
    ImageButton btnBatata;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase1);

        btnDica1 = findViewById(R.id.btnDica1);
        btnBatata = findViewById(R.id.btnBatata);
    }

    public void dica(View view) {
        Intent intent = new Intent(this, Dica1.class);
        startActivity(intent);
    }

    public void pure(View view) {
        x++;
        if (x > 2) {
            Intent intent = new Intent(this, Final1.class);
            startActivity(intent);
        }
    }
}