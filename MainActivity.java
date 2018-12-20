package com.example.ramonsl.myjobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Categoria> categorias = new ArrayList<>();

        categorias.add(new Categoria("PRESENCIAL",
                R.drawable.));
        categorias.add(new Categoria("REMOTA",
                R.drawable.));

        final CategoriaAdapter adapter = new CategoriaAdapter(this, categorias);
        ListView lista = (ListView) findViewById(R.id.);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i) {
                    case 0:
                        final Intent intentSalgados = new Intent(getApplicationContext(), .class);
                        startActivity(intentSalgados);
                        break;


                }
            }
        });

    }
}
