/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Seccion;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ISeccionService {
    
    public List<Seccion> getSecciones();
    
    public void saveSeccion(Seccion seccion);
    
    public void deleteSeccion(Long id);
    
    public Seccion findSeccion(Long id);
    
    public List<Seccion> getByUserId(Long id);
}
