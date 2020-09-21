package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Final2 extends AppCompatActivity {
    Button btnProximo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase2_final);

        btnProximo2 = findViewById(R.id.btnProximo2);
    }

    public void proximo2(View view) {
        Intent intent = new Intent(this, Fase3.class);
        startActivity(intent);
    }
}