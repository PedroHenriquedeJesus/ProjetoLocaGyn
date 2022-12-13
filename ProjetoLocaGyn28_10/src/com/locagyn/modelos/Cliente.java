/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import com.locagyn.enums.EnumTipoCliente;
import com.locagyn.extras.Endereco;
import com.locagyn.extras.Telefone;

/**
 *
 * @author User
 */
public class Cliente extends Modelo {

    private int id = 0;
    private String cpfCnpj = "";
    private String razaoSocial = "";
    private String nome = "";
    private String Identidade = "";
    private String Email = "";
    private Telefone telefone;
    private Endereco endereco;

    public Cliente(int id, String cpfCnpj, String razaoSocial, String nome, String Identidade, String Email, Telefone telefone, Endereco endereco) throws Exception {
        this.id = id;
        this.cpfCnpj = cpfCnpj;
        this.razaoSocial = razaoSocial;
        this.nome = nome;
        this.Identidade = Identidade;
        this.Email = Email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Cliente() {

    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentidade() {
        return Identidade;
    }

    public void setIdentidade(String Identidade) {
        this.Identidade = Identidade;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return id + ";" + cpfCnpj + ";" + razaoSocial + ";" + nome + ";" + Identidade + ";" + Email 
                + ";" + telefone.toString() + ";" + endereco.toString();
    }

}
