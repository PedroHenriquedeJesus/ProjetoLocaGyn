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
public class Categoria extends Veiculo{
    private int id = 0;
    private String descricao = "";
    private float valorLocacao = 0;
    
    public Categoria(){}
    
    public Categoria(String combustivel, String tipo, String situacao, int id, String descricao, String url, Marca objetoModelo, String placa, int renavam, float precoCompra,
                    float precoVenda, Date anoFabricacao, Date anoModelo, int quilometragem, float valorLocacao) throws Exception{
        super(combustivel, tipo, situacao, id, descricao, url, objetoModelo, placa, renavam, precoCompra, precoVenda, anoFabricacao, anoModelo, quilometragem);
    this.id = id;
    this.descricao = descricao;
    this.valorLocacao = valorLocacao;
    
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    @Override
    public Date getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public void setAnoFabricacao(Date anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public Date getAnoModelo() {
        return anoModelo;
    }

    @Override
    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Override
    public EnumTipoDeCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(EnumTipoDeCombustivel combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public EnumTipoDoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(EnumTipoDoVeiculo tipo) {
        this.tipo = tipo;
    }

    @Override
    public EnumSituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(EnumSituacao situacao) {
        this.situacao = situacao;
    }

    @Override
    public Marca getObjetoMarca() {
        return objetoMarca;
    }

    @Override
    public void setObjetoMarca(Marca objetoMarca) {
        this.objetoMarca = objetoMarca;
    }

    @Override
    public String toString() {
        return id + ";" + descricao + ";" + valorLocacao;
    }
    
}
