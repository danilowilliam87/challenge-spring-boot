package com.io.blogapi.service;

import com.io.blogapi.domain.Topico;
import com.io.blogapi.dto.TopicoDto;
import com.io.blogapi.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public Topico salvarTopico(TopicoDto topicoDto){
        return topicoRepository.save(TopicoDto.converter(topicoDto));
    }
}
