/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Locacao;
import com.locagyn.persistencia.ILocacaoDao;
import com.locagyn.persistencia.LocacaoDao;

/**
 *
 * @author ageuv
 */
public class LocacaoControle implements ILocacaoControle{
    ILocacaoDao locacaoPersistencia = null;
    
    public LocacaoControle(){ this.locacaoPersistencia = new LocacaoDao(); }  

    @Override
    public void locar(Locacao objeto) throws Exception {
        
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {
        
    }

    @Override
    public void cancelar(Locacao objeto) throws Exception {
         
    }
    
}
