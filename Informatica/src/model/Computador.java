package model;

public class Computador extends Equipamento{
    private String sistemaOperacional;
    private String placaVideo;
    private String capacidadeHD;
    private String processador;
    private String memoria;

    public Computador() {
        super();
    }

    public Computador(String sistemaOperacional, String placaVideo, String capacidadeHD, String processador, String memoria, int codEquipamento, String modelo, String marca, int quantEstoque, String categoria, float valorDiaria) {
        super(codEquipamento, modelo, marca, quantEstoque, categoria, valorDiaria);
        this.sistemaOperacional = sistemaOperacional;
        this.placaVideo = placaVideo;
        this.capacidadeHD = capacidadeHD;
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

    @Override
    public String toString() {
        String str = "Sistema Operacional: " + sistemaOperacional; 
        str += "\nPlaca de Vídeo: " + placaVideo;
        str += "\nCapacidade de HD: " + capacidadeHD;
        str += "\nProcessador: " + processador;
        str += "\nMemória: " + memoria;
        return str;
    }   
    
    public boolean validaComputador(){
        return !sistemaOperacional.equals("") &&
               !placaVideo.equals("") &&
               !capacidadeHD.equals("") &&
               !processador.equals("") &&
               !memoria.equals("");
    }
}
