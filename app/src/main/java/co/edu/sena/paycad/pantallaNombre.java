package co.edu.sena.paycad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class pantallaNombre extends AppCompatActivity {

    private EditText etNombre, etSaldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_nombre);

        etNombre = findViewById(R.id.etNombre);

        etSaldo = findViewById(R.id.etSaldo);



    }

    public void siguiente(View view){

        Bundle bundle = getIntent().getExtras();

        //Pasa a String el dato o valor asociado a la clave dirección
        int codigoActual = bundle.getInt("codigo");

        int saldo1 = Integer.parseInt(etSaldo.getText().toString());

        Intent intent = new Intent(this, IngresoCode.class);

        intent.putExtra("codigo", codigoActual);
        intent.putExtra("nombre", etNombre.getText().toString());
        intent.putExtra("saldo",saldo1);

        startActivity(intent);


    }
}