/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.enums.EnumSituacao;
import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Locacao;
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
public class LocacaoDao implements ILocacaoDao{
    private String nomeDoArquivo = ".\\src\\com\\locagyn\\arquivosdedados\\Locacao.txt";
    private String nomeDoArquivoVeiculo = ".\\src\\com\\locagyn\\arquivosdedados\\Veiculo.txt";
    
    @Override
    public void locar(Locacao objeto) throws Exception {
        try{
            FileWriter fw = new FileWriter(nomeDoArquivo,true);
            BufferedWriter bw =new BufferedWriter(fw);
            objeto.setId(GeradorIdentificador.getID());
            bw.write(objeto.toString()+"\n");
            bw.close();
            
            ArrayList<Locacao> listaDeLocacao = new ArrayList<Locacao>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
            Locacao objetoLocacao = new Locacao();
            IVeiculoDao veiculoDao = new VeiculoDao();
            IClienteDao clienteDao = new ClienteDao();
            String vetorString[] = linha.split(";");
            objetoLocacao.setId(Integer.parseInt(vetorString[0]));
            objetoLocacao.setVeiculo(veiculoDao.buscar(Integer.parseInt(vetorString[1])));
            objetoLocacao.setCliente(clienteDao.buscar(Integer.parseInt(vetorString[2])));
            objetoLocacao.setSituacao(EnumSituacao.LOCADO);
            }
            
      }catch(Exception erro){
        throw erro;
        
      }
        try {
            FileWriter fw = new FileWriter(nomeDoArquivoVeiculo,true);
            BufferedWriter bw =new BufferedWriter(fw);
            objeto.setId(GeradorIdentificador.getID());
            bw.write(objeto.toString()+"\n");
            bw.close();
            
            ArrayList<Veiculo> listaDeVeiculo = new ArrayList<Veiculo>();
            FileReader fr = new FileReader(nomeDoArquivoVeiculo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
            String vetorString[] = linha.split(";");
            Veiculo objetoVeiculo = new Veiculo();
            objetoVeiculo.setSituacao(EnumSituacao.LOCADO.valueOf(vetorString[13]));
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void devolver(Locacao objeto) throws Exception {
        
    }

    @Override
    public void cancelar(Locacao objeto) throws Exception {
        try{
            FileWriter fw = new FileWriter(nomeDoArquivo,true);
            BufferedWriter bw =new BufferedWriter(fw);
            objeto.setId(GeradorIdentificador.getID());
            bw.write(objeto.toString()+"\n");
            bw.close();
            
            ArrayList<Locacao> listaDeLocacao = new ArrayList<Locacao>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
            Locacao objetoLocacao = new Locacao();
            Veiculo objVeiculo = new Veiculo();
            String vetorString[] = linha.split(";");
            objetoLocacao.setId(Integer.parseInt(vetorString[0]));
            //objetoLocacao.setObjVeiculo(veiculoDao.buscar(Integer.parseInt(vetorString[1])));
            //objetoLocacao.setObjCliente(clienteDao.buscar(Integer.parseInt(vetorString[2])));
            objVeiculo.setSituacao(EnumSituacao.DISPONIVEL);
            }
      }catch(Exception erro){
        throw erro;
        
      }
    }

    @Override
    public ArrayList<Locacao> listagem() throws Exception {
        try{
            ArrayList<Veiculo> listaDeVeiculos = new ArrayList<Veiculo>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            
            SimpleDateFormat formatData;
            formatData = new SimpleDateFormat("dd/MM/yyyy");
            while((linha=br.readLine())!=null){
            Locacao objetoLocacao = new Locacao();
            IVeiculoDao veiculoDao = new VeiculoDao();
            IClienteDao clienteDao = new ClienteDao();
            String vetorString[] = linha.split(";");
            objetoLocacao.setId(Integer.parseInt(vetorString[0]));
            objetoLocacao.setVeiculo(veiculoDao.buscar(Integer.parseInt(vetorString[1])));
            objetoLocacao.setCliente(clienteDao.buscar(Integer.parseInt(vetorString[2])));
            objetoLocacao.setSituacao(EnumSituacao.LOCADO);
            }
            
      }catch(Exception erro){
        throw erro;
        
      }
        return null;
    }
    
}
