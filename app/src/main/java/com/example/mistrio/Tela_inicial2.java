package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Tela_inicial2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
    }
    public void instrucao(View view){
        Intent intent = new Intent(this, InstrucoesActivity.class);
        startActivity(intent);
    }
    public void cozinhandofinal(View view){
        Intent intent = new Intent(this, CozinhandoFinal.class);
        startActivity(intent);
    }
    public void pais(View view){
        Intent intent = new Intent(this, Pais.class);
        startActivity(intent);
    }
}

