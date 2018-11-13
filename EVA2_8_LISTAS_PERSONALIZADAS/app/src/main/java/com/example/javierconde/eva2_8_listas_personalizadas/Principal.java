package com.example.javierconde.eva2_8_listas_personalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener{
    Clima[] aCiudades = {
            new Clima ("CHIHUAHUA",10,"NUBLADO",R.drawable.cloudy),
            new Clima ("DELICIAS",40,"NUBLADO",R.drawable.sunny),
            new Clima ("CHIHUAHUA",20,"NUBLADO",R.drawable.rainy),
            new Clima ("CHIHUAHUA",10,"NUBLADO",R.drawable.cloudy),
            new Clima ("CHIHUAHUA",50,"NUBLADO",R.drawable.sunny),
            new Clima ("CHIHUAHUA",18,"NUBLADO",R.drawable.rainy)
    };
    ListView lsrwClima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lsrwClima = findViewById(R.id.lsrwClima);
        lsrwClima.setAdapter(
                new WeatherAdapter(this, Layout)
        );
        inDatos = new Intent(this,ClimaDetalle.class);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //inDetalle.putExtra()

    }
}
