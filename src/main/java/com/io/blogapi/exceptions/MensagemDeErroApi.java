package com.io.blogapi.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MensagemDeErroApi {
    
    private String mensagem;
    private LocalDateTime data;
    private String uri;

}
