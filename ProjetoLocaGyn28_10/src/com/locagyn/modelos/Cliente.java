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
    EnumTipoCliente clienteTipo;
    Telefone objetotelefone = new Telefone();
    Endereco objetoendereco = new Endereco();

    public Cliente(int id,String cpfCnpj, String razaoSocial, String nome, String Identidade, String Email, 
             String clienteTipo, Telefone telefone, Endereco endereco)throws Exception {
    this.id = id; 
    this.cpfCnpj = cpfCnpj;
    this.razaoSocial = razaoSocial;
    this.nome = nome; 
    this.Identidade = Identidade; 
    this.Email = Email;
    this.clienteTipo = EnumTipoCliente.valueOf(clienteTipo);
    this.objetoendereco = endereco;
    this.objetotelefone = telefone;
    }

    public Telefone getObjetotelefone() {
        return objetotelefone;
    }

    public void setObjetotelefone(Telefone objetotelefone) {
        this.objetotelefone = objetotelefone;
    }

    public Endereco getObjetoendereco() {
        return objetoendereco;
    }

    public void setObjetoendereco(Endereco objetoendereco) {
        this.objetoendereco = objetoendereco;
    }

    public Cliente() {
        
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
        return id + ";" + cpfCnpj + ";" + razaoSocial + ";" + nome + ";" + Identidade + ";" + Email + ";" + objetotelefone.getDdi() + ";" +
                objetotelefone.getDdd() + ";" +objetotelefone.getNumero()+ ";" + objetoendereco.getLogradouro()+ ";" +
                objetoendereco.getComplemento() +";" + objetoendereco.getCep() + ";" + objetoendereco.getBairro() + ";" + objetoendereco.getCidade() + ";" +
                objetoendereco.getEstado() + ";";
    }

   public void setEndereco(Endereco objetoEndereco) {
   }
    public void setTelefone(Telefone objetoTelefone) {
        
    }
    
   
    
}
