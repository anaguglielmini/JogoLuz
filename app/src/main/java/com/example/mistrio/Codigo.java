package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Codigo extends AppCompatActivity {

    TextView txtErrado;
    EditText txtcod;
    Button btnconfirmar;
    Button btnVoltar2;

    int cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codigo);

        txtErrado = findViewById(R.id.txtErrado);
        txtcod = findViewById(R.id.txtcod);
        btnconfirmar = findViewById(R.id.btnconfirmar);
        btnVoltar2 = findViewById(R.id.btnVoltar2);

    }
    public void confirmar(View view) {
        //String codigo = txtcod.getText().toString();

        cod = Integer.parseInt(txtcod.getText().toString());
        if (cod == 423 /*&& codigo.isEmpty()*/) {
            Intent intent = new Intent(this, FimJogo.class);
            startActivity(intent);

        }
        else{
            txtErrado.setVisibility(View.VISIBLE);
        }
    }
    public void voltar2(View view){
        Intent intent = new Intent(this, Tela_final.class);
        startActivity(intent);
    }
}
