package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

public class FimJogo2 extends AppCompatActivity {
    private Chronometer chronometer;
    private boolean running;
    private long pauseOffset;
    Button btnRejogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fimjogo2);

        btnRejogar = findViewById(R.id.btnRejogar);
        /*chronometer = findViewById(R.id.cronometro);*/
    }
    public void rejogar(View view){
        /*chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;*/
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

