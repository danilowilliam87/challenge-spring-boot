package com.io.blogapi.dto;


import java.time.LocalDate;

import com.io.blogapi.domain.Topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

    public static Topico converter(TopicoDto topicoDto){
        return new Topico(topicoDto.getTitulo(),
                topicoDto.getMensagem(),
                topicoDto.getDataCriacao(),
                topicoDto.getAutor(),
                 topicoDto.getStatus(),
                topicoDto.getCurso());
    }
}
