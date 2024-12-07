package com.compresuapeca.rtx4060.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dados_backup")
public class DadosBackup {
    private String marca;

    @Id
    private String codigoCofap;
    private String codigoOriginal;
    private String codigoAxios;
    private String codigoSampel;
    private String codigoMobensani;
    private String codigoBorflex;
    private String codigoYibrasil;

    @Column(name = "embalagem")
    private Double embalagem;

    private String nome;
    private String modelo;
    private String ano;

    public DadosBackup() {
    }

    public DadosBackup(String marca,
                       String codigoCofap,
                       String codigoOriginal,
                       String codigoAxios,
                       String codigoSampel,
                       String codigoMobensani,
                       String codigoBorflex,
                       String codigoYibrasil,
                       Double embalagem,
                       String nome,
                       String modelo,
                       String ano) {
        this.marca = marca;
        this.codigoCofap = codigoCofap;
        this.codigoOriginal = codigoOriginal;
        this.codigoAxios = codigoAxios;
        this.codigoSampel = codigoSampel;
        this.codigoMobensani = codigoMobensani;
        this.codigoBorflex = codigoBorflex;
        this.codigoYibrasil = codigoYibrasil;
        this.embalagem = embalagem;
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigoCofap() {
        return codigoCofap;
    }

    public void setCodigoCofap(String codigoCofap) {
        this.codigoCofap = codigoCofap;
    }

    public String getCodigoOriginal() {
        return codigoOriginal;
    }

    public void setCodigoOriginal(String codigoOriginal) {
        this.codigoOriginal = codigoOriginal;
    }

    public String getCodigoAxios() {
        return codigoAxios;
    }

    public void setCodigoAxios(String codigoAxios) {
        this.codigoAxios = codigoAxios;
    }

    public String getCodigoSampel() {
        return codigoSampel;
    }

    public void setCodigoSampel(String codigoSampel) {
        this.codigoSampel = codigoSampel;
    }

    public String getCodigoMobensani() {
        return codigoMobensani;
    }

    public void setCodigoMobensani(String codigoMobensani) {
        this.codigoMobensani = codigoMobensani;
    }

    public String getCodigoBorflex() {
        return codigoBorflex;
    }

    public void setCodigoBorflex(String codigoBorflex) {
        this.codigoBorflex = codigoBorflex;
    }

    public String getCodigoYibrasil() {
        return codigoYibrasil;
    }

    public void setCodigoYibrasil(String codigoYibrasil) {
        this.codigoYibrasil = codigoYibrasil;
    }

    public Double getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(Double embalagem) {
        this.embalagem = embalagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
