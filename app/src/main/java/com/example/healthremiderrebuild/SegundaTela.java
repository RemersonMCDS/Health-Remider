package com.example.healthremiderrebuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);
    }

    public void cadastrarPaciente(View view) {
        //linha para o botão "Cadastrar Paciente"
        Intent intent = new Intent(this, areaDcadastro.class);
        //linha para ir dessa para a terceira tela quando o botão for pressionado
        startActivity(intent);
    }

    public void verPacientes(View view) {
        Intent intent = new Intent(this, MeusPacientes.class);
        startActivity(intent);
    }

    public void VoltarT2(View view) {
        Intent intent = new Intent(this, PrimeiraTela.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}