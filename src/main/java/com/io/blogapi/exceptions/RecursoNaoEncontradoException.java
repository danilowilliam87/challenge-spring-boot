package com.io.blogapi.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecursoNaoEncontradoException extends RuntimeException{
    
    private String mensagem;

    public RecursoNaoEncontradoException(String mensagem){
           this.mensagem = mensagem;
    }
}
