/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;

import com.locagyn.extras.Endereco;
import com.locagyn.extras.Telefone;
import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Motorista;
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
public class MotoristaDao implements IMotoristaDao{
    private String nomeDoArquivo = "";
    
    public MotoristaDao(){
    nomeDoArquivo = ".\\src\\com\\locagyn\\arquivosdedados\\Motorista.txt";

}
    @Override
    public void incluir(Motorista objeto) throws Exception {
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
    public void alterar(Motorista objeto) throws Exception {
        ArrayList<Motorista> lista = listagem();
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
    public ArrayList<Motorista> listagem() throws Exception {
try {
            ArrayList<Motorista> listaDeMotorista = new ArrayList<Motorista>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            
            SimpleDateFormat formatData;
            formatData = new SimpleDateFormat("dd/MM/yyyy");
            
            while((linha=br.readLine())!=null){
                Motorista objetoMotorista = new Motorista();
                Endereco objetoEndereco = new Endereco();
                Telefone objetoTelefone = new Telefone();
                
                String vetorString[] = linha.split(";");
           
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setNumeroCNH(Integer.parseInt(vetorString[2]));
                objetoMotorista.setDataValidade(formatData.parse(vetorString[3]));
                //telefone
                objetoTelefone.setDdi(Integer.parseInt(vetorString[4]));
                objetoTelefone.setDdd(Integer.parseInt(vetorString[5]));
                objetoTelefone.setNumero(Integer.parseInt(vetorString[6]));
                //Endereco
                objetoEndereco.setLogradouro(vetorString[7]);
                objetoEndereco.setComplemento(vetorString[8]);
                objetoEndereco.setCep(Integer.parseInt(vetorString[9]));
                objetoEndereco.setBairro(vetorString[10]);
                objetoEndereco.setCidade(vetorString[11]);
                objetoEndereco.setEstado(vetorString[12]);
                //Inclusao de objeto
                objetoMotorista.setTelefone(objetoTelefone);
                objetoMotorista.setEndereco(objetoEndereco);             
                
                listaDeMotorista.add((Motorista)objetoMotorista);
            }
            br.close();
            return listaDeMotorista;
        }
        catch(Exception erro){
            throw erro;
        }
    }    

    @Override
    public Motorista buscar(int Id) throws Exception {
 try {
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
             while ((linha=br.readLine()) != null) {
                String vetorString[]=linha.split(";");
                if(Integer.parseInt(vetorString[0]) == Id){
                   Motorista objetoMotorista = new Motorista();
                   Endereco objetoEndereco = new Endereco();
                   Telefone objetoTelefone = new Telefone();
                   
               SimpleDateFormat formatData;
               formatData = new SimpleDateFormat("dd/MM/yyyy");
               
                objetoMotorista.setId(Integer.parseInt(vetorString[0]));
                objetoMotorista.setNome(vetorString[1]);
                objetoMotorista.setNumeroCNH(Integer.parseInt(vetorString[2]));
                objetoMotorista.setDataValidade(formatData.parse(vetorString[3]));
                //telefone
                objetoTelefone.setDdi(Integer.parseInt(vetorString[4]));
                objetoTelefone.setDdd(Integer.parseInt(vetorString[5]));
                objetoTelefone.setNumero(Integer.parseInt(vetorString[6]));
                //Endereco
                objetoEndereco.setLogradouro(vetorString[7]);
                objetoEndereco.setComplemento(vetorString[8]);
                objetoEndereco.setCep(Integer.parseInt(vetorString[9]));
                objetoEndereco.setBairro(vetorString[10]);
                objetoEndereco.setCidade(vetorString[11]);
                objetoEndereco.setEstado(vetorString[12]);
                //Inclusao de objeto
                objetoMotorista.setTelefone(objetoTelefone);
                objetoMotorista.setEndereco(objetoEndereco);              
                
                return objetoMotorista;
                }
                }
        } catch (Exception e) {
        }
        Motorista objetoMotorista = new Motorista();
        return objetoMotorista;
    }    
}
 

