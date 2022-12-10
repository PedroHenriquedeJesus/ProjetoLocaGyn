/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Marca;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Aluno
 */
public class MarcaDao implements IMarcaDao{
    private String nomeDoArquivoNoDisco;
    public MarcaDao() {
        nomeDoArquivoNoDisco = ".\\src\\com\\locagyn\\arquivosdedados\\Marca.txt";
    }
    
    @Override
    public void incluir(Marca objeto) throws Exception {
        try{
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
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
    public void alterar(Marca objeto) throws Exception {
        ArrayList<Marca> lista = listagem();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
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
    public ArrayList<Marca> listagem() throws Exception {
        try {
            ArrayList<Marca> listaDeMarcas = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Marca objetoMarca = new Marca();
                String vetorString[] = linha.split(";");
                objetoMarca.setId(Integer.parseInt(vetorString[0]));
                objetoMarca.setDescricao(vetorString[1]);
                objetoMarca.setUrl(vetorString[2]);
                listaDeMarcas.add(objetoMarca);
            }
            
        br.close();  
        
            Collections.sort(listaDeMarcas, new Comparador());
            
        return listaDeMarcas;
          
        } catch(Exception erro){
         throw erro;
        }
    }
    
    public class Comparador implements Comparator<Marca>{
            @Override
            public int compare (Marca marca1, Marca marca2){
                return Integer.compare(marca1.getId(), marca2.getId());
            }
        
        
    }

    @Override
    public Marca buscar(int Id) throws Exception {
        
        try {
            
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(Integer.parseInt(vetorString[0]) == Id){
                    Marca objetomarca = new Marca();
                    objetomarca.setId(Integer.parseInt(vetorString[0]));
                    objetomarca.setDescricao(vetorString[1]);
                    objetomarca.setUrl(vetorString[2]);
                    System.out.println(objetomarca.getDescricao());
                    return objetomarca;
                    
                }
                
            }
            
            
           
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
        Marca objetomarca = new Marca();
           return objetomarca;
        
        
        
        
    }

    @Override
    public Marca buscar(String ID) throws Exception {
        try {
            
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            System.out.println("oi");
            while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(vetorString[1].equals(ID)){
                    System.out.println("oi");
                    Marca objetomarca = new Marca();
                    objetomarca.setId(Integer.parseInt(vetorString[0]));
                    objetomarca.setDescricao(vetorString[1]);
                    objetomarca.setUrl(vetorString[2]);
                    System.out.println(objetomarca.getDescricao());
                    return objetomarca;
                    
                }
                
            }
            
            
           
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
        Marca objetomarca = new Marca();
           return objetomarca;
        
        
        
        
    }}
        
   
        
    
        
        
        
        
        

