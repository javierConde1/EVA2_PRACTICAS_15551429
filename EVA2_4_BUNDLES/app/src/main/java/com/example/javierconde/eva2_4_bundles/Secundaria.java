package com.example.javierconde.eva2_4_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
TextView txtDatos;
Intent inDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtDatos = findViewById(R.id.txtDatos);
        inDatos = getIntent();
        Bundle bDatos = inDatos.getExtras();
        txtDatos.append("NOMBRE: " + bDatos.getString("NOMBRE"));
        txtDatos.append("APELLIDO: " + bDatos.getString("APELLIDO"));
        txtDatos.append("EDAD: " + bDatos.getInt("EDAD"));
        if(bDatos.getBoolean("LABORA")){
            txtDatos.append("SI TRABAJA");
            txtDatos.append("SALARIO: " + bDatos.getDouble("SALARIO"));
        }else
            txtDatos.append("ESTA DE SANGANO");
        
    }
}
