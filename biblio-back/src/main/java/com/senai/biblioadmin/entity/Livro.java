
package com.senai.biblioadmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdLivro;
    
    @Column(nullable=false)
    private String titulo;
    
    @Column(nullable=false)
    private String autor;
    
    @Column(nullable=false)
    private String editora;
    
    @Column(nullable=false)
    private String ano;
    
    @OneToOne
    private Emprestimo emprestimo;

    public Long getIdLivro() {
        return IdLivro;
    }

    public void setIdLivro(Long IdLivro) {
        this.IdLivro = IdLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
}
