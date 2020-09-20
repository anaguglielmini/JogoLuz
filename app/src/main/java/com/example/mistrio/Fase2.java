package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Fase2 extends AppCompatActivity {
    ImageButton btnBelgica;
    Button btnDica2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase2);

        btnBelgica = findViewById(R.id.btnBelgica);
        btnDica2 = findViewById(R.id.btnDica2);
    }
    public void dica2(View view){
        Intent intent = new Intent(this, Dica2.class);
        startActivity(intent);
    }
    public void belgica(View view){
        Intent intent = new Intent(this, Final2.class);
        startActivity(intent);
    }
}