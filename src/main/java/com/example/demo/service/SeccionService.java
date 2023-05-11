/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Seccion;
import com.example.demo.dao.SeccionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class SeccionService implements ISeccionService {
    
    @Autowired
    private SeccionRepository seccionRepository;

    @Override
    public List<Seccion> getSecciones() {
        return seccionRepository.findAll();
    }

    @Override
    public void saveSeccion(Seccion usuario) {
        seccionRepository.save(usuario);
    }

    @Override
    public void deleteSeccion(Long id) {
        seccionRepository.deleteById(id);
    }

    @Override
    public Seccion findSeccion(Long id) {
        return seccionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Seccion> getByUserId(Long id) {
        return seccionRepository.getByUserId(id);
    }
}
