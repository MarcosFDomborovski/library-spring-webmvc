package br.com.bpkedu.library_spring_webmvc.dto;

import br.com.bpkedu.library_spring_webmvc.domain.Usuario;

public class UserDTD {
    private String nome;
    private String senha;
    private String email;
    private String endereco;
    private String celular;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public void setCelular(String celular) {this.celular = celular;}

    public String getCelular(){return celular;}

    public Usuario toUser(UserDTD UserDtd){
        return new Usuario (
                this.nome,
                this.senha,
                this.email,
                this.endereco,
                this.celular
        );
    }
}
