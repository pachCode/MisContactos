package com.arturopacheco.miscontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        contactos = new ArrayList();
        contactos.add(new Contacto("Benito","123456789","benito@email.com"));
        contactos.add(new Contacto("Mariana","123123","mariana@email.com"));
        contactos.add(new Contacto("Juan Perez","35435345","juan@email.com"));
        contactos.add(new Contacto("Luis Lopez","54645645","luis@email.com"));

        ArrayList<String> nombres = new ArrayList<String>();

        for (Contacto contacto:contactos ) {
            nombres.add(contacto.getNombre());

        }

        ListView listViewContactos = (ListView) findViewById(R.id.listViewContactos);
        listViewContactos.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1,nombres));

    }
}
