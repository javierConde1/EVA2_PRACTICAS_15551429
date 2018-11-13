package com.example.javierconde.eva2_5_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Secundaria extends AppCompatActivity {
    EditText txtSecundaria;
    Intent iSecundaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        txtSecundaria = findViewById(R.id.txtSecundaria);
        iSecundaria = getIntent();

    }

    public void Sec(View v) {
        String sCade = txtSecundaria.getText().toString();
        iSecundaria.putExtra("RESULTADO", sCade);
        setResult(Activity.RESULT_OK,iSecundaria);
        finish();
    }
}
