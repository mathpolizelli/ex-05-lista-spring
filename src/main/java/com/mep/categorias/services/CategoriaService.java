package com.mep.categorias.services;

import com.mep.categorias.models.CategoriaModel;
import com.mep.categorias.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaModel> findAll() {
        return categoriaRepository.findAll();
    }

    public CategoriaModel findById(Long id) {
        return categoriaRepository.findById(id).get();
    }

    public CategoriaModel save(CategoriaModel pedidoModel) {
        return categoriaRepository.save(pedidoModel);
    }

    public void delete(Long id) {
        categoriaRepository.deleteById(id);
    }

}
