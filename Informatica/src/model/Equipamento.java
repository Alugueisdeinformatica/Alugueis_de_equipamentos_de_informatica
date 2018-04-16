/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.enuns.EValorAluguel;
import model.enuns.EModelo;
import model.enuns.EMarca;

/**
 *
 * @author Luís Gustavo
 */
public class Equipamento {
    private EModelo modelo;
    private EMarca marca;
    private EValorAluguel valorDiaria;
    private String codEquipamento;
    private int quantEstoque;
    private String categoria;

    public Equipamento() {
    }

    public Equipamento(EModelo modelo, EMarca marca, EValorAluguel valorDiaria, String codEquipamento, int quantEstoque, String categoria) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorDiaria = valorDiaria;
        this.codEquipamento = codEquipamento;
        this.quantEstoque = quantEstoque;
        this.categoria = categoria;
    }

    public EModelo getModelo() {
        return modelo;
    }

    public void setModelo(EModelo modelo) {
        this.modelo = modelo;
    }

    public EMarca getMarca() {
        return marca;
    }

    public void setMarca(EMarca marca) {
        this.marca = marca;
    }

    public EValorAluguel getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(EValorAluguel valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(String codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int quantDisponivel(int quant) {
        int total = getQuantEstoque();//atualizando a quantidade disponivel aumentando ou diminuindo        
        total += quantEstoque;        
        return total;        
    }
}
