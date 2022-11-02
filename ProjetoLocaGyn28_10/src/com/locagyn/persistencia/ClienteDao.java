/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;
import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Cliente;
import com.locagyn.modelos.Modelo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ClienteDao implements IClienteDao {
    private String nomeDoArquivo = "";
    
    public ClienteDao(){
    nomeDoArquivo = ".\\src\\com\\locagyn\\arquivosdedados\\Cliente.txt";
    }

    @Override
    public void incluir(Cliente objeto) throws Exception {
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
    public void alterar(Cliente objeto) throws Exception {
        ArrayList<Cliente> lista = listagem();
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
    public ArrayList<Cliente> listagem() throws Exception {
        try {
            ArrayList<Cliente> listaDeModelos = new ArrayList<Cliente>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Cliente objetoCliente = new Cliente();
                String vetorString[] = linha.split(";");
                objetoCliente.setId(Integer.parseInt(vetorString[0]));
                objetoCliente.setDescricao(vetorString[1]);
                objetoCliente.setUrl(vetorString[2]);
                listaDeModelos.add((Cliente)objetoCliente);
            }
            br.close();
            return listaDeModelos;
        }
        catch(Exception erro){
            throw erro;
        }
    }
   
    @Override
    public void buscar(Cliente objeto) throws Exception{
        
    }
}
