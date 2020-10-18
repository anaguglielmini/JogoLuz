package com.example.mistrio;

public class Jogador {

    int codigo;
    String apelido;
    int idade;
    int tempo;

    public Jogador(String apelido, String idade) {

    }

    public Jogador(int _codigo, String _apelido, int _idade, int _tempo) {
        this.codigo = _codigo;
        this.apelido = _apelido;
        this.idade = _idade;
        this.tempo = _tempo;
    }

    public Jogador(String _apelido, int _idade, int _tempo) {
        this.apelido = _apelido;
        this.idade = _idade;
        this.tempo = _tempo;
    }

    public Jogador() {

    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}

