package com.io.blogapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.io.blogapi.domain.Topico;
import com.io.blogapi.dto.TopicoDto;
import com.io.blogapi.repository.TopicoRepository;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public Topico salvarTopico(TopicoDto topicoDto){
        return topicoRepository.save(TopicoDto.converter(topicoDto));
    }

    public Page<Topico> listarTopicos(Pageable pageable){
        return this.topicoRepository.findAll(pageable);
    }
}
