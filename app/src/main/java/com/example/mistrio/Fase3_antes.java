package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Fase3_antes extends AppCompatActivity {
    Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase3_antes);

        btnContinuar = findViewById(R.id.btnProximo2);
    }
    public void continuar(View view) {
        Intent intent = new Intent(this, Fase3.class);
        startActivity(intent);
    }
}
