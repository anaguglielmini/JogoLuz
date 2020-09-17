package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InstrucoesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instrucoes);
    }
        public void voltarinicio(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}