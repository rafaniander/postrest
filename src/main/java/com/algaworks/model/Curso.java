package com.algaworks.model;

/**
 *
 * @author Rafael Marques
 */
public class Curso {

    private Integer id;
    private String nome;
    private String duracao;

    public Curso(Integer id, String nome, String duracao) {
        this.id = id;
        this.nome = nome;
        this.duracao = duracao;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDuracao() {
        return duracao;
    }

}
