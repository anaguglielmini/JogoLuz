package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class FimJogo extends AppCompatActivity {

    Button btnContinuar2;
    ListView listViewPontuacao;
    EditText txtApelido;
    EditText txtIdade;

    BancoDados db = new BancoDados(this);

    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fim_jogo);

        listViewPontuacao = findViewById(R.id.listViewPontuacao);
        btnContinuar2 = findViewById(R.id.btnContinuar2);
        txtApelido = findViewById(R.id.txtApelido);
        txtIdade = findViewById(R.id.txtIdade);

        final TextView time = findViewById(R.id.cronometro);
        long secs = Global.cronometro.Stop() / 1000;
        time.setText(Long.toString(secs) + " s");
    }

        public void continuar2 (View view){
            Intent intent = new Intent(this, FimJogo2.class);
            startActivity(intent);
        }
    }

