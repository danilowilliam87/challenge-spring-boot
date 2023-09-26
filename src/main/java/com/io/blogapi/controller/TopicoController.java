package com.io.blogapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    public Topico salvarTopico(@RequestBody TopicoDto topicoDto){
        return topicoService.salvarTopico(topicoDto);
    }
}
