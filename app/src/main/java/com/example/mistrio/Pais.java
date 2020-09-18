package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Pais extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fase2);
    }
    public void dicamapa(View view){
        Intent intent = new Intent(this, PaisDica.class);
        startActivity(intent);
    }

    public void belgica(View view){
        Intent intent=new Intent(this, PaisFinal.class);
        startActivity(intent);
    }
}
