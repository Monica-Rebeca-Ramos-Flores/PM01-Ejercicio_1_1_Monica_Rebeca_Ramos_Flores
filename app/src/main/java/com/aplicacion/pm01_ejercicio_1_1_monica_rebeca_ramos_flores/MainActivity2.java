package com.aplicacion.pm01_ejercicio_1_1_monica_rebeca_ramos_flores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRespuesta = (TextView)findViewById(R.id.txtRespuesta);

        String dato = getIntent().getStringExtra( "dato");
        txtRespuesta.setText("El resultado es " + dato);

    }
    //Metodo para el boton Regresar
    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}