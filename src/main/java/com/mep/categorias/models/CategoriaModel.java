package com.mep.categorias.models;

import jakarta.persistence.*;

@Entity(name = "Categoria")
@Table(name = "tb_categoria")
public class CategoriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nome;

    @Column(name = "description")
    private String descricao;

}
