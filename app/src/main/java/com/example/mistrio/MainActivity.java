package com.example.mistrio;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnComo;
    Button btnComeco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComo = findViewById(R.id.btnComo);
        btnComeco = findViewById(R.id.btnComeco);
    }

    public void como(View view) {
        Intent intent = new Intent(this, ComoActivity.class);
        startActivity(intent);
    }

    public void comeco(View view) {
        Intent intent = new Intent(this, Fase1.class);
        startActivity(intent);
    }
}
