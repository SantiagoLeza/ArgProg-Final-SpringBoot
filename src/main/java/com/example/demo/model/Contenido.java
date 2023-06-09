/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author santi
 */
@Getter @Setter
@Entity
public class Contenido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContenido;
    private String titulo;
    private String texto;
    private String urlImagen;
    private Long id_seccion;

    @Override
    public String toString() {
        return this.idContenido + " | " + this.titulo + " | " + this.texto + " | " + this.urlImagen + " | " + this.id_seccion;
    }
}
