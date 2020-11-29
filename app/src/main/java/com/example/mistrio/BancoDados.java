package com.example.mistrio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BancoDados extends SQLiteOpenHelper {

    private  static final int VERSAO_BANCO = 1;
    private  static final String BANCO_JOGADOR = "bd_jogador";/*BANCO_CLIENTE = BANCO_JOGADOR*/

    private  static final String TABELA_JOGADOR = "tb_jogadores";

    private  static final String COLUNA_CODIGO = "codigo";
    private  static final String COLUNA_NOME = "nome";
    private  static final String COLUNA_IDADE = "idade";

    public BancoDados(@Nullable Context context) {
        super(context, BANCO_JOGADOR, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String QUERY_COLUNA = "CREATE TABLE " + TABELA_JOGADOR + "("
                + COLUNA_CODIGO + " INTEGER PRIMARY KEY, " + COLUNA_NOME + " TEXT, " +
                COLUNA_IDADE + " TEXT)";

        db.execSQL(QUERY_COLUNA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /*CRUD*/

    void addJogador (Jogador jogador){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUNA_NOME, jogador.getNome());
        values.put(COLUNA_IDADE, jogador.getIdade());

        db.insert(TABELA_JOGADOR, null, values);
        db.close();
    }

    Jogador selecionarJogador(int codigo){

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABELA_JOGADOR, new String[]{COLUNA_CODIGO,
                        COLUNA_NOME, COLUNA_IDADE}, COLUNA_CODIGO + " = ?",
                new String[] {String.valueOf(codigo)}, null, null, null, null);


        if(cursor != null){
            cursor.moveToFirst();
        }

        return new Jogador(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getInt(2));
    }

    void atualizaJogador (Jogador jogador){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COLUNA_NOME, jogador.getNome());
        values.put(COLUNA_IDADE, jogador.getIdade());

        db.update(TABELA_JOGADOR, values, COLUNA_CODIGO + " = ?",
                new String[] {String.valueOf(jogador.getCodigo())});
        db.close();
    }

    public List<Jogador> listaTodosJogadores(){
        List<Jogador> listaJogadores = new ArrayList<>();
        String query = "SELECT * FROM " + TABELA_JOGADOR;
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor j = db.rawQuery(query, null);

        if(j.moveToFirst()){
            do{
                Jogador jogador = new Jogador();
                jogador.setCodigo(Integer.parseInt(j.getString(0)));
                jogador.setNome(j.getString(1));
                jogador.setIdade(j.getInt(2));

                listaJogadores.add(jogador);
            }while(j.moveToNext());
        }
        return  listaJogadores;
    }
}
