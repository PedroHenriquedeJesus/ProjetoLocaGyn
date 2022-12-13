/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Categoria;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class CategoriaDao implements ICategoriaDao{
    private String nomeDoArquivo = ".\\src\\com\\locagyn\\arquivosdedados\\Categoria.txt";
    
    public CategoriaDao(){
}
    
    @Override
    public void incluir(Categoria objeto) throws Exception {
        try{    
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
    public void alterar(Categoria objeto) throws Exception {
        ArrayList<Categoria> lista = listagem();
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
    public ArrayList<Categoria> listagem() throws Exception {
        try {
            ArrayList<Categoria> listaDeCategorias = new ArrayList<Categoria>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Categoria objetoCategoria = new Categoria();
                String vetorString[] = linha.split(";");
                objetoCategoria.setId(Integer.parseInt(vetorString[0]));
                objetoCategoria.setDescricao(vetorString[1]);
                objetoCategoria.setValorLocacao(Float.parseFloat(vetorString[2]));
                listaDeCategorias.add((Categoria)objetoCategoria);
            }
            br.close();
            return listaDeCategorias;
        }
        catch(Exception erro){
            throw erro;
        }
    }

    @Override
    public Categoria buscar(int id) throws Exception {
        Categoria objetoCategoria = new Categoria();
        try {
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            
            while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(Integer.parseInt(vetorString[0]) == id){ 
                    objetoCategoria.setId(Integer.parseInt(vetorString[0]));
                    objetoCategoria.setDescricao(vetorString[1]);
                    objetoCategoria.setValorLocacao(Float.parseFloat(vetorString[2]));
                    return objetoCategoria;
                }
            }    
        } catch (Exception erro) {
        } 
        return objetoCategoria;
    }

    @Override
    public Categoria buscar(String descricao) throws Exception {
        Categoria objetoCategoria = new Categoria();
        try {
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            
            while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(vetorString[1].equals(descricao)){ 
                    objetoCategoria.setId(Integer.parseInt(vetorString[0]));
                    objetoCategoria.setDescricao(vetorString[1]);
                    objetoCategoria.setValorLocacao(Float.parseFloat(vetorString[3]));
                    return objetoCategoria;
                }
            }    
        } catch (Exception erro) {
        } 
        return objetoCategoria;
    }
    
}
    

