package com.example.ramonsl.myjobs;

import java.io.Serializable;

public class vaga implements Serializable {

    public String linguagem;
    public String salario;
    public String vaga;
    public String empresa;
    public String banco;
    public String experiencia;
    public String descricao;

    public vaga(String linguagem, String salario, String vaga, String empresa, String banco, String experiencia, String descricao) {
        this.linguagem = linguagem;
        this.salario = salario;
        this.vaga = vaga;
        this.empresa = empresa;
        this.banco = banco;
        this.experiencia = experiencia;
        this.descricao = descricao;


    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}