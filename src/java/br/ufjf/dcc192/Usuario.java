/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc192;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class Usuario {
    private Integer id;
    private String nome;
    private List<Figurinha> figurinhas;

    public Usuario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.figurinhas = new ArrayList<>();
    }

    public List<Figurinha> getFigurinhas() {
        return figurinhas;
    }

    public void setFigurinhas(List<Figurinha> figurinhas) {
        this.figurinhas = figurinhas;
    }
    
    public void addFigurinhas(Figurinha figurinha) {
        this.figurinhas.add(figurinha);
    }
    
    public boolean removerFigurinha(Figurinha figurinha) {
        return this.figurinhas.remove(figurinha);
    }
    
    public boolean removerFigurinhaById(Integer id) {
        return this.figurinhas.remove(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
