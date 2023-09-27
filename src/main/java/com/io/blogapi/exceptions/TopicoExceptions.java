package com.io.blogapi.exceptions;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TopicoExceptions {
    
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<MensagemDeErroApi> violacaoIntegridade(DataIntegrityViolationException dataIntegrityViolationException){
           MensagemDeErroApi api = new MensagemDeErroApi();
           api.setData(LocalDateTime.now());
           api.setMensagem("Erro ao salvar dados : ");
           api.setUri("/topicos");

           return ResponseEntity.badRequest().body(api);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> erroValidacaoCampo(MethodArgumentNotValidException ex){
        List<FieldError> fieldEros = ex.getFieldErrors();
        return ResponseEntity.badRequest()
        .body(fieldEros
        .stream()
        .map(CamposValidacao::new)
        .toList());
    }

    @ExceptionHandler(RecursoNaoEncontradoException.class)
    public ResponseEntity<?> recursoNaoEncontrado(RecursoNaoEncontradoException ex){
        MensagemDeErroApi api = new MensagemDeErroApi(ex.getMensagem(), LocalDateTime.now(), "/topicos");
        return ResponseEntity.badRequest().body(api);
    }
}
