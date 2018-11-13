package com.example.javierconde.eva2_3_bundles_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
Intent inSecundaria;
EditText txtNom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inSecundaria = new Intent(this, Secundaria.class);
        txtNom = findViewById(R.id.txtNom);
    }

    @Override
    public void startActivity(Intent intent) {
        String sCade = txtNom.getText().toString();
        inSecundaria.putExtra("MENSAJE",sCade);
        super.startActivity(inSecundaria);
    }

    public void Principal(View view) {
        String sCade = txtNom.getText().toString();
        inSecundaria.putExtra("MENSAJE",sCade);
        super.startActivity(inSecundaria);
    }
}
