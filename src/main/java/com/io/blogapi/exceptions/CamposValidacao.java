package com.io.blogapi.exceptions;

import org.springframework.validation.FieldError;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CamposValidacao {
    
    private String campo;
    private String mensagem;

    public CamposValidacao(FieldError error){
        this.campo = error.getField();
        this.mensagem = error.getDefaultMessage();
    }
}
