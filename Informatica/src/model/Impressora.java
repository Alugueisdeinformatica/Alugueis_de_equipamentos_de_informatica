package model;

public class Impressora extends Equipamento{
    private String tipo;
    private String voltagem;
    private String conectividade;
    private boolean wifi;

    public Impressora() {
        super();
        wifi = false;
    }

    public Impressora(String tipo, String tecnologia, String especificacao, boolean wifi, int codEquipamento, String modelo, String marca, int quantEstoque, String categoria, float valorDiaria) {
        super(codEquipamento, modelo, marca, quantEstoque, categoria, valorDiaria);
        this.tipo = tipo;
        this.voltagem = tecnologia;
        this.conectividade = especificacao;
        this.wifi = wifi;
    }  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTecnologia() {
        return voltagem;
    }

    public void setTecnologia(String tecnologia) {
        this.voltagem = tecnologia;
    }

    public String getEspecificacao() {
        return conectividade;
    }

    public void setEspecificacao(String especificacao) {
        this.conectividade = especificacao;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }    
    
    @Override
    public String toString() {
        String w = "Não";
        if(wifi){
            w = "Sim";
        }
        String str = toString_();
        str += "\nTipo: " + tipo;
        str += "\nVoltagem: " + voltagem;
        str += "\nConectividade: " + conectividade;
        str += "\nWifi: " + w;
        return str;
    }
    
    public boolean validaImpressora(){
        return !tipo.equals("") &&
               !voltagem.equals("") &&
               !conectividade.equals("");
    }
}
