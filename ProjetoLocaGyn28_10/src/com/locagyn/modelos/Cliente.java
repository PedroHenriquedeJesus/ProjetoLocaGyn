/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import com.locagyn.enums.EnumTipoCliente;



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
    

    public Cliente(int id,String cpfCnpj, String razaoSocial, String nome, String Identidade, String Email, 
            String endereco, String telefone, String clienteTipo)throws Exception {
    this.id = id; 
    this.cpfCnpj = cpfCnpj;
    this.razaoSocial = razaoSocial;
    this.nome = nome; 
    this.Identidade = Identidade; 
    this.Email = Email;
    this.clienteTipo = EnumTipoCliente.valueOf(clienteTipo);
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
        return "Cliente{" + "id=" + id + ", cpfCnpj=" + cpfCnpj + ", razaoSocial=" + razaoSocial + ", nome=" + nome + ", Identidade=" + Identidade + ", Email=" + Email + '}';
    }

   
    
   
    
}
