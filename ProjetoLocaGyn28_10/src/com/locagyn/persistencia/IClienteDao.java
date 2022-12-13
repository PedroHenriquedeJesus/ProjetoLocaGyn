/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.modelos.Cliente;
import com.locagyn.modelos.Modelo;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public interface IClienteDao {
    void incluir(Cliente objeto)throws Exception;
    void alterar(Cliente objeto)throws Exception;
    ArrayList<Cliente> listagem()throws Exception;
    public void buscar(Cliente objeto)throws Exception;
    public Cliente buscar(int id)throws Exception;
}
