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
public class Tablet extends Equipamento{
    private String capacidade;
    private String tamanhoTela;
    private String memoriaRam;
    private String sistemaOperacional;
    private String bateria;
    private String processador;

    public Tablet() {
        super();
    }

    public Tablet(String capacidade, String tamanhoTela, String memoriaRam, String sistemaOperacional, String bateria, String processador) {
        this();
        this.capacidade = capacidade;
        this.tamanhoTela = tamanhoTela;
        this.memoriaRam = memoriaRam;
        this.sistemaOperacional = sistemaOperacional;
        this.bateria = bateria;
        this.processador = processador;
    }    

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(String tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getProcessador() {
        return processador;
    }

    public void setCpu(String processador) {
        this.processador = processador;
    }
}
