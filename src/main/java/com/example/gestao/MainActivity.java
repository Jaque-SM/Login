package com.example.gestao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText login = findViewById(R.id.login);
        EditText senha = findViewById(R.id.senha);

        Button ab = findViewById(R.id.entrar);

       ab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               mostrar_tudo(login, senha);

           }
       });
}
    public void mostrar_tudo(EditText login, EditText senha){

        String nome1 = login.getText().toString();
        String nome2 = senha.getText().toString();

        if (nome1.equals("jaque") && nome2.equals("123")) {
            Intent avu = new Intent(MainActivity.this, MainActivity2.class);
            avu.putExtra("login",  nome1);
            avu.putExtra("senha", nome2);
            startActivity(avu);

        }
        else {
            Toast.makeText(getApplicationContext(), "Credenciais incorretas!", Toast.LENGTH_SHORT).show();
        }

    }


}