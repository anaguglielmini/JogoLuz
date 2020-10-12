package com.example.mistrio;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mistrio.BdJogo.JogoOpenHelper;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button btnComo;
    Button btnComeco;

    private SQLiteDatabase conexao;
    private JogoOpenHelper jogoOpenHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComo = findViewById(R.id.btnComo);
        btnComeco = findViewById(R.id.btnComeco);

        criarConexao();
    }

    private void criarConexao(){
        try {
            jogoOpenHelper = new JogoOpenHelper(this);
            conexao = jogoOpenHelper.getWritableDatabase();

        }catch (SQLException ex){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Erro");
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }
    }

    public void como(View view) {
        Intent intent = new Intent(this, ComoActivity.class);
        startActivity(intent);
    }

    public void comeco(View view) {
        int x = new Random().nextInt(3);
        if (x == 1) {
            Intent intent = new Intent(this, Fase1.class);
            startActivity(intent);
        }

        if (x == 2) {
            Intent intent = new Intent(this, Fase2.class);
            startActivity(intent);
        }

        if (x == 3) {
            Intent intent = new Intent(this, Fase3_antes.class);
            startActivity(intent);
        }
    }
}


