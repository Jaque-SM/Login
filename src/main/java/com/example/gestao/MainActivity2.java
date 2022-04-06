package com.example.gestao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras=getIntent().getExtras();

        String login= extras.getString("login");
        String senha1= extras.getString("senha");

        TextView meu=findViewById(R.id.login);
        TextView nova=findViewById(R.id.senha);

        meu.setText("Login: "+login);
        nova.setText("Senha: "+senha1);


    }
}
