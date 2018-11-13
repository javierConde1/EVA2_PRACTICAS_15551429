package com.example.javierconde.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
TextView txtwResta, txtTotal;
Intent iResta, inOrden;
final int LISTA_RESTA = 100;
final int ORDEN = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtwResta = findViewById(R.id.txtwResta);
        txtTotal = findViewById(R.id.txtTotal);
        iResta = new Intent(this, Secundaria.class);
        inOrden = new Intent(this,Orden.class);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == LISTA_RESTA){
            if(resultCode == Activity.RESULT_OK){
                int iResta = data.getIntExtra("RESTAURANTE", 0);
                txtwResta.setText(Datos.sResta[iResta]);
            }
        }else if(requestCode == ORDEN){
            if(resultCode == Activity.RESULT_OK){
                double dTotal= data.getIntExtra("TOTAL", 0);
                txtTotal.setText("$" + dTotal);
            }
        }
    }

    public void Click(View v) {
        startActivityForResult(iResta,LISTA_RESTA);
    }

    public void Precio(View view) {
        startActivityForResult(inOrden,ORDEN);
    }
}
