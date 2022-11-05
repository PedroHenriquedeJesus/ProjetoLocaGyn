/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Veiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class VeiculoDao implements IVeiculoDao{
    private String nomeDoArquivo = ".\\src\\com\\locagyn\\arquivosdedados\\Marca.txt";;
    
    public VeiculoDao(){
}
       @Override
    public void incluir(Veiculo objeto) throws Exception {
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
    public void alterar(Veiculo objeto) throws Exception {
        ArrayList<Veiculo> lista = listagem();
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
    public ArrayList<Veiculo> listagem() throws Exception {
        try {
            ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Veiculo objetoVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setDescricao(vetorString[1]);
                objetoVeiculo.setUrl(vetorString[2]);
                listaDeVeiculos.add((Veiculo)objetoVeiculo);
            }
            br.close();
            return listaDeVeiculos;
        }
        catch(Exception erro){
            throw erro;
        }
    }
}
