package com.example.javierconde.eva2_5_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtwPrincipal;
    Intent iLanzar;
    final int DAROS_SECUNDARIA = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtwPrincipal = findViewById(R.id.txtwPrincipal);
        iLanzar = new Intent(this,Secundaria.class);
    }

    public void Prin(View v) { //INTENTO, requestCode
        startActivityForResult(iLanzar, DAROS_SECUNDARIA);
    }

    @Override                       //indentificar act , respuesta -OK -CANCEL, INTENTO
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == DAROS_SECUNDARIA) {//indentificar que actticidad esta mandando , PUEDEN SER VARIAS
            if(resultCode== Activity.RESULT_OK) {
                //AQUI EJECUTAN ALGUNA ACCION
                String sCade = data.getStringExtra("RESULTADO");
                txtwPrincipal.setText(sCade);
            }
        }

    }
}
