/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.interfaces.IEquipamento;

/**
 *
 * @author Luís Gustavo
 */
public class Monitor implements IEquipamento{
    private String tipo;
    private String tamanhoTela;
    private String resolucao;

    public Monitor() {
    }

    public Monitor(String tipo, String tamanhoTela, String resolucao) {
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

    @Override
    public String codEquipamento() {
        return "";
    }

    @Override
    public int quantidade() {
        return 0;
    }
}
