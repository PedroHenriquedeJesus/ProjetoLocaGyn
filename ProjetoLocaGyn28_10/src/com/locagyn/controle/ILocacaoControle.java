/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Locacao;

/**
 *
 * @author ageuv
 */
public interface ILocacaoControle {
    void locar(Locacao objeto)throws Exception;
    void devolver(Locacao objeto)throws Exception;
    void cancelar(Locacao objeto)throws Exception;
}
