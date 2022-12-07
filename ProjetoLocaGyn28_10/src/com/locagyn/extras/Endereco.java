/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.extras;

/**
 *
 * @author Aluno
 */
public class Endereco {
    private String logradouro = "";
    private String complemento = "";
    private int cep = 0;
    private String bairro = "";
    private String cidade = "";
    private String estado = "";

    public Endereco(String logradouro,String complemento, int cep, String bairro, String cidade, String estado) {
       this.logradouro = logradouro;
       this.complemento = complemento;
       this.cep = cep;
       this.bairro = bairro;
       this.cidade = cidade;
       this.estado = estado;
    }

    public Endereco() {
        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
     
    public String toString(){
        return  logradouro  + ";" + complemento + ";" + cep + ";" + bairro + ";" +cidade+";" + estado;
    }
}
