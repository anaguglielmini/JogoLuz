package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FimJogo extends AppCompatActivity {
    Button btnContinuar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fim_jogo);

        btnContinuar2 = findViewById(R.id.btnContinuar2);
    }
    public void continuar2(View view){
        Intent intent = new Intent(this, FimJogo2.class);
        startActivity(intent);
    }
}
