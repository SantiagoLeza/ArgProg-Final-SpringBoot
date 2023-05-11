/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.dto;

import com.example.demo.model.Contenido;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author santi
 */
@Getter @Setter
public class SeccionDTO implements Serializable {
    private Long id;
    private String titulo;
    private List<Contenido> contenidos;

    public SeccionDTO(Long id, String titulo, List<Contenido> contenidos) {
        this.id = id;
        this.titulo = titulo;
        this.contenidos = contenidos;
    }

    
}
