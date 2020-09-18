package com.example.mistrio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.mistrio.R.id.btndicaBatata;
import static com.example.mistrio.R.id.imgbtn1;

public class CozinhandoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fase1);

        ImageButton batata = findViewById(imgbtn1);
        Button dicabatata = findViewById(R.id.btndicaBatata);

        batata.setOnClickListener(Fase1Listener);
        dicabatata.setOnClickListener(Fase1Listener);
    }

    private int x = 0;
    private View.OnClickListener Fase1Listener = new View.OnClickListener() {
        public void onClick(View b) {

            switch (b.getId()) { // b de batata
                case imgbtn1:
                    x++;
                    if (x > 2) {
                        setContentView(R.layout.fase1_parte2);
                    }
                    break;

                case btndicaBatata:
                    setContentView(R.layout.fase1_dica);
                    break;

                default:
                    break;
            }
        }
    };
}

