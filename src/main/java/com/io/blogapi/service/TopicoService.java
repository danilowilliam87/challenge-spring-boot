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

    public Topico buscarPorId(Long id){
        return topicoRepository.findById(id).get();
    }

    public void excluirTopico(Long id){
        topicoRepository.deleteById(id);
    }


    public Topico atualizar(Long id, TopicoDto dto){
        Topico busca = buscarPorId(id);
        if(busca != null){
            busca.setAutor(dto.getAutor());
            busca.setMensagem(dto.getMensagem());
            busca.setCurso(dto.getCurso());
            busca.setDataCriacao(dto.getDataCriacao());
            busca.setStatus(dto.getStatus());
            busca.setTitulo(dto.getTitulo());
            return this.topicoRepository.save(busca);
        }
        return null;
    }
}
