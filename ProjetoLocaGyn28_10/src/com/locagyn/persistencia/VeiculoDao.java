/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.enums.EnumSituacao;
import com.locagyn.enums.EnumTipoDeCombustivel;
import com.locagyn.enums.EnumTipoDoVeiculo;
import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Veiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class VeiculoDao implements IVeiculoDao{
    private String nomeDoArquivo = "";
    
    public VeiculoDao(){
    nomeDoArquivo = ".\\src\\com\\locagyn\\arquivosdedados\\Marca.txt";

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
            
            SimpleDateFormat formatData;
            formatData = new SimpleDateFormat("dd/MM/yyyy");
            
            while((linha=br.readLine())!=null){
                Veiculo objetoVeiculo = new Veiculo();
                String vetorString[] = linha.split(";");
                objetoVeiculo.setId(Integer.parseInt(vetorString[0]));
                objetoVeiculo.setPlaca(vetorString[1]);
                objetoVeiculo.setRenavam(Integer.parseInt(vetorString[2]));
                objetoVeiculo.setPrecoCompra(Integer.parseInt(vetorString[3]));
                objetoVeiculo.setPrecoVenda(Integer.parseInt(vetorString[4]));
                objetoVeiculo.setAnoFabricacao(formatData.parse(vetorString[5]));
                objetoVeiculo.setAnoModelo(formatData.parse(vetorString[6]));
                objetoVeiculo.setCombustivel(EnumTipoDeCombustivel.valueOf(vetorString[7]));
                objetoVeiculo.setQuilometragem(Integer.parseInt(vetorString[8]));
                objetoVeiculo.setTipo(EnumTipoDoVeiculo.valueOf(vetorString[9]));
                objetoVeiculo.setSituacao(EnumSituacao.valueOf(vetorString[10]));
                
                listaDeVeiculos.add((Veiculo)objetoVeiculo);
            }
            br.close();
            return listaDeVeiculos;
        }
        catch(Exception erro){
            throw erro;
        }
    }

    //@Override
    //public void buscar(Veiculo objeto) throws Exception {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }
   
}
