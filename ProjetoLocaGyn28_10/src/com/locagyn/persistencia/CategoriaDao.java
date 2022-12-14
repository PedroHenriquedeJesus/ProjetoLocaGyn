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
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivo,true);
            //Criar o buffer do arquivo
            BufferedWriter bw =new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setId(GeradorIdentificador.getID());
            //Escreve no arquivo
            bw.write(objeto.toString()+"\n");
            //fecha o arquivo
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
        Categoria categoria = new Categoria();
        try {
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            
            while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(Integer.parseInt(vetorString[0]) == id){ 
                    categoria.setId(Integer.parseInt(vetorString[0]));
                    categoria.setDescricao(vetorString[1]);
                    categoria.setValorLocacao(Float.parseFloat(vetorString[2]));
                    return categoria;
                }
            }    
        } catch (Exception erro) {
        } 
        return categoria;
    }
    
}
    

