/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.dto;

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
public class UsuarioDTO implements Serializable {
    private String nombre;
    private String apellido;
    private String mail;
    private String ciudad;
    private String pais;
    private String url_imagen;
    private List<SeccionDTO> secciones;

    public UsuarioDTO(String nombre, String apellido, String mail, String ciudad, String pais, String url_imagen, List<SeccionDTO> secciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.ciudad = ciudad;
        this.pais = pais;
        this.url_imagen = url_imagen;
        this.secciones = secciones;
    }
}
