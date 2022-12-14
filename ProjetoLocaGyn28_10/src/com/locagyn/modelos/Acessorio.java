/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author Aluno
 */
public class Acessorio {
    private int idLocacao = 0;
    private String Descricao = "";
    private float ValorLocacao = 0;

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int idLocacao) {
        this.idLocacao = idLocacao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getValorLocacao() {
        return ValorLocacao;
    }

    public void setValorLocacao(float ValorLocacao) {
        this.ValorLocacao = ValorLocacao;
    }

    @Override
    public String toString() {
        return idLocacao + ";" + Descricao + ";" + ValorLocacao;
    }
    
    
}
