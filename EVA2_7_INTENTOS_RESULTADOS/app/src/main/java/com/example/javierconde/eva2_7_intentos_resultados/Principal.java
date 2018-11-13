package com.example.javierconde.eva2_7_intentos_resultados;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
TextView lblResultados;
Intent inContactos;
Uri uContactos, uImagen;
Intent inImagen, iLlamar, iAbrir;
String sTel, sImg;
final int BUSCAR_CONTACTOS = 100;
final int BUSCAR_IMAGEN = 200;
final int LLAMAR = 300;
final int ABRIR = 400;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lblResultados = findViewById(R.id.lblResultados);
        uContactos = ContactsContract.Contacts.CONTENT_URI;
        uImagen = Uri.parse("content://media/external/images/media");
        inContactos = new Intent(Intent.ACTION_PICK, uContactos);
        inImagen = new Intent(Intent.ACTION_PICK, uImagen);
        sTel = lblResultados.getText().toString();
        sImg = lblResultados.getText().toString();

    }

    public void buscar_contacto(View view) {
        startActivityForResult(inContactos, BUSCAR_CONTACTOS);

    }

    public void buscar_imagen(View view) {
        startActivityForResult(inImagen,BUSCAR_IMAGEN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case BUSCAR_CONTACTOS:
                if (resultCode == Activity.RESULT_OK){
                    String sResultado = data.getDataString();
                    lblResultados.setText(sResultado);

                }
                break;
            case BUSCAR_IMAGEN:
                if (resultCode == Activity.RESULT_OK){
                    String sResultado = data.getDataString();
                    lblResultados.setText(sResultado);
                }
                break;
                default:
        }
    }

    public void llamar(View view) {
        iLlamar = new Intent(Intent.ACTION_CALL,Uri.parse(ContactsContract.CommonDataKinds.Phone.CONTACT_ID)  );
        startActivityForResult(iLlamar,LLAMAR);
    }


    public void Abrir(View view) {
        iAbrir = new Intent(Intent.ACTION_VIEW, Uri.parse(""+iAbrir));
        startActivityForResult(iAbrir,ABRIR);
    }
}
