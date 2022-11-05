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
    
    private boolean buscarCliente(String descricao)throws Exception{
        try {
            ArrayList<Cliente> listagem = clientePersistencia.listagem();
            Iterator<Cliente> lista = listagem.iterator();
            while(lista.hasNext()){
                Cliente aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(descricao)){
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
        if(buscarCliente(objeto.getDescricao())){
            throw new Exception("Modelo já cadastrado!");
        }
            clientePersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Cliente objeto) throws Exception {
        if (buscarCliente(objeto.getDescricao())) {
            throw new Exception("Marca já Cadastrada");
        }
        clientePersistencia.alterar(objeto);
    }
    

    @Override
    public ArrayList<Cliente> listagem() throws Exception {
        
        return clientePersistencia.listagem();
    }
    
    public void buscar(Cliente objeto) throws Exception{
       if (buscarCliente(objeto.getDescricao())) {
            throw new Exception("Marca já Cadastrada");
        }
        clientePersistencia.buscar(objeto);
    }
}
