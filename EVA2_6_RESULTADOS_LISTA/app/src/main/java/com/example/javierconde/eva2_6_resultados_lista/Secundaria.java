package com.example.javierconde.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Secundaria extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lstwResta;
    Intent iDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        lstwResta = findViewById(R.id.lstwResta);
        //CREAR ADAPTAADOR
        //ASIGNAR ADAPTADOR
        lstwResta.setAdapter(
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, Datos.sResta)
        );
        //ASIGNAR LISTENER
        lstwResta.setOnItemClickListener(this);
        iDatos = getIntent();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        iDatos.putExtra("RESTAURANTE",i);
        setResult(Activity.RESULT_OK,iDatos);
        finish();
    }
}
