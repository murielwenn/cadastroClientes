package com.example.cadastroclientes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nome;
    private EditText valor;
    private clienteDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nome = findViewById(R.id.txtNome);
        valor = findViewById(R.id.txtValor);
        dao = new clienteDAO(this);
    }

    public void salvar(View view){
        Cliente a = new Cliente();
        a.setNome(nome.getText().toString());
        a.setValor(valor.getText().toString());
        long id = dao.inserir(a);
        Toast.makeText(this, "Cliente inserido com id: " + id, Toast.LENGTH_SHORT).show();

    }
}