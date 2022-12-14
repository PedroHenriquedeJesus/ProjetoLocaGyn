/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Acessorio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class AcessorioDao implements IAcessorioDao{
     private String nomeDoArquivoNoDisco;
    public AcessorioDao() {
        nomeDoArquivoNoDisco = ".\\src\\com\\locagyn\\arquivosdedados\\Acessorio.txt";
    }
    
    @Override
    public void incluir(Acessorio objeto) throws Exception {
        try{
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
            //Criar o buffer do arquivo
            BufferedWriter bw =new BufferedWriter(fw);
            // Incluindo o id no objeto ******
            objeto.setIdLocacao(GeradorIdentificador.getID());
            //Escreve no arquivo
            bw.write(objeto.toString()+"\n");
            //fecha o arquivo
            bw.close();		
      }catch(Exception erro){
         throw erro;
      }
    }

    @Override
    public void alterar(Acessorio objeto) throws Exception {
        ArrayList<Acessorio> lista = listagem();
        FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
        BufferedWriter bw = new BufferedWriter(fw);
        
        for(int i = 0; i < lista.size(); i++) {
            if (objeto.getIdLocacao()== lista.get(i).getIdLocacao()) {
                bw.write(objeto.toString()+"\n");
            }
            else{
                bw.write(lista.get(i).toString()+"\n");
            }
        }
        bw.close();
    }

    @Override
    public ArrayList<Acessorio> listagem() throws Exception {
        try {
            ArrayList<Acessorio> listaDeAcessorios = new ArrayList<>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Acessorio objetoAcessorio = new Acessorio();
                String vetorString[] = linha.split(";");
                objetoAcessorio.setIdLocacao(Integer.parseInt(vetorString[0]));
                objetoAcessorio.setDescricao(vetorString[1]);
                objetoAcessorio.setValorLocacao(Float.parseFloat(vetorString[2]));
                listaDeAcessorios.add(objetoAcessorio);
            }
            
        br.close();  
        
           
            
        return listaDeAcessorios;
          
        } catch(Exception erro){
         throw erro;
        }
    }
    
    
            
        
        
    

    @Override
    public Acessorio buscar(int Id) throws Exception {
        
        try {
            
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            System.out.println("oi");
            while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(Integer.parseInt(vetorString[0]) == Id){
                    System.out.println("oi");
                    Acessorio objetoAcessorio = new Acessorio();
                    objetoAcessorio.setIdLocacao(Integer.parseInt(vetorString[0]));
                    objetoAcessorio.setDescricao(vetorString[1]);
                    objetoAcessorio.setValorLocacao(Float.parseFloat(vetorString[2]));
                    System.out.println(objetoAcessorio.getDescricao());
                    return objetoAcessorio;
                    
                }
                
            }
            
            
           
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
        Acessorio objetoAcessorio = new Acessorio();
           return objetoAcessorio;
        
        
        
        
    }

    @Override
    public Acessorio buscar(String ID) throws Exception {
        try {
            
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            System.out.println("oi");
            while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(vetorString[1].equals(ID)){
                    System.out.println("oi");
                    Acessorio objetomarca = new Acessorio();
                    objetomarca.setIdLocacao(Integer.parseInt(vetorString[0]));
                    objetomarca.setDescricao(vetorString[1]);
                    objetomarca.setValorLocacao(Float.parseFloat((vetorString[2])));
                    System.out.println(objetomarca.getDescricao());
                    return objetomarca;
                    
                }
                
            }
            
            
           
            
            
            
        } catch (Exception e) {
        }
        
        
        
        
        
        
        Acessorio objetoAcessorio = new Acessorio();
           return objetoAcessorio;
        
        
        
}}
