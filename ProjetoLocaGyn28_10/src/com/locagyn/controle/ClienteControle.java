/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Cliente;
import com.locagyn.persistencia.IClienteDao;
import com.locagyn.persistencia.ClienteDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class ClienteControle implements IClienteControle {
    IClienteDao clientePersistencia = null;
    public ClienteControle(){
        this.clientePersistencia = new ClienteDao();
    }
    
    private boolean buscarCliente(String nome)throws Exception{
        try {
            ArrayList<Cliente> listagem = clientePersistencia.listagem();
            Iterator<Cliente> lista = listagem.iterator();
            while(lista.hasNext()){
                Cliente aux = lista.next();
                if(aux.getNome().equalsIgnoreCase(nome)){
                return true;
                }
        }
    return false;
        } catch (Exception erro) {
            throw erro;
        }
        
    }
    
    @Override
    public void incluir(Cliente objeto) throws Exception {
        if(buscarCliente(objeto.getNome())){throw new Exception("Cliente já cadastrado!");}
        
        if(objeto.getCpfCnpj().equals("") || objeto.getCpfCnpj().equals(" ")){throw new Exception("Insira o CPF!");}
        
        if(objeto.getNome().equals("") || objeto.getNome().equals(" ")){throw new Exception("Insira o nome!");}
        
        if(objeto.getRazaoSocial().equals("") || objeto.getRazaoSocial().equals(" ")){throw new Exception("Insira a razao social!");}
        
        if(objeto.getIdentidade().equals("") || objeto.getIdentidade().equals(" ")){throw new Exception("Insira a identidade!");}
        
        if(objeto.getTelefone().equals("") || objeto.getTelefone().equals(" ") || objeto.getTelefone() == null){throw new Exception("Insira o telefone!");}
        
        if(objeto.getEmail().equals("") || objeto.getEmail().equals(" ")){throw new Exception("Insira o email!");}
        
        if(objeto.getEndereco().getLogradouro().equals("") || objeto.getEndereco().getLogradouro().equals(" ")){throw new Exception("Insira o logradouro!");}
        
        if(objeto.getEndereco().getComplemento().equals("") || objeto.getEndereco().getComplemento().equals(" ")){throw new Exception("Insira o complemento!");}
        
        if(objeto.getEndereco().getCep() == 0){throw new Exception("Insira o CEP!");}
        
        if(objeto.getEndereco().getBairro().equals("") || objeto.getEndereco().getBairro().equals(" ")){throw new Exception("Insira o bairro!");}
        
        if(objeto.getEndereco().getCidade().equals("") || objeto.getEndereco().getCidade().equals(" ")){throw new Exception("Insira a cidade!");}
        
        if(objeto.getEndereco().getEstado().equals("") || objeto.getEndereco().getEstado().equals(" ")){throw new Exception("Insira o estado!");}

        clientePersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Cliente objeto) throws Exception {
        
        if(buscarCliente(objeto.getNome())){throw new Exception("Cliente já cadastrado!");}
        
        if(objeto.getCpfCnpj().equals("") || objeto.getCpfCnpj().equals(" ")){throw new Exception("Insira o CPF!");}
        
        if(objeto.getNome().equals("") || objeto.getNome().equals(" ")){throw new Exception("Insira o nome!");}
        
        if(objeto.getRazaoSocial().equals("") || objeto.getRazaoSocial().equals(" ")){throw new Exception("Insira a razao social!");}
        
        if(objeto.getIdentidade().equals("") || objeto.getIdentidade().equals(" ")){throw new Exception("Insira a identidade!");}
        
        if(objeto.getTelefone().equals("") || objeto.getTelefone().equals(" ") || objeto.getTelefone() == null){throw new Exception("Insira o telefone!");}
        
        if(objeto.getEmail().equals("") || objeto.getEmail().equals(" ")){throw new Exception("Insira o email!");}
        
        if(objeto.getEndereco().getLogradouro().equals("") || objeto.getEndereco().getLogradouro().equals(" ")){throw new Exception("Insira o logradouro!");}
        
        if(objeto.getEndereco().getComplemento().equals("") || objeto.getEndereco().getComplemento().equals(" ")){throw new Exception("Insira o complemento!");}
        
        if(objeto.getEndereco().getCep() == 0){throw new Exception("Insira o CEP!");}
        
        if(objeto.getEndereco().getBairro().equals("") || objeto.getEndereco().getBairro().equals(" ")){throw new Exception("Insira o bairro!");}
        
        if(objeto.getEndereco().getCidade().equals("") || objeto.getEndereco().getCidade().equals(" ")){throw new Exception("Insira a cidade!");}
        
        if(objeto.getEndereco().getEstado().equals("") || objeto.getEndereco().getEstado().equals(" ")){throw new Exception("Insira o estado!");}
        
        clientePersistencia.alterar(objeto);
    }
    

    @Override
    public ArrayList<Cliente> listagem() throws Exception {
        
        return clientePersistencia.listagem();
    }
    
    @Override
    public void buscar(Cliente objeto) throws Exception{
        
        clientePersistencia.buscar(objeto);
    }
    @Override
    public Cliente buscar(int  ID) throws Exception{
        
        return clientePersistencia.buscar(ID);
    }
}
