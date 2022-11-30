/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;
import com.locagyn.enums.EnumSituacao;
import com.locagyn.enums.EnumTipoDeCombustivel;
import com.locagyn.enums.EnumTipoDoVeiculo;
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
    Date anoFabricacao = new Date();
    Date anoModelo = new Date();
    EnumTipoDeCombustivel combustivel;
    private int quilometragem = 0;
    EnumTipoDoVeiculo tipo;
    EnumSituacao situacao;
    
    public Veiculo(){}
    
    public Veiculo(String combustivel, String tipo, String situacao, int id, String placa, int renavam, float precoCompra,
                   float precoVenda, Date anoFabricacao, Date anoModelo, int quilometragem)throws Exception {
      
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


    @Override
    public String toString() {
        return  id + ";" + placa + ";" + renavam + ";" + precoCompra + ";"+ precoVenda + ";" 
                + anoFabricacao + ";"+anoModelo + ";"+quilometragem +";" 
                +combustivel +";" +tipo +";" +situacao +";" +objetoMarca.getId();
    }
    
}
