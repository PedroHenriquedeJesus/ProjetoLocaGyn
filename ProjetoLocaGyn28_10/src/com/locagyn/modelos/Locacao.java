/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.locagyn.modelos;

import com.locagyn.enums.EnumSituacao;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Locacao {
    private int id = 0;
    private Date dataLocacao = new Date();
    private Date dataDevolucao = new Date();
    private float valorCalcao = 0;
    private EnumSituacao situacao;
    Veiculo veiculo = new Veiculo();
    Cliente cliente = new Cliente();
    
    public Locacao(){}
    
    public Locacao(int id, Date dataLocacao, Date dataDevolucao, float valorCalcao, String situacao, Veiculo veiculo, Cliente cliente){
    this.id = id;
    this.dataLocacao = dataLocacao;
    this.dataDevolucao = dataDevolucao;
    this.valorCalcao = valorCalcao;
    this.situacao = EnumSituacao.valueOf(situacao);
    this.veiculo = veiculo;
    this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(float valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public EnumSituacao getSituacao() {
        return situacao;
    }

    public void setSituacao(EnumSituacao situacao) {
        this.situacao = situacao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return id + ";" + veiculo + ";" + cliente + "; " + dataLocacao + ";" + dataDevolucao + ";" + valorCalcao + ";" + situacao + ";";
    }
    
}
