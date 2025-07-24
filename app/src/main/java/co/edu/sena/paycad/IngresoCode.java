package co.edu.sena.paycad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IngresoCode extends AppCompatActivity {

    private TextView tvSaludo;

    private EditText etVerificar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_code);

        tvSaludo = findViewById(R.id.tvSaludo);

        etVerificar = findViewById(R.id.etVerificar);

        Bundle bundle = getIntent().getExtras();

        //Pasa a String el dato o valor asociado a la clave dirección
        String nombre = bundle.getString("nombre");

        tvSaludo.setText(tvSaludo.getText().toString() + nombre);

    }

    public void siguiente(View view){

        Bundle bundle = getIntent().getExtras();

        //Pasa a String el dato o valor asociado a la clave dirección

        String nombre2 = bundle.getString("nombre");

        int codigoActual = bundle.getInt("codigo");

        int saldo2 = bundle.getInt("saldo");

        int nuevoValor = Integer.parseInt(etVerificar.getText().toString());

        if(nuevoValor == codigoActual){

            Toast.makeText(this, "CODIGO CORRECTO", Toast.LENGTH_LONG).show();

            Intent intent2 = new Intent(this, Home.class);

            intent2.putExtra("nombre2", nombre2);

            intent2.putExtra("saldo2", saldo2);

            startActivity(intent2);

        } else {

            Toast.makeText(this, "CODIGO INCORRECTO", Toast.LENGTH_LONG).show();

        }





    }

    public void obtenerNuevoCodigo (View view){

        Intent intent = new Intent(this, Code.class);

        startActivity(intent);


    }
}