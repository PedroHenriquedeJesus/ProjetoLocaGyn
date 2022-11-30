/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface IVeiculoControle {
    void incluir(Veiculo objeto)throws Exception;
    void alterar(Veiculo objeto)throws Exception;
    ArrayList<Veiculo> listagem()throws Exception;
}
