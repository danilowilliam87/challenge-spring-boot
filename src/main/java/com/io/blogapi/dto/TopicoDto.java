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

    @NotBlank(message = "campo obriogatorio")
    private String titulo;

    @NotBlank(message = "campo obriogatorio")
    private String mensagem;

    @NotNull
    private LocalDate dataCriacao;

    @NotEmpty(message = "campo obriogatorio")
    private String status;

    @NotEmpty(message = "campo obriogatorio")
    private String autor;

    @NotEmpty(message = "campo obriogatorio")
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
