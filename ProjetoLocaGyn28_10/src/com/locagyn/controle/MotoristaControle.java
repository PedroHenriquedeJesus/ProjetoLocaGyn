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
       if(buscarMotorista((objeto.getNome()))){throw new Exception("Motorisa já cadastrado!");}
       
       if(objeto.getNome().equals("") || objeto.getNome().equals(" ")){throw new Exception("Insira um nome!");}
       
       if(objeto.getNumeroCNH() == 0){throw new Exception("Insira a CNH!");}
       
       if(objeto.getDataValidade() == null) {throw new Exception("Insira a data de validade!");}
       
       if(objeto.getTelefone().equals("") || objeto.getTelefone().equals(" ") || objeto.getTelefone() == null){throw new Exception("Insira o telefone!");}
       
       if(objeto.getEndereco().getLogradouro().equals("") || objeto.getEndereco().getLogradouro().equals(" ")){throw new Exception("Insira o logradouro!");}
       
       if(objeto.getEndereco().getComplemento().equals("") || objeto.getEndereco().getComplemento().equals(" ")){throw new Exception("Insira o complemento!");}
        
       if(objeto.getEndereco().getCep() == 0){throw new Exception("Insira o CEP!");}
        
       if(objeto.getEndereco().getBairro().equals("") || objeto.getEndereco().getBairro().equals(" ")){throw new Exception("Insira o bairro!");}
        
       if(objeto.getEndereco().getCidade().equals("") || objeto.getEndereco().getCidade().equals(" ")){throw new Exception("Insira a cidade!");}
        
       if(objeto.getEndereco().getEstado().equals("") || objeto.getEndereco().getEstado().equals(" ")){throw new Exception("Insira o estado!");}
       
       motoristaPersistencia.incluir(objeto);
    }

    @Override
    public void alterar(Motorista objeto) throws Exception {

       if(buscarMotorista((objeto.getNome()))){throw new Exception("Motorisa já cadastrado!");}
       
       if(objeto.getNome().equals("") || objeto.getNome().equals(" ")){throw new Exception("Insira um nome!");}
       
       if(objeto.getNumeroCNH() == 0){throw new Exception("Insira a CNH!");}
       
       if(objeto.getDataValidade() == null) {throw new Exception("Insira a data de validade!");}
       
       if(objeto.getTelefone().equals("") || objeto.getTelefone().equals(" ") || objeto.getTelefone() == null){throw new Exception("Insira o telefone!");}
       
       if(objeto.getEndereco().getLogradouro().equals("") || objeto.getEndereco().getLogradouro().equals(" ")){throw new Exception("Insira o logradouro!");}
       
       if(objeto.getEndereco().getComplemento().equals("") || objeto.getEndereco().getComplemento().equals(" ")){throw new Exception("Insira o complemento!");}
        
       if(objeto.getEndereco().getCep() == 0){throw new Exception("Insira o CEP!");}
        
       if(objeto.getEndereco().getBairro().equals("") || objeto.getEndereco().getBairro().equals(" ")){throw new Exception("Insira o bairro!");}
        
       if(objeto.getEndereco().getCidade().equals("") || objeto.getEndereco().getCidade().equals(" ")){throw new Exception("Insira a cidade!");}
        
       if(objeto.getEndereco().getEstado().equals("") || objeto.getEndereco().getEstado().equals(" ")){throw new Exception("Insira o estado!");}
        motoristaPersistencia.alterar(objeto);
    }

    @Override
    public ArrayList<Motorista> listagem() throws Exception {
        return  motoristaPersistencia.listagem();    
    }

}
