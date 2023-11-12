package com.example.healthremiderrebuild;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimeiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira_tela);
    }
    public void Acessar(View view) {
        //linha para o botão "Acessar"
        Intent intent = new Intent(this, SegundaTela.class);
        //linha para ir dessa para a segunda tela quando o botão for pressionado
        startActivity(intent);
    }
}