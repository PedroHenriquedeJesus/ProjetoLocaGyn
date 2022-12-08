/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.ferramentas;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Aluno
 */
public class CriarArquivoTXT {
    
    public static void criarTXTMarca() throws FileNotFoundException, IOException{
    String nomeArquivoMarca = "./src/com/locagyn/arquivosdedados/Marca.txt";
    FileWriter fw = new FileWriter(nomeArquivoMarca);
    BufferedWriter bw = new BufferedWriter(fw);
    String saida = "";
    bw.write(saida);
    bw.close();
    }
    
public static void criarTXTModelo() throws FileNotFoundException, IOException{
    String nomeArquivoModelo = "./src/com/locagyn/arquivosdedados/Modelo.txt";
    FileWriter fw = new FileWriter(nomeArquivoModelo);
    BufferedWriter bw = new BufferedWriter(fw);
    String saida = "";
    bw.write(saida);
    bw.close();
}
public static void criarTXTCategoria() throws FileNotFoundException, IOException{
    String nomeArquivoCategoria = "./src/com/locagyn/arquivosdedados/Categoria.txt";
    FileWriter fw = new FileWriter(nomeArquivoCategoria);
    BufferedWriter bw = new BufferedWriter(fw);
    String saida = "";
    bw.write(saida);
    bw.close();
}
}
