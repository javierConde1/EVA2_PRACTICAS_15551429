package com.example.javierconde.eva2_2_intentos_explicito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    Button btnSecu;
    Intent inLanzarSecundario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnSecu = findViewById(R.id.btnSecu);

        inLanzarSecundario = new Intent(this,Secundaria.class);

    }


    public void onClick(View view) {
        startActivity(inLanzarSecundario);
    }
}
