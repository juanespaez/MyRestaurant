package com.upb.myrestuarant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirSedes(View v){

        Intent i;
        i = new Intent(this, MapsActivity.class);
        startActivity(i);

    }
    public void abrirMenu(View v){

        Intent x;
        x = new Intent(this, MenuActivity.class);
        startActivity(x);

    }
    public void abrirReserva (View v) {
        String numero = "+573015440140";
        String mensaje = "Hola, estoy interesado en hacer una reserva."; // Mensaje que quieres enviar
        String url = "https://api.whatsapp.com/send?phone=" + numero + "&text=" + Uri.encode(mensaje);
        PackageManager pm = getPackageManager();

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));

        if (i.resolveActivity(pm) != null) {
            startActivity(i);
        } else {
            Toast.makeText(this, "WhatsApp no está instalado", Toast.LENGTH_SHORT).show();
        }
    }
}