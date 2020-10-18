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

        listarJogadores();

        listViewPontuacao.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String conteudo = (String) listViewPontuacao.getItemAtPosition(position);

                Toast.makeText(FimJogo.this, "Posição " + conteudo, Toast.LENGTH_LONG).show();
                String codigo = conteudo.substring(0 , conteudo.indexOf("-"));

                Jogador jogador = (Jogador) db.listaTodasPontuacoes();

                txtApelido.setText(String.valueOf(jogador.getApelido()));
                txtIdade.setText(jogador.getIdade());
                time.setText(jogador.getTempo());
            }
        });
    }
    public void continuar2(View view){
        Intent intent = new Intent(this, FimJogo2.class);
        startActivity(intent);
    }

    public void listarJogadores(){

        List<Jogador> jogadores = db.listaTodasPontuacoes();

        arrayList = new ArrayList<String>();
        arrayList.add("beep");
        arrayList.add("boop");

        adapter = new ArrayAdapter<String>(FimJogo.this, android.R.layout.simple_list_item_1, arrayList);

        listViewPontuacao.setAdapter(adapter);

        for(Jogador j : jogadores){
            //Log.d("Tempos", "/nID:" + j.getCodigo() + " Nome: " + j.getApelido() + " Tempo: " + j.getTempo());
            arrayList.add(j.getCodigo() + " - " + j.getApelido() + " - " + j.getTempo()); //+ " - "j.getIdade()););
            adapter.notifyDataSetInvalidated();
        }
    }
}
