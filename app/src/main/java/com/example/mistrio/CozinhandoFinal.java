package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CozinhandoFinal extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase1_parte2);
    }
    public void voltarmain2(View view){
        Intent intent = new Intent(this, Tela_inicial2.class);
        startActivity(intent);
    }
}
