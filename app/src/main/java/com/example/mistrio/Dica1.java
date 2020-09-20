package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dica1 extends AppCompatActivity {
    Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dica1);

        btnFechar = findViewById(R.id.btnFechar);
    }
    public void fechar(View view){
        Intent intent = new Intent(this, Fase1.class);
        startActivity(intent);
    }
}
