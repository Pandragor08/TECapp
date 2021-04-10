package com.pandragor.tecapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button mMaestros;
    Button mAlumnos;;
    Button mbtnVisit;
    Button mFacebook;
    Button mIntagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnVisit=findViewById(R.id.Visit);
        mMaestros=findViewById(R.id.Maestros);
        mAlumnos=findViewById(R.id.Alumnos);
        mFacebook=findViewById(R.id.facebook);
        mIntagram=findViewById(R.id.intagram);


        mFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFacebook();
            }
        });

        mIntagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToInstagram();
            }
        });

        mAlumnos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMaestro();
            }
        });
        mMaestros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMaestro();
            }
        });

        mbtnVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToVisit();
            }
        });
/*
PARA PONER ICONO EN EL ACTION_BAR
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);*/

    }

    private void goToFacebook() {
        Intent intent= new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/itiztapalapa3"));
        startActivity(intent);
    }

    private void goToInstagram() {
      Intent intent=  new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/itiztapalapa3/?fbclid=IwAR3lEyYI74Q7X3ViWtWo5iPGFOU8GUz5BWtEQ8t2RiMR-IYzE76QvmjH3zc"));
      startActivity(intent);
    }

    private void goToMaestro() {
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    private void goToVisit() {
        Intent intent = new Intent(MainActivity.this,Visitante.class);
        startActivity(intent);
    }
}