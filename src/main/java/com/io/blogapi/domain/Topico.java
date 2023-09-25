package com.io.blogapi.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

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

    @Column(name = "DATA_CRIACAO", nullable = false)
    private LocalDate dataCriacao;

    @Column(name = "STATUS",  nullable = false)
    private String status;

    @Column(name = "AUTOR",  nullable = false)
    private String autor;

    @Column(name = "CURSO",  nullable = false)
    private String curso;
}
