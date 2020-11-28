package com.example.mistrio;

public class Jogador {

    int codigo;
    String nome;
    int idade;

    public Jogador(){}


    public Jogador(int _codigo, String _nome, int _idade){
        this.codigo = _codigo;
        this.nome = _nome;
        this.idade = _idade;
    }

    public Jogador( String _nome, int _idade){
        this.nome = _nome;
        this.idade = _idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}


