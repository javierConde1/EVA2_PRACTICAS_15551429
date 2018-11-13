package com.example.javierconde.eva2_4_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements CheckBox.OnCheckedChangeListener{
 EditText txtNom, txtApe, txtEdad, txtSal;
 CheckBox cbLab;
 RadioGroup rdgSexo;
 TextView twSal;
 RadioButton rdMas, rdFem, rdOtro;
 Button btnSec;
 Intent iEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtNom = findViewById(R.id.txtNom);
        txtApe = findViewById(R.id.txtApe);
        txtEdad = findViewById(R.id.txtEdad);
        txtSal = findViewById(R.id.txtSal);
        cbLab = findViewById(R.id.cbLab);

        twSal = findViewById(R.id.twSal);
        rdgSexo = findViewById(R.id.rdgSexo);

        btnSec = findViewById(R.id.btnSec);
        cbLab.setOnCheckedChangeListener(this);

        iEnviar = new Intent(this,Secundaria.class);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        txtSal.setEnabled(cbLab.isChecked());
        twSal.setEnabled(cbLab.isChecked());
    }

    public void OnClick(View view) {
        String sNom = txtNom.getText().toString();
        String sApe = txtApe.getText().toString();
        int iEdad = Integer.parseInt(String.valueOf(txtEdad.getText()));
        boolean bLabora = cbLab.isChecked();
        double dSal = Double.parseDouble(txtSal.getText().toString());
        int iSel = rdgSexo.getCheckedRadioButtonId();
        int iGen;
        if(iSel == R.id.rdMas)
            iGen = 1;
        else if(iSel == R.id.rdFem)
            iGen = 2;
        else
            iGen = 3;

        Bundle bBundle = new Bundle();
        bBundle.putString("NOMBRE", sNom);
        bBundle.putString("APELLIDO", sApe);
        bBundle.putInt("EDAD", iEdad);
        bBundle.putBoolean("LABORA", bLabora);
        bBundle.putDouble("SALARIO", dSal);
        bBundle.putInt("GENERO", iGen);
        iEnviar.putExtras(bBundle);
        startActivity(iEnviar);
    }
}
