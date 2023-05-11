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
import lombok.ToString;

/**
 *
 * @author santi
 */
@Getter @Setter
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String mail;
    private String contrasenia;
    private String ciudad;
    private String pais;
    private String urlImagen;
    
    @Override
    public String toString(){
        return nombre + ", " +
                apellido + ", " +
                mail + ", " +
                contrasenia + ", " +
                ciudad + ", " +
                pais + ", " +
                urlImagen
                ;
    }
}
