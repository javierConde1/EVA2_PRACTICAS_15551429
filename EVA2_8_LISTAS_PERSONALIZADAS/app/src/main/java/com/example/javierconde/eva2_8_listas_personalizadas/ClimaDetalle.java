package com.example.javierconde.eva2_8_listas_personalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaDetalle extends AppCompatActivity {
    ImageView imageView;
    TextView lblDetalle, lblTempD, lblDescD;
    Intent inDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima_detalle);
        imageView = findViewById(R.id.imageView);
        lblDetalle =findViewById(R.id.lblCiudad);
        lblTempD = findViewById(R.id.lblGrado);
        lblDescD = findViewById(R.id.lblEstado);
        inDatos = getIntent();

        imageView.setImageResource(iImage);
        lblDetalle.setText(sCiudad);
        lblTempD.setText(descripcion);
        lblDescD.setText(temperatura);
    }
}
