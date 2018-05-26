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
public class Usuario {
    private String nome;
    private String senha;

    public Usuario() {
        this.nome = "ADMIN";
        this.senha = "JL123456";
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
        if(senha.length() == 8 && !senha.isEmpty()){
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
