package co.edu.sena.paycad;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {

    private TextView tvSaludar, tvVerSaldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvSaludar = findViewById(R.id.tvSaludar);
        tvVerSaldo = findViewById(R.id.tvVerSaldo);

        ejecutar();



    }

    public void salir (View view){

        finishAffinity();


    }

    public void ejecutar(){

        Bundle bundle = getIntent().getExtras();

        //Pasa a String el dato o valor asociado a la clave dirección

        String nombre2 = bundle.getString("nombre2");


        int saldo2 = bundle.getInt("saldo2");

        tvSaludar.setText(nombre2);

        tvVerSaldo.setText("$ "+ saldo2);


    }
}