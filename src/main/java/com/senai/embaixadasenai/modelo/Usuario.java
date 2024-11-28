package com.senai.embaixadasenai.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    private int id;
    private String nome;
    private String senha;
    private String email;
    private String nacionalidade;
    private String rg;
    private String cpf;
    private String sexo;
    private String enderecoResidencial;
    private String enderecoEstrangeiro;
    private String filiacao;
    private String estadoCivil;
    private String paisResidente;
    private String certidaoNasciemento;
    private String dataNascimento;
    private String telefone;
    private String telefoneDeContato;
    private String vinculoDePaisDeOrigem;
    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public String getEnderecoEstrangeiro() {
        return enderecoEstrangeiro;
    }

    public void setEnderecoEstrangeiro(String enderecoEstrangeiro) {
        this.enderecoEstrangeiro = enderecoEstrangeiro;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getPaisResidente() {
        return paisResidente;
    }

    public void setPaisResidente(String paisResidente) {
        this.paisResidente = paisResidente;
    }

    public String getCertidaoNasciemento() {
        return certidaoNasciemento;
    }

    public void setCertidaoNasciemento(String certidaoNasciemento) {
        this.certidaoNasciemento = certidaoNasciemento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefoneDeContato() {
        return telefoneDeContato;
    }

    public void setTelefoneDeContato(String telefoneDeContato) {
        this.telefoneDeContato = telefoneDeContato;
    }

    public String getVinculoDePaisDeOrigem() {
        return vinculoDePaisDeOrigem;
    }

    public void setVinculoDePaisDeOrigem(String vinculoDePaisDeOrigem) {
        this.vinculoDePaisDeOrigem = vinculoDePaisDeOrigem;
    }
}
