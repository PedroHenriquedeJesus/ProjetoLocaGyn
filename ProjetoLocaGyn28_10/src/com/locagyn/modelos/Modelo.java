/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;
import com.locagyn.controle.MarcaControle;
/**
 *
 * @author Aluno
 */
public class Modelo extends Marca{
    
    Marca objetoMarca = new Marca();
    private int id = 0;
    private String descricao = "";
    private String url = "";
    
    
    public Modelo(){}
    
    public Modelo(int id, String descricao, String url, Marca objetoMarca)throws Exception{
       if(descricao.equals("") || url.equals(""))throw new Exception("Insira todos os dados necessarios!");
       this.id = id;
       this.descricao = descricao;
       this.url = url;
       this.objetoMarca = objetoMarca;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    public Marca getObjetoMarca() {
        return objetoMarca;
    }

    public void setObjetoMarca(Marca objetoMarca) {
        this.objetoMarca = objetoMarca;
    }
    
    
    @Override
    public String toString(){
        return id + ";" + descricao + ";" + url + ";" + objetoMarca.getId();
    }
}
