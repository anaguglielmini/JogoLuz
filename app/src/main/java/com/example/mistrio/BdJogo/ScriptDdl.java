package com.example.mistrio.BdJogo;

public class ScriptDdl {
    public static String GetCreateTableUsuario(){

        StringBuilder sql = new StringBuilder();
        String sqlString =
                "";
        sqlLines = sqlString.split('/n');
        for(int i=0; i<sqlLines.length;i++){
            sql.append(sqlLines[i]);
        }
        sql.append(" Create Table if not exists Usuario (");
        sql.append(" Nome varchar(35) primary key not null default (''),");
        sql.append(" Idade int not null default ('') )");

        return sql.toString();

    }
}
