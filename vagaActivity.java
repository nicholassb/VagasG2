package com.example.ramonsl.myjobs;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class vagaActivity extends AppCompatActivity {

    TextView textLinguagem;
    TextView txtSalario;
    TextView txtVaga;
    TextView txtEmpresa;
    TextView txtBanco;
    TextView txtExperiencia;
    TextView txtdescricao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaga);

        txtBanco = findViewById(R.id.Banco);
        txtdescricao = findViewById(R.id.Descricao);
        txtEmpresa = findViewById(R.id.Empresa);
        txtSalario = findViewById(R.id.Vaga);
        txtExperiencia = findViewById(R.id.Experiencia);
        txtVaga = findViewById(R.id.Vaga);




    }

}
