package com.example.mistrio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void instrucao(View view){
        Intent intent = new Intent(this, InstrucoesActivity.class);
        startActivity(intent);
    }
    public void cozinhando(View view){
        Intent intent = new Intent(this, CozinhandoActivity.class);
        startActivity(intent);
    }
}
