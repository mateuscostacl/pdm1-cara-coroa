package com.example.pdm1_cara_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] moeda = new String[]{"cara", "coroa"};
    LinearLayout llFaces;
    ImageView ivCara;
    ImageView ivCoroa;
    ImageView ivJogada;
    ImageView ivSelecionada;
    Button btJogar;
    Button btLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conectarComViewport();
    }

    private void conectarComViewport() {
        llFaces = findViewById(R.id.ll_faces);
        ivCara = findViewById(R.id.iv_moeda_cara);
        ivCoroa = findViewById(R.id.iv_moeda_coroa);
        ivJogada = findViewById(R.id.iv_jogada);
        btJogar = findViewById(R.id.bt_jogar);
        btLimpar = findViewById(R.id.bt_limpar);

        btJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogar();
            }
        });

        btLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limpar();
            }
        });

        ivCara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecionar(view);
            }
        });

        ivCoroa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selecionar(view);
            }
        });
    }

    private void selecionar(View view) {
        ivSelecionada = (ImageView) view;
        ivSelecionada.setElevation(0.3f);
        Util.mostrarUmaMensagem_Toast(
                getBaseContext(),
                "Você selecionou " + ivSelecionada.getTag().toString());
    }

    private void jogar() {
        String face = moeda[Util.random(moeda.length)];
//        ImageView ivSorteada = llFaces.findViewWithTag(face);

        String msg = "";

        if(face.equalsIgnoreCase("cara")) {
            ivJogada.setImageResource(R.drawable.img_moeda_cara);
        }
        if(face.equalsIgnoreCase("coroa")) {
            ivJogada.setImageResource(R.drawable.img_moeda_coroa);
        }

        if(face.equalsIgnoreCase(ivSelecionada.getTag().toString()))
            Util.mostrarUmaMensagem_Toast(getBaseContext(),"Acertou!!!");
        else
            Util.mostrarUmaMensagem_Toast(getBaseContext(),"Errou!!!");
    }

    private void limpar() {
        ivJogada.setImageResource(R.drawable.img_moeda_limpa);
    }
}