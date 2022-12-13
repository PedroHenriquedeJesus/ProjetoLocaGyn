/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;
import com.locagyn.enums.EnumSituacao;
import com.locagyn.enums.EnumTipoDeCombustivel;
import com.locagyn.enums.EnumTipoDoVeiculo;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Aluno
 */
public class Veiculo extends Modelo{
    
    private int id = 0;
    private String placa = "";
    private int renavam = 0;
    private float precoCompra = 0;
    private float precoVenda = 0;
    private Date anoFabricacao = null;
    private Date anoModelo = null;
    private EnumTipoDeCombustivel combustivel;
    private int quilometragem = 0;
    private EnumTipoDoVeiculo tipo;
    private EnumSituacao situacao;
    private Categoria categoria = new Categoria();
    private Marca objMarca = null;
    private Modelo objModelo = null;
    SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy");
    
    public Veiculo(){}
    
    public Veiculo(String combustivel, String tipo, String situacao, int id, String placa, int renavam, float precoCompra,
                   float precoVenda, Date anoFabricacao, Date anoModelo, int quilometragem,Categoria categoria, Marca objMarca, Modelo objModelo)throws Exception {
      
       this.combustivel = EnumTipoDeCombustivel.valueOf(combustivel);
       this.situacao = EnumSituacao.valueOf(situacao);
       this.tipo = EnumTipoDoVeiculo.valueOf(tipo);
       this.placa = placa;
       this.renavam = renavam;
       this.precoCompra = precoCompra;
       this.precoVenda = precoVenda;
       this.anoFabricacao = anoFabricacao;
       this.anoModelo = anoModelo;
       this.quilometragem = quilometragem;
       this.categoria = categoria;
       this.objMarca = objMarca;
       this.objModelo = objModelo;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public void setCombustivel(EnumTipoDeCombustivel combustivel) {
        this.combustivel = combustivel;
    }
    
    public EnumTipoDeCombustivel getCombustivel() {
        //String[] combustivel = new String[EnumTipoDeCombustivel.values().length];
       // for (EnumTipoDeCombustivel combustivelEnum : EnumTipoDeCombustivel.values()) {
       //     combustivel[combustivelEnum.ordinal()] = combustivelEnum.getCombustivel();
       // }
        return combustivel;
    }

    

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setTipo(EnumTipoDoVeiculo tipo) {
        this.tipo = tipo;
    }

    public EnumTipoDoVeiculo getTipo() {
        return tipo;
    }

    public void setSituacao(EnumSituacao situacao) {
        this.situacao = situacao;
    }

    public EnumSituacao getSituacao() {
        return situacao;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }
    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public Marca getObjMarca() {
        return objMarca;
    }

    public void setObjMarca(Marca objMarca) {
        this.objMarca = objMarca;
    }

    public Modelo getObjModelo() {
        return objModelo;
    }

    public void setObjModelo(Modelo objModelo) {
        this.objModelo = objModelo;
    }

    @Override
    public String toString() {
        return  id + ";"+ objMarca.getId()+ ";" + objModelo.getId() + ";"+ categoria.getId() + ";" + placa + ";" + renavam + ";" + precoCompra + ";"+ precoVenda + ";" 
                + formatData.format(anoFabricacao) + ";" +formatData.format(anoModelo) + ";"+ combustivel +";" 
                + quilometragem +";" +tipo +";" +situacao +";";
    }
    
}
