package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dica2 extends AppCompatActivity {
    Button btnFechar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dica2);

        btnFechar2 = findViewById(R.id.btnFechar2);
    }
    public void fechar2(View view){
        Intent intent = new Intent(this, Fase2.class);
        startActivity(intent);
    }
}