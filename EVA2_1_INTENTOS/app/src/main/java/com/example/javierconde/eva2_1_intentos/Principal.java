package com.example.javierconde.eva2_1_intentos;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    EditText txtTel;
    Intent inMarcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtTel = findViewById(R.id.txtTel);

    }

    public void onClick(View view) {
        String sTel = txtTel.getText().toString();
        sTel = "tel:" + sTel; //ACCION          ,   DATOS
        inMarcar = new Intent(Intent.ACTION_DIAL, Uri.parse(sTel));
        //EJECUTAR INTENTO
        //QUIEREN UNA RESPUESTA O NO
        startActivity(inMarcar);

    }
    public void onClickLLamar(View view) {
        String sTel = txtTel.getText().toString();
        sTel = "tel:" + sTel; //ACCION          ,   DATOS
        inMarcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
        //EJECUTAR INTENTO
        //QUIEREN UNA RESPUESTA O NO
        startActivity(inMarcar);

    }
    public void onClickWeb(View view) {

        inMarcar = new Intent(Intent.ACTION_WEB_SEARCH);
        inMarcar.putExtra(SearchManager.QUERY,"TACOS");
        //EJECUTAR INTENTO
        //QUIEREN UNA RESPUESTA O NO
        startActivity(inMarcar);

    }
}
