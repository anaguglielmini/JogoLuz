package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado3 extends AppCompatActivity {
    Button btnVoltar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result3);

        btnVoltar6 = findViewById(R.id.btnVoltar6);
    }
    public void voltar6(View view){
        Intent intent = new Intent(this, Tela_final.class);
        startActivity(intent);
    }
}
