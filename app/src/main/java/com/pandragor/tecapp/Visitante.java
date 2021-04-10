package com.pandragor.tecapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Visitante extends AppCompatActivity {
Button mConvocatoria;
Button mCarrera;
Button mMapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitante);
        mConvocatoria=findViewById(R.id.Convocatoria);
        mCarrera=findViewById(R.id.Carrera);
        mMapa=findViewById(R.id.Mapa);


        mMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMapa();
            }
        });

        mCarrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCarrera();
            }
        });


        mConvocatoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoConvocatoria();
            }
        });
    }

    private void gotoMapa() {
        Intent intent = new Intent(Visitante.this,Mapa.class);
        startActivity(intent);

    }

    private void gotoCarrera() {
        Intent intent = new Intent(Visitante.this,Carreras.class);
        startActivity(intent);
    }

    private void gotoConvocatoria() {
        Intent intent = new Intent(Visitante.this,Convocatoria.class);
        startActivity(intent);
    }
}