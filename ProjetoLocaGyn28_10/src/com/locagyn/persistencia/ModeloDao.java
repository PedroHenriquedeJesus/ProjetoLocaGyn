/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class ModeloDao implements IModeloDao{
    private String nomeDoArquivo = "";
    
    public ModeloDao(){
    nomeDoArquivo = ".\\src\\com\\locagyn\\arquivosdedados\\Modelo.txt";
    }

    @Override
    public void incluir(Modelo objeto) throws Exception {
        try{
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivo,true);
            BufferedWriter bw =new BufferedWriter(fw);
            objeto.setId(GeradorIdentificador.getID());
            bw.write(objeto.toString()+"\n");
            bw.close();		
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterar(Modelo objeto) throws Exception {
        ArrayList<Modelo> lista = listagem();
        FileWriter fw = new FileWriter(nomeDoArquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i = 0; i < lista.size(); i++) {
            if (objeto.getId() == lista.get(i).getId()) {
                bw.write(objeto.toString()+"\n");
            }
            else{
                bw.write(lista.get(i).toString()+"\n");
            }
        }
        bw.close();
    }
    
          
    @Override
    public ArrayList<Modelo> listagem() throws Exception {
        try {
            ArrayList<Modelo> listaDeModelos = new ArrayList<Modelo>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Modelo objetoModelo = new Modelo();
                String vetorString[] = linha.split(";");
                objetoModelo.setId(Integer.parseInt(vetorString[0]));
                objetoModelo.setDescricao(vetorString[1]);
                objetoModelo.setUrl(vetorString[2]);
                IMarcaDao marcaDao = new MarcaDao();
                objetoModelo.setObjetoMarca(marcaDao.buscar(Integer.parseInt(vetorString[3])));
                System.out.println(objetoModelo.getDescricao());
                listaDeModelos.add((Modelo)objetoModelo);
            }
            br.close();
            return listaDeModelos;
        }
        catch(Exception erro){
            throw erro;
        }
    }
    @Override
    public Modelo buscar(int ID)throws Exception{
     try {
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
             while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(Integer.parseInt(vetorString[0]) == ID){
                   Modelo objetomodelo = new Modelo();
                  objetomodelo.setId(Integer.parseInt(vetorString[0]));
                  objetomodelo.setDescricao(vetorString[1]);
                  objetomodelo.setUrl(vetorString[2]);
                  IMarcaDao marcaDao = new MarcaDao();
                  objetomodelo.setObjetoMarca(marcaDao.buscar(Integer.parseInt(vetorString[3])));
                  
                  return objetomodelo;
                }
            }
     }
     catch (Exception e) {
        }
    Modelo objetoModelo = new Modelo();
        return objetoModelo;
    }

    @Override
    public Modelo buscar(String Descricao) throws Exception {
         try {
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
             while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if((vetorString[1]).equals(Descricao)){
                   Modelo objetomodelo = new Modelo();
                  objetomodelo.setId(Integer.parseInt(vetorString[0]));
                  objetomodelo.setDescricao(vetorString[1]);
                  objetomodelo.setUrl(vetorString[2]);
                  IMarcaDao marcaDao = new MarcaDao();
                  objetomodelo.setObjetoMarca(marcaDao.buscar((vetorString[3])));
                  
                  return objetomodelo;
                }
            }
     }
     catch (Exception e) {
        }
    Modelo objetoModelo = new Modelo();
        return objetoModelo;
    }
    
    }


