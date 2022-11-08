package com.example.aula02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tNome, tIdade;
    private EditText eNome, eIdade;
    private Button bEnviar;
    private Intent tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela1);

        eNome = (EditText)findViewById(R.id.txtNome);
        eIdade = (EditText)findViewById(R.id.txtIdade);
        bEnviar = (Button)findViewById(R.id.btnEnviar);

        tela = new Intent(this, Tela2.class);

        bEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String nome = eNome.getText().toString();
                String idade = eIdade.getText().toString();

                tela.putExtra("nome",nome);
                tela.putExtra("idade",idade);

                startActivity(tela);
            }
        });
    }
}