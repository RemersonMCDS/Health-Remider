package com.example.healthremiderrebuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class areaDcadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area_cadastro);
    }

    public void voltarTareaCadastro(View view) {
        Intent intent = new Intent(this, SegundaTela.class);
        startActivity(intent);
    }
}