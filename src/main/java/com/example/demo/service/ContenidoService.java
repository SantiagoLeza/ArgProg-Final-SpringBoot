/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.model.Contenido;
import com.example.demo.dao.ContenidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author santi
 */
@Service
public class ContenidoService implements IContenidoService {
    
    @Autowired
    private ContenidoRepository contenidoRepository;
    
    @Override
    public List<Contenido> getContenidos() {
        return contenidoRepository.findAll();
    }

    @Override
    public void saveContenido(Contenido usuario) {
        contenidoRepository.save(usuario);
    }

    @Override
    public void deleteContenido(Long id) {
        contenidoRepository.deleteById(id);
    }

    @Override
    public Contenido findContenido(Long id) {
        return contenidoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contenido> getBySeccionId(Long id) {
        return contenidoRepository.getBySeccionId(id);
    }
}
