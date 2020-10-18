package com.example.mistrio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class BancoDados<List> extends SQLiteOpenHelper {

    private static final int VERSAO_BANCO = 1;
    private static final String BANCO_JOGADOR= "bd_jogador";

    private static final String TABELA_JOGADOR= "tb_jogador";

    private static final String COLUNA_CODIGO= "codigo";
    private static final String COLUNA_APELIDO= "apelido";
    private static final String COLUNA_IDADE= "idade";
    private static final String COLUNA_TEMPO= "tempo";

    public BancoDados(Context context) {
        super(context, BANCO_JOGADOR, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String QUERY_COLUNA = "CREATE TABLE " + TABELA_JOGADOR + "("
               + COLUNA_CODIGO + " INTEGER PRIMARY KEY, "
                + COLUNA_APELIDO + " TEXT, "
                + COLUNA_IDADE + " TEXT,"
                + COLUNA_TEMPO + " TEXT " + ")";

        db.execSQL(QUERY_COLUNA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /*CRUD ABAIXO*/

    void addJogador(Jogador jogador){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUNA_APELIDO, jogador.getApelido());
        values.put(COLUNA_IDADE, jogador.getIdade());
        values.put(COLUNA_TEMPO, jogador.getTempo());

        db.insert(TABELA_JOGADOR, null, values);
        db.close();
    }

    public java.util.List<Jogador> listaTodasPontuacoes(){
        java.util.List<Jogador> listaJogadores = new ArrayList<Jogador>();

        String query = "SELECT * FROM " + TABELA_JOGADOR;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor j = db.rawQuery(query, null);

        if(j.moveToFirst()){
            do{
                Jogador jogador = new Jogador();
                jogador.setCodigo(Integer.parseInt(j.getString(0)));
                jogador.setApelido(j.getString(1));
                jogador.setIdade(j.getInt(2));
                jogador.setTempo(j.getInt(3));

                listaJogadores.add(jogador);
            }while (j.moveToNext());
        }
        return listaJogadores;
    }
}
