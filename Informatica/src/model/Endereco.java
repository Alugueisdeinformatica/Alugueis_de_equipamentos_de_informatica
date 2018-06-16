package model;

public class Endereco {
    private String cep;
    private String cidade;
    private String estado;
    private String complemento;
    private int numero;
    private String bairro;
    private String rua;

    public Endereco() {
    }

    public Endereco(String cep, String cidade, String estado, String complemento, int numero, String bairro, String rua) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public boolean validaEndereco(){ //Verifica se todos os campos foram preenchidos
        return !cep.equals("") &&
               !cidade.equals("") &&
               !estado.equals("") &&
               !complemento.equals("") &&
               numero > 0 &&
               !bairro.equals("") &&
               !rua.equals("");
    }
    
    @Override
    public String toString(){
        String str = "";
        str += "\nCEP: " + cep;
        str += "\nCidade: " + cidade;
        str += "\nEstado: " + estado;
        str += "\nComplemento: " + complemento;
        str += "\nNúmero: " + Integer.toString(numero);
        str += "\nBairro: " + bairro;
        str += "\nRua: " + rua;
        return str;
    }
}
