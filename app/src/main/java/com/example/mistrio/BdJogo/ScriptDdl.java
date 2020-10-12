package com.example.mistrio.BdJogo;

public class ScriptDdl {
    public static String GetCreateTableUsuario(){

        StringBuilder sql = new StringBuilder();

        sql.append(" Create Table if not exists Usuario (");
        sql.append(" Nome varchar(35) primary key not null default (''),");
        sql.append(" Idade int not null default ('') )");

        return sql.toString();

    }
}
