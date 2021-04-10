package com.pandragor.tecapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button mRegister;
    Button mSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mRegister=findViewById(R.id.Register);
        mSesion=findViewById(R.id.Sesion);


        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRegister();
            }
        });
        mSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSesion();
            }
        });

    }

    private void goToSesion() {
        Intent intent = new Intent(LoginActivity.this,Sesion.class);
        startActivity(intent);
    }

    private void goToRegister() {
        Intent intent = new Intent(LoginActivity.this,Registro_Maestro.class);
        startActivity(intent);
    }
}