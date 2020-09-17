package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.mistrio.R.id.btndicaBatata;
import static com.example.mistrio.R.id.btnvoltar1;
import static com.example.mistrio.R.id.imgbtn1;
import static com.example.mistrio.R.id.start;

public class CozinhandoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fase1);

        ImageButton batata = (ImageButton) findViewById(imgbtn1);
        Button voltar1 = (Button) findViewById(R.id.btnvoltar1);
        Button dicabatata = (Button) findViewById(R.id.btndicaBatata);

        batata.setOnClickListener((View.OnClickListener) this);
        voltar1.setOnClickListener((View.OnClickListener) this);
        dicabatata.setOnClickListener((View.OnClickListener) this);
    }
    private int x = 0;
    public void onClick(View b) {

        switch (b.getId()){
            case imgbtn1:
                x++;
                if(x>3){
                        Intent intent = new Intent(this, CozinhandoFinal.class);
                        startActivity(intent);
                }
                break;

            case btnvoltar1:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;

            case btndicaBatata:
                Intent intent2 = new Intent(this, BatataDica.class);
                startActivity(intent2);
                break;

            default:
                break;
        }
    }
}
