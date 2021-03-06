package com.israelsolha.cursomc.services;

import com.israelsolha.cursomc.domain.Categoria;
import com.israelsolha.cursomc.repositories.CategoriaRepository;
import com.israelsolha.cursomc.services.exceptions.ObjectNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions("Objeto não encontrado! Id: " + id + ", Tipo: " +
                Categoria.class.getName()));
    }
}
