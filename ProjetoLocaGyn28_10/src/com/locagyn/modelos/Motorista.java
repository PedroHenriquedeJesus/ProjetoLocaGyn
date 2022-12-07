/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Motorista {
    
    private int id = 0;
    private String nome = "";
    private int numeroCNH = 0;
    Date dataValidade = new Date();
    private String telefone = "";
    private String endereco = "";

    public Motorista() {
    }
    
    public Motorista(int id, String nome, int numeroCNH, Date dataValidade, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.numeroCNH = numeroCNH;
        this.dataValidade = dataValidade;
        this.telefone = telefone;
        this.endereco = endereco;
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + numeroCNH + ";" + dataValidade + ";"+ telefone + ";" + endereco;
    }  
}
