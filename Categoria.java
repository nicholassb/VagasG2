package com.example.ramonsl.myjobs;

public class Categoria {

    public String nome;
    public int imagem;

    public Categoria(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public int getImagem() {
        return imagem;
    }
}
