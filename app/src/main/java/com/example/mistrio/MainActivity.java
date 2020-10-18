package com.example.mistrio;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnComo;
    Button btnComeco;
    EditText txtApelido;
    EditText txtIdade;
    ListView listViewPontuacao;

    BancoDados db = new BancoDados(this);

    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPontuacao = findViewById(R.id.listViewPontuacao);
        btnComo = findViewById(R.id.btnComo);
        btnComeco = findViewById(R.id.btnComeco);
        txtApelido = findViewById(R.id.txtApelido);
        txtIdade = findViewById(R.id.txtIdade);

        /*TESTE DO CRUD*/
        // insert ok
        db.addJogador(new Jogador("Ana Luiza", 16, 30));

        // Toast.makeText(MainActivity.this, "Salvo com sucesso", Toast.LENGTH_LONG).show();
    }


     /*btnComeco.setOnclickListener(new View.OnClickListener(){
        @Override
        public void comeco(View view){
            Global.cronometro = new Cronometro();
            Global.cronometro.Start(System.currentTimeMillis());
            Intent intent = new Intent(this, Fase1.class);
            startActivity(intent);

        }
    });*/

    public void como(View view) {
        Intent intent = new Intent(this, ComoActivity.class);
        startActivity(intent);
    }

    public void comeco(View v) {

        String apelido = txtApelido.getText().toString();
        String idade = txtIdade.getText().toString();

        if (apelido.isEmpty()){
            txtApelido.setError("Este campo é obrigatório");
        }
        else if (0<1){
            //insert
            db.addJogador(new Jogador(apelido, idade));
            Global.cronometro = new Cronometro();
            Global.cronometro.Start(System.currentTimeMillis());

            Intent intent = new Intent(this, Fase1.class);
            startActivity(intent);

            listarJogadores();
        } else{
            //update
        }



       /* int x = new Random().nextInt(3);
        if (x == 1) {*/
                        }

    public void listarJogadores(){

        /*List<Jogador> jogadores = db.listaTodasPontuacoes();

        arrayList = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);

        listViewPontuacao.setAdapter(adapter);

        for(Jogador j : jogadores){
            //Log.d("Tempos", "/nID:" + j.getCodigo() + " Nome: " + j.getApelido());
            arrayList.add(j.getCodigo() + "-" + j.getApelido() + "-" + j.getTempo());
            adapter.notifyDataSetInvalidated();
        }*/
    }
}

        /*if (x == 2) {
            Intent intent = new Intent(this, Fase2.class);
            startActivity(intent);
        }

        if (x == 3) {
            Intent intent = new Intent(this, Fase3_antes.class);
            startActivity(intent);
        }
    }*/



