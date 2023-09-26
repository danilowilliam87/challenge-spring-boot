package com.io.blogapi.domain;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
@Entity
@Table(name = "TOPICO")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TITULO", unique = true, nullable = false)
    private String titulo;

    @Column(name = "MENSAGEM", unique = true, nullable = false)
    private String mensagem;

    @Column(name = "DATA_CRIACAO",nullable = false)
    private LocalDate dataCriacao;

    @Column(name = "STATUS", nullable = false)
    private String status;

    @Column(name = "AUTOR", nullable = false)
    private String autor;

    @Column(name = "CURSO", nullable = false)
    private String curso;

    public Topico(String titulo, String mensagem, LocalDate dataCriacao,
    String autor, String status, String curso) {
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.dataCriacao = dataCriacao;
        this.status = status;
        this.autor = autor;
        this.curso = curso;
    }
}
