package com.example.miprimeraapp1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.miprimeraapp1.databinding.ActivityLogin2Binding;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btnRegistrarse);
        Button btn1 = (Button) findViewById(R.id.btnIniciarSesion);
        Button btn2 = (Button) findViewById(R.id.btnEjemplos); //BOTON PARA EJEMPLOS ANTES DE PASAR A PRODUCCION
        ImageButton btn3;
        //btn3 = (ImageButton) findViewById(R.id.btnColaborApp);

        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
    }

    public void abrirRegistrar(View view){
        Intent i = new Intent(this,Registrarse.class);
        startActivity(i);
    }
    public void abrirSesion(View view){
        Intent i = new Intent(this, Login.class);
        startActivity(i);
    }
    public void abrirEjemplos(View view){
        Intent i = new Intent(this, Examples.class);
        startActivity(i);
    }
    public void MenuPrincipal(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
//EVENTOS
//View.OnLongClickListener [ESTE METODO ES CUANDO MANTENEMOS PRESIONADO EL BOTON]
/**@Override
public void onClick(View view) {
    Toast.makeText(this, "Redireccionando", Toast.LENGTH_SHORT).show();
}**///METODO PARA MOSTRAR MENSAJE UNA VEZ PRESIONE EL BOTON EN ESTE CASO REGISTRO