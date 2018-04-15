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
public class Computador extends Equipamento{
    private String sistemaOperacional;
    private String placaVideo;
    private String hd;
    private String processador;
    private String memoria;

    public Computador() {
    }

    public Computador(String sistemaOperacional, String placaVideo, String hd, String processador, String memoria, String codEquipamento, String modelo, String marca, String quantidade, String valorUnitarioAluguel) {
        super(codEquipamento, modelo, marca, quantidade, valorUnitarioAluguel);
        this.sistemaOperacional = sistemaOperacional;
        this.placaVideo = placaVideo;
        this.hd = hd;
        this.processador = processador;
        this.memoria = memoria;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
