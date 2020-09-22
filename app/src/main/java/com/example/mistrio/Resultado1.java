package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado1 extends AppCompatActivity {
    Button btnVoltar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result1);

        btnVoltar4 = findViewById(R.id.btnVoltar4);
    }
    public void voltar4(View view){
        Intent intent = new Intent(this, Tela_final.class);
        startActivity(intent);
    }
}