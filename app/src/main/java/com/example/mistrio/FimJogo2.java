package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FimJogo2 extends AppCompatActivity {
    Button btnRejogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fimjogo2);

        btnRejogar = findViewById(R.id.btnRejogar);
    }
    public void rejogar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

