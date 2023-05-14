/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.dto.SeccionDTO;
import com.example.demo.model.Seccion;
import com.example.demo.service.ISeccionService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author santi
 */
@CrossOrigin(origins = "*")
@RestController
public class SeccionController {
    
    @Autowired
    private ISeccionService interSeccion;
    
    @Autowired
    private ContenidoController contController;
    
    @GetMapping ("/seccion/traer")
    public List<Seccion> getSecciones(){
        return interSeccion.getSecciones();
    }
    
    @PostMapping ("/seccion/crear")
    public String createSeccion(@RequestBody Seccion s){
        interSeccion.saveSeccion(s);
        
        return "Seccion creada";
    }
    
    @DeleteMapping ("/seccion/borrar/{id}")
    public String deleteSeccion(@PathVariable Long id){
        interSeccion.deleteSeccion(id);
        
        return "Seccion eliminada";
    }
    
    @PutMapping ("/seccion/editar/{id}")
    public Seccion editSeccion(@PathVariable Long id,
            @RequestParam ("titulo") String titulo
            ){
        Seccion s = interSeccion.findSeccion(id);
        
        s.setTitulo(titulo);
        
        interSeccion.saveSeccion(s);
        
        return s;
    }
    
    public List<SeccionDTO> getSeccionPorIdUsuario(@PathVariable Long id){
        ArrayList<SeccionDTO> list = new ArrayList<>();
        
        for(Seccion s : interSeccion.getByUserId(id)){
            list.add(new SeccionDTO(s.getIdSeccion(), s.getTitulo(), contController.getBySeccionId(s.getIdSeccion())));
        }
        
        return list;
    }
}
