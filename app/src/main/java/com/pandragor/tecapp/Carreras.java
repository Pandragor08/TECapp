package com.pandragor.tecapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Carreras extends AppCompatActivity {


    Button minformatica;
    Button mGestion;
    Button mCivil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carreras);
        minformatica=findViewById(R.id.informa);
        mGestion=findViewById(R.id.gestion);
        mCivil=findViewById(R.id.civil);

        minformatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTowebInf();
            }
        });


        mGestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTowebGes();
            }
        });

        mCivil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTowebCivil();
            }
        });

    }

    //estos son metodos para poder ir a la pagina web del tec

    private void goTowebCivil() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://iztapalapa3.tecnm.mx/ofertaedu/civil.html"));
        startActivity(intent);

    }

    private void goTowebGes() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://iztapalapa3.tecnm.mx/ofertaedu/gestion.html"));
        startActivity(intent);
    }

    private void goTowebInf() {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://iztapalapa3.tecnm.mx/ofertaedu/informatica.html"));
       startActivity(intent);
    }
}