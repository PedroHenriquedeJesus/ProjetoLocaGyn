/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Acessorio;
import java.util.ArrayList;
/**
 *
 * @author Aluno
 */
public interface IAcessorioControle {
    void incluir(Acessorio objeto) throws Exception;
    void alterar(Acessorio objeto)throws Exception;
    ArrayList<Acessorio> listagem()throws Exception;
    public Acessorio buscar(int ID)throws Exception;    
}
