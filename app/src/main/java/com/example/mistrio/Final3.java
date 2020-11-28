package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Final3 extends AppCompatActivity {

    Button btncuriosidade;
    Button btncodigotela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase3_dio);

        btncuriosidade = findViewById(R.id.btncuriosidade);
        btncodigotela = findViewById(R.id.btncodigotela);
    }
    public void curiosidade(View view) {
        Intent intent = new Intent(this, Curiosidade.class);
        startActivity(intent);
    }
    public void localizacao(View view){
        Intent intent = new Intent(this, Localizacao.class);
        startActivity(intent);
    }
}

