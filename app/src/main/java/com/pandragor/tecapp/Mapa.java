package com.pandragor.tecapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mapa extends AppCompatActivity {

    Button mDireccion;
    Button mMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        mDireccion=findViewById(R.id.Direccion);
        mMapa=findViewById(R.id.Mapa);

        mDireccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDireccion();
            }
        });

        mMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMapa();
            }
        });


    }

    private void goToMapa() {
        Intent intent = new Intent (Mapa.this,GoogleMap.class);
        startActivity(intent);
    }

    private void goToDireccion() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/TecNM+Campus+Iztapalapa+III/@19.336655,-98.9865149,370m/data=!3m2!1e3!4b1!4m5!3m4!1s0x85ce1d66790d48ab:0x511207a1a7a61918!8m2!3d19.3366535!4d-98.9858642?hl=es-419"));
        startActivity(intent);
    }
}