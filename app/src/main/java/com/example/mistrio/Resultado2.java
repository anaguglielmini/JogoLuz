package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado2 extends AppCompatActivity {
    Button btnVoltar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result2);

        btnVoltar5 = findViewById(R.id.btnVoltar5);
    }
    public void voltar5(View view){
        Intent intent = new Intent(this, Tela_final.class);
        startActivity(intent);
    }
}
