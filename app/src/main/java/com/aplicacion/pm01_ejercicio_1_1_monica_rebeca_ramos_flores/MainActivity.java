package com.aplicacion.pm01_ejercicio_1_1_monica_rebeca_ramos_flores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	EditText num1, num2;
    Button Suma, Resta, Division, Multiplicacion;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		num1 = (EditText) findViewById(R.id.txtPrimero);
		num2 = (EditText) findViewById(R.id.txtSegundo);
		Suma = (Button) findViewById(R.id.btnSuma);
		Resta = (Button) findViewById(R.id.btnResta);
		Division = (Button) findViewById(R.id.btnDivision);
		Multiplicacion = (Button) findViewById(R.id.btnMultiplicacion);
    }

	public void Sumar(View view){
		int n1 = Integer.parseInt(num1.getText().toString());
		int n2 = Integer.parseInt(num2.getText().toString());
		int Suma = n1+n2;
		result(Suma);
	}

	public void Restar(View view){
		int n1 = Integer.parseInt(num1.getText().toString());
		int n2 = Integer.parseInt(num2.getText().toString());
		int Resta = n1-n2;
		result(Resta);
	}

	public void Dividir(View view){
		int n1 = Integer.parseInt(num1.getText().toString());
		int n2 = Integer.parseInt(num2.getText().toString());
		if (n2==0){
			Toast.makeText(this, "No se puede dividir entre 0",Toast.LENGTH_SHORT).show();
		}
		int Division = n1/n2;
		result(Division);
	}

	public void Multiplicar(View view){
		int n1 = Integer.parseInt(num1.getText().toString());
		int n2 = Integer.parseInt(num2.getText().toString());
		int Multiplicacion = n1*n2;
		result(Multiplicacion);
	}

	private void result(Integer valor) {
		Intent i = new Intent(this, MainActivity2.class);
		i.putExtra("dato", valor);
		startActivity(i);
	}
}