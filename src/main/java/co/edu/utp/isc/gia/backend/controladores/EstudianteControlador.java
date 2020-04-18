/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.backend.controladores;

import co.edu.utp.isc.gia.backend.entidades.Estudiante;
import co.edu.utp.isc.gia.backend.interfaces.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author johan
 */
@CrossOrigin(origins = "https://examengiafront.herokuapp.com",maxAge = 3600)//url de angular
@RestController
@RequestMapping({"/estudiantes"})
public class EstudianteControlador {
    @Autowired
    EstudianteService estudianteService;
    
    @GetMapping
    public List<Estudiante>listar(){
        return estudianteService.listar();
    }
    @PostMapping
    public Estudiante agregar(@RequestBody Estudiante estudiante){
        return estudianteService.crear(estudiante);
    }
    
}
