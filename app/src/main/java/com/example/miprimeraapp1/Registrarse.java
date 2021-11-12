package com.example.miprimeraapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        Button btn = (Button) findViewById(R.id.btnContactanos);
        ImageButton btn3;
    }
    public void abrirContactanos(View view){
        Intent i = new Intent(this, Contactanos.class);
        startActivity(i);
    }

    public void MenuPrincipal(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


    /**public void volver(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }*/
}