package com.example.examen_raulantonioserra;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

public class Juego extends AppCompatActivity {
    TextView turno;
    TextView tiempo;
    TextView ficha;
    ImageButton Casilla1;
    ImageButton Casilla2;
    ImageButton Casilla3;
    ImageButton Casilla4;
    ImageButton Casilla5;
    ImageButton Casilla6;
    ImageButton Casilla7;
    ImageButton Casilla8;
    ImageButton Casilla9;
    ImageButton[] listaBotones;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego);
        Casilla1=findViewById(R.id.btnCasilla1);
        Casilla2=findViewById(R.id.btnCasilla2);
        Casilla3=findViewById(R.id.btnCasilla3);
        Casilla4=findViewById(R.id.btnCasilla4);
        Casilla5=findViewById(R.id.btnCasilla5);
        Casilla6=findViewById(R.id.btnCasilla6);
        Casilla7=findViewById(R.id.btnCasilla7);
        Casilla8=findViewById(R.id.btnCasilla8);
        Casilla9=findViewById(R.id.btnCasilla9);

        listaBotones= new ImageButton[]{Casilla1, Casilla2, Casilla3, Casilla4,Casilla5,Casilla6,Casilla7,Casilla8,Casilla9};

    }

    public void init(View view){

    }

    public void tiempoTurno(){
        Random R= new Random()
        Thread.sleep();
    }
}
