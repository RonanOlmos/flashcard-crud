package com.flashcard.crud.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Categoria categoria;
    private LocalDateTime fechaCreacion;

    private static int contador = 1;

    public Card (Categoria categoria){
        this.id = contador++;
        this.categoria = categoria;
        this.fechaCreacion = LocalDateTime.now();
    }
    public Card (){}

    public int getId(){
        return this.id;
    }
    public Categoria getCategoria(){
        return this.categoria;
    }
    public void setCategoria(Categoria nuevaCategoria){
        this.categoria = nuevaCategoria;
    }
    public LocalDateTime getFechaCreacion(){
        return this.fechaCreacion;
    }
}