package com.example.mistrio;

import androidx.appcompat.app.AppCompatActivity;

public class Creditos extends AppCompatActivity {
    Button btnContinuar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fimjogo);

        btnContinuar2 = findViewById(R.id.btnContinuar2);
    }
    public void continuar2(View view){
        Intent intent = new Intent(this, FimJogo2.class);
        startActivity(intent);
    }
}
}
