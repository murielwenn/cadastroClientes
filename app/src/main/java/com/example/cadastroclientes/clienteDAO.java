package com.example.cadastroclientes;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class clienteDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public clienteDAO(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Cliente cliente){
        ContentValues values = new ContentValues();
        values.put("nome", cliente.getNome());
        values.put("valor", cliente.getValor());
        return banco.insert("cliente", null, values);
    }
}
