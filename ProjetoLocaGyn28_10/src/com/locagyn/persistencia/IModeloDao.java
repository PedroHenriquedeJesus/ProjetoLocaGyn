/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.modelos.Modelo;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface IModeloDao {
    void incluir(Modelo objeto)throws Exception;
    void alterar(Modelo objeto)throws Exception;
    ArrayList<Modelo> listagem()throws Exception;
    public Modelo buscar(int ID)throws Exception;
    public Modelo buscar(String ID)throws Exception;
}
