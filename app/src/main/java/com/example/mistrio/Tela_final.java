package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Tela_final extends AppCompatActivity {
    Button btnCozinhando;
    Button btnPais;
    Button btnDio;
    Button btnCod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_final);

        btnCozinhando = findViewById(R.id.btn1);
        btnPais = findViewById(R.id.btn2);
        btnDio = findViewById(R.id.btn3);
        btnCod = findViewById(R.id.btn4);
    }

    public void cozinhando(View view) {
        Intent intent = new Intent(this, Resultado1.class);
        startActivity(intent);
    }
    public void pais(View view) {
        Intent intent = new Intent(this, Resultado2.class);
        startActivity(intent);
    }
    public void sol(View view) {
        Intent intent = new Intent(this, Resultado3.class);
        startActivity(intent);
    }
    public void codigo(View view) {
        Intent intent = new Intent(this, Codigo.class);
        startActivity(intent);
    }
}
