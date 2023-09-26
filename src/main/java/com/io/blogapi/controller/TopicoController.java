package com.io.blogapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.io.blogapi.domain.Topico;
import com.io.blogapi.dto.TopicoDto;
import com.io.blogapi.service.TopicoService;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public ResponseEntity<Topico> salvarTopico(@RequestBody TopicoDto topicoDto){
        Topico novo = topicoService.salvarTopico(topicoDto);
        return ResponseEntity.ok(novo);
    }

    @GetMapping("/listar")
    public ResponseEntity<Page<Topico>> listarTodos(Pageable page){
        return ResponseEntity.ok(this.topicoService.listarTopicos(page));
    }
}
