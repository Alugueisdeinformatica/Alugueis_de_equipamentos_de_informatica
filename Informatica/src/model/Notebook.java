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
public class Notebook extends Equipamento{
    private String sistemaOperacional;
    private String placaVideo;
    private String capacidadeHD;//desmembrar em classe nova, para ter os atributos. Ex: marca, capacidade modelo...
    private String processador;// idem HD
    private String memoria;
    private String bateria;

    public Notebook() {
        super();
    }

    public Notebook(String sistemaOperacional, String placaVideo, String capacidadeHD, String processador, String memoria, String bateria, int codEquipamento, String modelo, String marca, int quantEstoque, String categoria, double valorDiaria) {
        super(codEquipamento, modelo, marca, quantEstoque, categoria, valorDiaria);
        this.sistemaOperacional = sistemaOperacional;
        this.placaVideo = placaVideo;
        this.capacidadeHD = capacidadeHD;
        this.processador = processador;
        this.memoria = memoria;
        this.bateria = bateria;
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

    public String getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(String capacidadeHD) {
        this.capacidadeHD = capacidadeHD;
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

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }    
    
    public boolean validaNotebook(){
        return !sistemaOperacional.equals("") &&
               !placaVideo.equals("") &&
               !capacidadeHD.equals("") &&
               !processador.equals("") &&
               !memoria.equals("") &&
               !bateria.equals("");
    }
    
    @Override
    public String toString(){
        return "Sistema Operacional: " + sistemaOperacional +
               "\nPlaca de Vídeo: " + placaVideo +
               "\nCapacidade de HD: " + capacidadeHD +
               "\nProcessador: " + processador +
               "\nMemória: " + memoria +
               "\nBateria: " + bateria;
    }
}
