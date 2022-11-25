/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.controle;
import com.locagyn.modelos.Veiculo;
import com.locagyn.persistencia.VeiculoDao;
import com.locagyn.persistencia.IVeiculoDao;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Aluno
 */
public class VeiculoControle implements IVeiculoControle{
    IVeiculoDao veiculopersistencia = null;
    public VeiculoControle(){
        this.veiculopersistencia = new VeiculoDao();
    }
    public boolean buscarModelo(String descricao) throws Exception {
        try {
        ArrayList<Veiculo> listagem = veiculopersistencia.listagem();
        Iterator<Veiculo> lista = listagem.iterator();
            while (lista.hasNext()) {                
                Veiculo aux = lista.next();
              //  if(aux.getDescricao().equalsIgnoreCase(descricao)){
                  //  return true;
               // }
            }
        } catch (Exception erro) {
            throw erro;
        }
        return false;
    }
    
}
