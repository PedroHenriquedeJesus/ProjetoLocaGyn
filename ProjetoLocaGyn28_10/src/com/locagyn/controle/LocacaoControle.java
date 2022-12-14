/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Locacao;
import com.locagyn.modelos.Veiculo;
import com.locagyn.persistencia.ILocacaoDao;
import com.locagyn.persistencia.LocacaoDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ageuv
 */
public class LocacaoControle implements ILocacaoControle{
    ILocacaoDao locacaoPersistencia = null;
    
    public LocacaoControle(){ this.locacaoPersistencia = new LocacaoDao(); }  

    private boolean buscarLocacao(String placa)throws Exception{
        try {
            ArrayList<Locacao> listagem = locacaoPersistencia.listagem();
            Iterator<Locacao> lista = listagem.iterator();
            while(lista.hasNext()){
                Locacao aux = lista.next();
                if(aux.getVeiculo().getPlaca().equalsIgnoreCase(placa)){
                return true;
                }
        }
    return false;
        } catch (Exception erro) {
            throw erro;
        }
    }
    @Override
    public void locar(Locacao objeto) throws Exception {
        
        locacaoPersistencia.locar(objeto);
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {
        locacaoPersistencia.devolver(objeto);
    }

    @Override
    public void cancelar(Locacao objeto) throws Exception {
        locacaoPersistencia.cancelar(objeto);
    }

    @Override
    public ArrayList<Locacao> listagem() throws Exception {
        return locacaoPersistencia.listagem();
    }
    
}
