package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BatataDica extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase1_dica);
    }

    public void fechar(View view) {
        Intent intent = new Intent(this, CozinhandoActivity.class);
        startActivity(intent);
    }
}


