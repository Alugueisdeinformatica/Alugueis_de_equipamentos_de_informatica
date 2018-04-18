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
public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private Endereco endereco;
    private String dataNascimento;
    private String sexo;
    private String cpf;
    private String estadoCivil;

    public Cliente() {
        endereco = new Endereco();
    }

    public Cliente(String nome, String email, String telefone, Endereco endereco, String dataNascimento, String sexo, String cpf, String estadoCivil) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public boolean validaCliente(){ //Verifica se todos os campos foram preenchidos
        return !nome.equals("") &&
                !email.equals("") &&
                !telefone.equals("") &&
                endereco.validaEndereco() &&
                !dataNascimento.equals("") &&
                !sexo.equals("") &&
                !cpf.equals("") &&
                !estadoCivil.equals("");
    }
}
