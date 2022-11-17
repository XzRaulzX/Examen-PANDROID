package com.example.examen_raulantonioserra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText usuario;
    EditText contraseña;
    String contraseñaC="1234";
    String usuarioC="Raul";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        usuario=findViewById(R.id.edtUsuario);
        contraseña=findViewById(R.id.edtContraseña);

    }

    public void iniciar(View view) {
        if(usuario.getText().toString().equals(usuarioC) && contraseña.getText().toString().equals(contraseñaC)){
            Intent intento1= new Intent(this, Instrucciones.class);
            intento1.putExtra("usuario",usuario.getText().toString());
            startActivityForResult(intento1,0);

        }else{
            Toast.makeText(this, "Contraseña o usuario incorrectas, Intentelo de nuevo", Toast.LENGTH_SHORT).show();
        }
    }


}