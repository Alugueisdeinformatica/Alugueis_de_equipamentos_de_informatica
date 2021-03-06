package model;

public class Monitor extends Equipamento{
    private String tipo;
    private String tamanhoTela;
    private String resolucao;

    public Monitor() {
        super();
    }

    public Monitor(String tipo, String tamanhoTela, String resolucao, int codEquipamento, String modelo, String marca, int quantEstoque, String categoria, float valorDiaria) {
        super(codEquipamento, modelo, marca, quantEstoque, categoria, valorDiaria);
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
    
    public boolean validaMonitor(){
        return !tipo.equals("") &&
               !tamanhoTela.equals("") &&
               !resolucao.equals("");
    }
    
    @Override
    public String toString(){
        String str = "Tipo: " + tipo;
        str += "\nTamanho da Tela: " + tamanhoTela;
        str += "\nResolução: " + resolucao;
        return str;
    }
}
