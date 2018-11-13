package com.example.javierconde.eva2_6_resultados_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Orden extends AppCompatActivity {
EditText edOrden, edPrecio;
Intent inDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orden);
        edOrden = findViewById(R.id.edOrden);
        edPrecio = findViewById(R.id.edPrecio);
        inDatos = getIntent();
    }

    public void ButtonClick(View v) {
        int iCant = Integer.parseInt(edOrden.getText().toString());
        double dPrecio = Double.parseDouble(edPrecio.getText().toString());
        inDatos.putExtra("TOTAL", (iCant*dPrecio));
        setResult(Activity.RESULT_OK, inDatos);
        finish();
    }
}
