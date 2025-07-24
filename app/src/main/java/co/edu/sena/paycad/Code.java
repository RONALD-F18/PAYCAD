package co.edu.sena.paycad;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class Code extends AppCompatActivity {

    private TextView tvCod, tvTemp;

    private int contador = 10;

    private int codigoActual;

    private Handler handler = new Handler();

    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        tvCod = findViewById(R.id.tvCod);
        tvTemp = findViewById(R.id.tvTemp);

        generarNuevoCodigo();

        runnable = new Runnable() {
            @Override
            public void run() {


                if (contador == 0) {

                    generarNuevoCodigo();

                    contador = 10;

                } else {

                    contador -= 1;

                }

                tvTemp.setText(contador + "s");


                handler.postDelayed(this, 1000);
            }

        };
        handler.post(runnable);


    }

    public void siguiente(View view) {

        Intent intent = new Intent(this, pantallaNombre.class);
        intent.putExtra("codigo", codigoActual);
        startActivity(intent);

    }

    public void generarNuevoCodigo() {

        codigoActual = new Random().nextInt(90000) + 10000;

        tvCod.setText(String.valueOf(codigoActual));

    }
}

