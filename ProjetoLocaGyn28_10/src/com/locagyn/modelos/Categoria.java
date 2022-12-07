/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

/**
 *
 * @author Aluno
 */
public class Categoria{
    private int id = 0;
    private String descricao = "";
    private float valorLocacao = 0;
    
    public Categoria(){}
    
    public Categoria(int id, String descricacao, float valorLocacao){
    this.id = id;
    this.descricao = descricacao;
    this.valorLocacao = valorLocacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    
}
