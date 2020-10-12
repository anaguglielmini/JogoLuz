package com.example.mistrio.BdJogo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class JogoOpenHelper extends SQLiteOpenHelper {
    public JogoOpenHelper(Context context) {
        super(context, "Dados", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL( ScriptDdl.GetCreateTableUsuario() );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
