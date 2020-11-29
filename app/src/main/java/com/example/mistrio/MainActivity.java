package com.example.mistrio;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnComo, btnComeco, btnSalvar;
    EditText editCodigo, txtApelido, txtIdade;
    ListView listViewJogadores;

    BancoDados db = new BancoDados(this);

    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComo = findViewById(R.id.btnComo);
        btnComeco = findViewById(R.id.btnComeco);
        btnSalvar = findViewById(R.id.btnSalvar);

        txtApelido = findViewById(R.id.txtApelido);
        txtIdade = findViewById(R.id.txtIdade);
        editCodigo = findViewById(R.id.editCodigo);

        listViewJogadores = findViewById(R.id.ListViewJogadores);

        ListarJogadores();

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = txtApelido.getText().toString();
                String codigo = editCodigo.getText().toString();
                int idade = Integer.parseInt(txtIdade.getText().toString());

                if (nome.isEmpty()) {
                    txtApelido.setError("Este campo é obrigatorio");
                } else if (codigo.isEmpty()) {
                    //insert
                    db.addJogador(new Jogador(nome, idade));
                    Toast.makeText(MainActivity.this, "Jogador adicionado", Toast.LENGTH_SHORT).show();

                } else {
                    db.atualizaJogador(new Jogador(Integer.parseInt(codigo), nome, idade));

                    Toast.makeText(MainActivity.this, "Jogador atualizado", Toast.LENGTH_SHORT).show();

                }
            }
        });

        listViewJogadores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String conteudo = (String) listViewJogadores.getItemAtPosition(position);

                String codigo = conteudo.substring(0, conteudo.indexOf("-"));
                Jogador jogador = db.selecionarJogador(Integer.parseInt(codigo));

                editCodigo.setText(String.valueOf(jogador.getCodigo()));
                txtApelido.setText(jogador.getNome());
                txtIdade.setText(jogador.getIdade());
            }
        });
    }

    public void ListarJogadores(){
        List <Jogador> jogadores = db.listaTodosJogadores();

        arrayList = new ArrayList<>();

        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        listViewJogadores.setAdapter(adapter);

        for(Jogador j  : jogadores){

            arrayList.add(j.getCodigo() + "-" + j.getNome() + "-" + j.getIdade() );
            adapter.notifyDataSetChanged();
        }


    }


    public void como(View view) {
        Intent intent = new Intent(this, ComoActivity.class);
        startActivity(intent);
    }

    public void comeco(View v) {

        if (1 > 0) {
                Global.cronometro = new Cronometro();
                Global.cronometro.Start(System.currentTimeMillis());

                Intent intent = new Intent(this, Fase1.class);
                startActivity(intent);
            }
        }
    }



