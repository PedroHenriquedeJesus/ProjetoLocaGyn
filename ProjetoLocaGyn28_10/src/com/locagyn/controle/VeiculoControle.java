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
    IVeiculoDao veiculoPersistencia = null;
    public VeiculoControle(){
        this.veiculoPersistencia = new VeiculoDao();
    }
    private boolean buscarVeiculo(String placa) throws Exception {
        try {
        ArrayList<Veiculo> listagem = veiculoPersistencia.listagem();
        Iterator<Veiculo> lista = listagem.iterator();
            while (lista.hasNext()) {                
                Veiculo aux = lista.next();
                if(aux.getPlaca().equalsIgnoreCase(placa)){
                    return true;
                }
            }
        } catch (Exception erro) {
            throw erro;
        }
        return false;
    }
    @Override
    public void incluir(Veiculo objeto)throws Exception {
//         if(buscarVeiculo(objeto.getPlaca())){throw new Exception("Veiculo já cadastrado!");}
//         
//         if (objeto.getPlaca().equals("") || objeto.getPlaca().equals(" ")){throw new Exception("Insira a Placa do Veiculo!");}
            
        veiculoPersistencia.incluir(objeto);
    }
    
    @Override
    public void alterar(Veiculo objeto) throws Exception {
         if(buscarVeiculo(objeto.getPlaca())){throw new Exception("Veiculo já cadastrado!");}
         
         if (objeto.getPlaca().equals("") || objeto.getPlaca().equals(" ")){throw new Exception("Insira a Placa do Veiculo!");}
            
        veiculoPersistencia.alterar(objeto);
    }
    @Override
    public ArrayList<Veiculo> listagem() throws Exception {
        
        return  veiculoPersistencia.listagem();
    }
    
   //  public Veiculo buscar(int ID) throws Exception {
    //    return veiculoPersistencia.buscar(ID);
  //  }
}
