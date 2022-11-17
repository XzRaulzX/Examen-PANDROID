package com.example.examen_raulantonioserra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Instrucciones extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instrucciones);

    }

    public void start(View view) {
        Intent entrar=new Intent(this, Juego.class);
        startActivity(entrar);

    }
}
