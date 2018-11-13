package com.example.javierconde.eva2_9_permisos;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
Button button;
EditText editText;
Intent inLlamar;
final int PERMISO_LLAMAS = 100;
boolean bBande = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},PERMISO_LLAMAS);
        }else {
            bBande= true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == PERMISO_LLAMAS){
            if((grantResults.length > 0) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)){

            }
        }
    }

    public void onClick(View view) {
        if(bBande) {
            String sTel = "tel:" + editText.getText().toString();
            inLlamar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
            startActivity(inLlamar);
        }else{
            Toast.makeText(this,"no puedes llamar",Toast.LENGTH_SHORT).show();
        }
    }
}
