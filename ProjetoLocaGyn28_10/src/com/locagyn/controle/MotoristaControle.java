/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;

import com.locagyn.modelos.Motorista;
import com.locagyn.persistencia.IMotoristaDao;
import com.locagyn.persistencia.MotoristaDao;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Aluno
 */
public class MotoristaControle implements IMotoristaControle{

    IMotoristaDao motoristaPersistencia = null;
    
     public MotoristaControle(){
        this.motoristaPersistencia = new MotoristaDao();
    }
     
      private boolean buscarMotorista(String nome) throws Exception {
        try {
        ArrayList<Motorista> listagem = motoristaPersistencia.listagem();
        Iterator<Motorista> lista = listagem.iterator();
            while (lista.hasNext()) {                
                Motorista aux = lista.next();
                if(aux.getNome().equalsIgnoreCase(nome)){
                    return true;
                }
            }
        } catch (Exception erro) {
            throw erro;
        }
        return false;
    }
    
    @Override
    public void incluir(Motorista objeto) throws Exception {
        motoristaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {
        motoristaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        return  motoristaPersistencia.listagem();    
    }

}
