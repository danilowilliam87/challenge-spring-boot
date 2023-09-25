package com.io.blogapi.dto;


import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TopicoDto {

    @NotBlank
    private String titulo;

    @NotBlank
    private String mensagem;

    @NotNull
    private LocalDate dataCriacao;

    @NotEmpty
    private String status;

    @NotEmpty
    private String autor;

    @NotEmpty
    private String curso;
}
