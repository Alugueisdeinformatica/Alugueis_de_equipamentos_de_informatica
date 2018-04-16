/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.enuns.EMarca;
import model.enuns.EModelo;
import model.enuns.EValorAluguel;

/**
 *
 * @author Luís Gustavo
 */
public class Monitor extends Equipamento{
    private String tipo;
    private String tamanhoTela;
    private String resolucao;

    public Monitor() {
    }

    public Monitor(String tipo, String tamanhoTela, String resolucao, EModelo modelo, EMarca marca, EValorAluguel valor, String codEquipamento, String quantidade) {
        super(modelo, marca, valor, codEquipamento, quantidade);
        this.tipo = tipo;
        this.tamanhoTela = tamanhoTela;
        this.resolucao = resolucao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
}
