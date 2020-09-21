package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Curiosidade extends AppCompatActivity {

    Button btnVoltar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curiosidade);

        btnVoltar3 = findViewById(R.id.btnVoltar3);
    }
    public void voltar3(View view){
        Intent intent = new Intent(this, Final3.class);
        startActivity(intent);
    }
}
