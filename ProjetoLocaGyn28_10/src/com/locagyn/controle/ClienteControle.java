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
    
    
    
    @Override
    public void incluir(Cliente objeto) throws Exception {
        
            clientePersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Cliente objeto) throws Exception {
        
        clientePersistencia.alterar(objeto);
    }
    

    @Override
    public ArrayList<Cliente> listagem() throws Exception {
        
        return clientePersistencia.listagem();
    }
    
    public void buscar(Cliente objeto) throws Exception{
       
        clientePersistencia.buscar(objeto);
    }
}
