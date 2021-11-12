package com.example.miprimeraapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Donaciones extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "Ha Iniciado Sesión Correctamente", Toast.LENGTH_SHORT).show();//Validar por que no sale el mensaje en pantalla
        setContentView(R.layout.activity_donaciones);
        ImageButton btn3;
    }

    //Metodo para los botones
    public void BtnDonacionAlimento(View view) {
        Toast.makeText(this, "Texto de prueba", Toast.LENGTH_SHORT).show();

    }
    public void BtnDonacionDinero(View view) {
        Toast.makeText(this, "Aqui podras realizar donaciones en efectivo o por tarjeta.", Toast.LENGTH_SHORT).show();

    }
    public void BtnDonacionRopa(View view) {
        Toast.makeText(this, "Aqui podras realizar donaciones de ropa.", Toast.LENGTH_SHORT).show();

    }
    public void BtnDonacionJuguetes(View view) {
        Toast.makeText(this, "Aqui podras realizar donaciones de juguetes.", Toast.LENGTH_SHORT).show();

    }
    public void MenuPrincipal(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}