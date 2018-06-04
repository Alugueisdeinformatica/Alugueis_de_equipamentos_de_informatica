package model;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario() {
        this.nome = "ADMIN";
        this.senha = "ADMIN";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean validarSenha(String senha){
        boolean retorna = false;
        if(senha.length() == 5 && !senha.isEmpty()){
            retorna = true;
        }
        return retorna;
    }
    
    public boolean validarNome(String nome){
        boolean retorna = false;
        if(!nome.equals("")){
            retorna = true;
        }
        return retorna;
    }
    
    public boolean efetuarLogin(String nome, String senha){
        boolean retorna = false;
        if(nome.toUpperCase().equals(this.nome) && senha.toUpperCase().equals(this.senha)){
            retorna = true;
        }
        return retorna;
    }
}
