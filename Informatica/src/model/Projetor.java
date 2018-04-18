/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Luís Gustavo
 */
public class Projetor extends Equipamento{
    private String material;
    private String brilho;
    private String resolucaoOptica;
    private String lampada;
    private String lente;

    public Projetor() {
        super();
    }

    public Projetor(String material, String brilho, String resolucaoOptica, String lampada, String lente, int codEquipamento, String modelo, String marca, int quantEstoque, String categoria, double valorDiaria) {
        super(codEquipamento, modelo, marca, quantEstoque, categoria, valorDiaria);
        this.material = material;
        this.brilho = brilho;
        this.resolucaoOptica = resolucaoOptica;
        this.lampada = lampada;
        this.lente = lente;
    }   

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBrilho() {
        return brilho;
    }

    public void setBrilho(String brilho) {
        this.brilho = brilho;
    }

    public String getResolucaoOptica() {
        return resolucaoOptica;
    }

    public void setResolucaoOptica(String resolucaoOptica) {
        this.resolucaoOptica = resolucaoOptica;
    }

    public String getLampada() {
        return lampada;
    }

    public void setLampada(String lampada) {
        this.lampada = lampada;
    }

    public String getLente() {
        return lente;
    }

    public void setLente(String lente) {
        this.lente = lente;
    }
}
