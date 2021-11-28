package com.example.miprimeraapp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Registrarse extends AppCompatActivity {

    EditText txt_nombre, txt_email, txt_password;
    Button btnRegistrar;
    FirebaseFirestore mFirestore;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        txt_nombre = findViewById(R.id.txt_nombre);
        txt_email = findViewById(R.id.txt_email);
        txt_password = findViewById(R.id.txt_password);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        mFirestore = FirebaseFirestore.getInstance();
        auth = FirebaseAuth.getInstance();

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = txt_email.getText().toString();
                String contraseña = txt_password.getText().toString();
                registrar(email, contraseña);
                limpiarPantalla();
            }
        });

        Button btn = (Button) findViewById(R.id.btnContactanos);
        Button btn1 = (Button) findViewById(R.id.btnRegistrar);
        ImageButton btn3;
    }

    private void registrar(String email, String contraseña){

        auth.createUserWithEmailAndPassword(email, contraseña).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    String id = auth.getCurrentUser().getUid();

                    Map<String, Object> usuario = new HashMap<>();

                    usuario.put("nombre", txt_nombre.getText().toString());
                    usuario.put("email", txt_email.getText().toString());
                    usuario.put("contraseña", txt_password.getText().toString());

                    mFirestore.collection("Usuarios").document(id).set(usuario).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(Registrarse.this,"Usuario registrado", Toast.LENGTH_SHORT).show();
                            }else {
                                Toast.makeText(Registrarse.this,"Fallo", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

    }

    private void limpiarPantalla(){

        txt_nombre.setText("");
        txt_email.setText("");
        txt_password.setText("");
    }

    public void abrirContactanos(View view){
        Intent i = new Intent(this, Contactanos.class);
        startActivity(i);
    }

    public void MenuPrincipal(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void MenuLogin(View view){
        Intent i = new Intent(this, Login.class);
        startActivity(i);

    }



    /**public void volver(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }*/
}