/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.persistencia;
import com.locagyn.enums.EnumTipoCliente;
import com.locagyn.extras.Endereco;
import com.locagyn.extras.Telefone;
import com.locagyn.ferramentas.GeradorIdentificador;
import com.locagyn.modelos.Cliente;
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
            ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
            
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                Cliente objetoCliente = new Cliente();
                Endereco objetoEndereco = new Endereco();
                Telefone objetoTelefone = new Telefone();
                String vetorString[] = linha.split(";");
                objetoCliente.setId(Integer.parseInt(vetorString[0]));
                objetoCliente.setCpfCnpj(vetorString[1]);
                objetoCliente.setTipoCliente(EnumTipoCliente.valueOf(vetorString[2]));
                objetoCliente.setNome(vetorString[3]);
                objetoCliente.setRazaoSocial(vetorString[4]);
                objetoCliente.setIdentidade(vetorString[5]);
                objetoCliente.setEmail(vetorString[6]);
                objetoEndereco.setLogradouro(vetorString[7]);
                objetoEndereco.setComplemento(vetorString[8]);
                objetoEndereco.setCep(Integer.parseInt(vetorString[9]));
                objetoEndereco.setBairro(vetorString[10]);
                objetoEndereco.setCidade(vetorString[11]);
                objetoEndereco.setEstado(vetorString[12]);
                objetoTelefone.setDdi(Integer.parseInt(vetorString[13]));
                objetoTelefone.setDdd(Integer.parseInt(vetorString[14]));
                objetoTelefone.setNumero(Integer.parseInt(vetorString[15]));
                objetoCliente.setEndereco(objetoEndereco);
                objetoCliente.setTelefone(objetoTelefone);
                listaDeClientes.add(objetoCliente);
       
                //istaDeClientes.add((objetoendereco)vetorString[7]);
                
            }
            br.close();
            return listaDeClientes;
                    }
        catch(Exception erro){
            throw erro;
        }
    }
    
    
    @Override
    public void buscar(Cliente objeto) throws Exception{
        
    }
}
