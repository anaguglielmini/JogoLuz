package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FimJogo extends AppCompatActivity {


    private Chronometer chronometer;
    private boolean running;
    private long pauseOffset;
    Button btnRejogar;

    public FimJogo() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fim_jogo);

        btnRejogar = findViewById(R.id.btnRejogar);
        final TextView time = findViewById(R.id.cronometro);
        long secs = Global.cronometro.Stop() / 1000;
        time.setText(Long.toString(secs) + " s");
    }

    public void rejogar(View view){
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

