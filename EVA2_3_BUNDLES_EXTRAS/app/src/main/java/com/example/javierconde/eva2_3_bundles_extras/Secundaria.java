package com.example.javierconde.eva2_3_bundles_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
Button btnSecu;
TextView txtNom;
Intent inLeer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtNom = findViewById(R.id.txtNom);
        inLeer = getIntent();
        txtNom.setText(inLeer.getStringExtra("MENSAJE"));
    }

    public void Secundaria(View view) {

        finish();
    }
}
