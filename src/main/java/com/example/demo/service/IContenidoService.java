/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Contenido;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IContenidoService {
    
    public List<Contenido> getContenidos();
    
    public void saveContenido(Contenido contenido);
    
    public void deleteContenido(Long id);
    
    public Contenido findContenido(Long id);
    
    public List<Contenido> getBySeccionId(Long id);
}
