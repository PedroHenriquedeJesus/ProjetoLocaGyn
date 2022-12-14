/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Acessorio;
import com.locagyn.persistencia.AcessorioDao;
import com.locagyn.persistencia.IAcessorioDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aluno
 */
public class AcessorioControle implements IAcessorioControle{
    IAcessorioDao acessorioPersistencia = null;
    public AcessorioControle(){
        this.acessorioPersistencia = new AcessorioDao();
    }
    
    private boolean buscarCliente(String nome)throws Exception{
        try {
            ArrayList<Acessorio> listagem = acessorioPersistencia.listagem();
            Iterator<Acessorio> lista = listagem.iterator();
            while(lista.hasNext()){
                Acessorio aux = lista.next();
                if(aux.getDescricao().equalsIgnoreCase(nome)){
                return true;
                }
        }
    return false;
        } catch (Exception erro) {
            throw erro;
        }
        
    }
    
    @Override
    public void incluir(Acessorio objeto) throws Exception {
        
            acessorioPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Acessorio objeto) throws Exception {
        
        acessorioPersistencia.alterar(objeto);
    }
    

    @Override
    public ArrayList<Acessorio> listagem() throws Exception {
        
        return acessorioPersistencia.listagem();
    }
    
    @Override
    public Acessorio buscar(int ID) throws Exception{
       
       return acessorioPersistencia.buscar(ID);
    }
}
