package com.example.carroselimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int[] images = {
        R.drawable.cachorro,
        R.drawable.gardem,
        R.drawable.happy,
        R.drawable.patinho,
        R.drawable.porquinho
    };
    ImageView imagens;
    int posicao = 0;
    Button btnDireita, btnEsquerda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagens = findViewById(R.id.imagens);
        btnDireita = findViewById(R.id.btnDireita);
        btnEsquerda = findViewById(R.id.btnEsquerda);
        imagens.setImageResource(images[posicao]);

        btnDireita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posicionaImagem(false);
            }
        });

        btnEsquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                posicionaImagem(true);
            }
        });
    }
    private void posicionaImagem(boolean ehEsquerda){
        //true -1
        //false +1
        if (ehEsquerda==true){
            if(posicao==0){
                posicao=5;
            }
            posicao--;

        }else{
            if (posicao==4){
                posicao=-1;
            }
            posicao++;
        }
        imagens.setImageResource(images[posicao]);
    }



}