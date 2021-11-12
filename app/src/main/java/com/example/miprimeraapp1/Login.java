package com.example.miprimeraapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login2);

        Button btn1 = (Button) findViewById(R.id.btnIniciarSesion);//Aqui lo redireccionara a otra ventana para realizar las donaciones

    }


    public void abrirDonaciones(View view) {
        Intent i = new Intent(this, Donaciones.class);

        startActivity(i);

    }
}