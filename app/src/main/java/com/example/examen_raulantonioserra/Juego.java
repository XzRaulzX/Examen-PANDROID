package com.example.examen_raulantonioserra;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

public class Juego extends AppCompatActivity {
    TextView turno;
    TextView tiempo;
    TextView ficha;
    int fichadecidida;
    ImageButton Casilla1;
    ImageButton Casilla2;
    ImageButton Casilla3;
    ImageButton Casilla4;
    ImageButton Casilla5;
    ImageButton Casilla6;
    ImageButton Casilla7;
    ImageButton Casilla8;
    ImageButton Casilla9;
    ImageButton CasillaComprobacion;
    ImageButton[] listaBotones;
    Random aleatorio = new Random();
    int simbolo;
    int[] CasillasPulsadas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juego);
        turno = findViewById(R.id.txtTurno);
        tiempo = findViewById(R.id.txtTiempo);
        ficha = findViewById(R.id.txtFicha);
        //Llamamos a todos los botones y cuando clickemos en uno de ellos pasara a la funcion init una posicion para la litaBotones
        //Identificando que boton estamos pulsando
        CasillaComprobacion = findViewById(R.id.btnComprobacion);
        Casilla1 = findViewById(R.id.btnCasilla1);
        Casilla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Casilla2 = findViewById(R.id.btnCasilla2);
        Casilla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Casilla3 = findViewById(R.id.btnCasilla3);
        Casilla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Casilla4 = findViewById(R.id.btnCasilla4);
        Casilla4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Casilla5 = findViewById(R.id.btnCasilla5);
        Casilla5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Casilla6 = findViewById(R.id.btnCasilla6);
        Casilla6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Casilla7 = findViewById(R.id.btnCasilla7);
        Casilla7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(6);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Casilla8 = findViewById(R.id.btnCasilla8);
        Casilla8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(7);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Casilla9 = findViewById(R.id.btnCasilla9);
        Casilla9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    init(8);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        listaBotones = new ImageButton[]{Casilla1, Casilla2, Casilla3, Casilla4, Casilla5, Casilla6, Casilla7, Casilla8, Casilla9};
        DecideFichaJugador();
    }


    public void tiempoTurno() throws InterruptedException {
        int a = aleatorio.nextInt(7000);
        tiempo.setText(String.valueOf(a / 1000));
        Thread.sleep(a);
    }

    public void DecideFichaJugador() {
        simbolo = aleatorio.nextInt(1);
        if (simbolo == 0) {
            ficha.setText("Circulo");
            fichadecidida = 0;
        } else {
            ficha.setText("Equis");
            fichadecidida = 1;
        }
    }

    public void PonerFichaIA() throws InterruptedException {
        tiempoTurno();
        int b = aleatorio.nextInt(8);
        System.out.println(b);
        if(listaBotones[b].getResources()==CasillaComprobacion.getResources()){
            if (fichadecidida == 1) {
                listaBotones[b].setImageResource(R.drawable.circulo);
            } else {
                listaBotones[b].setImageResource(R.drawable.equis);
            }
        }



}


    public void init(int numero) throws InterruptedException {
        if(listaBotones[numero].getResources()==CasillaComprobacion.getResources()){
            if (fichadecidida == 1) {
                listaBotones[numero].setImageResource(R.drawable.equis);
                System.out.println("equis pintada");
            } else {
                listaBotones[numero].setImageResource(R.drawable.circulo);
                System.out.println("circulo pintada");
            }

            PonerFichaIA();
        }
        else{
            Toast.makeText(this, "Pulsa una casilla vacia", Toast.LENGTH_SHORT).show();
        }




    }
}
