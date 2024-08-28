package com.upb.myrestuarant;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MenuActivity extends ListActivity {

    private String [] categoriasProductos = new String []{"Entradas", "Platos fuertes", "Bebidas", "Postres"};
    private ListView listaCategorias = null;
    private ListAdapter adaptadorLista = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listaCategorias = findViewById(android.R.id.list);
        adaptadorLista = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,categoriasProductos);  // donde esta el contenido, com lo quiere sacar, contenido
        listaCategorias.setAdapter(adaptadorLista);
    }

    protected void onListItemClick(ListView lv, View v, int position, long id){
        super.onListItemClick(lv,v,position,id);
        if (position == 0){
            Intent x;
            x = new Intent(this, ProductoActivity.class);
            startActivity(x);
        }

        if (position == 1){
            Intent x;
            x = new Intent(this, PlatoFuerteActivity.class);
            startActivity(x);
        }
        if (position == 2){
            Intent x;
            x = new Intent(this, BebidasActivity.class);
            startActivity(x);
        }
        if (position == 3){
            Intent x;
            x = new Intent(this, PostresActivity.class);
            startActivity(x);
        }
        if (position == 4){
            Intent x;
            x = new Intent(this, ProductoActivity.class);
            startActivity(x);
        }

    }

}