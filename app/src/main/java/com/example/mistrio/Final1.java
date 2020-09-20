package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Final1 extends AppCompatActivity {
    Button btnProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase1_final);

        btnProximo = findViewById(R.id.btnProximo);
    }
    public void proximo(View view){
        Intent intent = new Intent(this, Fase2.class);
        startActivity(intent);
    }
}
