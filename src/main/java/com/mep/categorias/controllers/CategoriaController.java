package com.mep.categorias.controllers;

import com.mep.categorias.models.CategoriaModel;
import com.mep.categorias.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<CategoriaModel>> findAll() {
        return ResponseEntity.ok().body(categoriaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaModel> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(categoriaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<CategoriaModel> save(@RequestBody CategoriaModel categoriaModel) {
        return ResponseEntity.status(201).body(categoriaService.save(categoriaModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
