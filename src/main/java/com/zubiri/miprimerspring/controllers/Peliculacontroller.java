package com.zubiri.miprimerspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zubiri.miprimerspring.aplicacion.IAplicacionPeliculas;
import com.zubiri.miprimerspring.dominio.Pelicula;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;


@RequestMapping("/peliculas")
@RestController
@AllArgsConstructor
public class Peliculacontroller {


    private IAplicacionPeliculas aplicacionPelicula;

    @GetMapping("/saludar")
    public String saludar() {
        return "Hola, soy el servidor";
    }

    @GetMapping("/insertData")
    public String insertarDatos() {
        Pelicula pelicula1 = new Pelicula("1", "El padrino", 2002, "pepe");
        Pelicula pelicula2 = new Pelicula("2", "El padrino II", 2005, "pepe");
        Pelicula pelicula3 = new Pelicula("3", "El padrino III", 2008, "pepe");
        
        String nombre = aplicacionPelicula.insertPelicula(pelicula1);
        aplicacionPelicula.insertPelicula(pelicula2);
        aplicacionPelicula.insertPelicula(pelicula3);

        return "OK, datos insertados por "+nombre+".";
    }

    @GetMapping("")
    public List<Pelicula> getPeliculas() {
        return aplicacionPelicula.getPeliculas();
    }


    @GetMapping("/{id}")
    public Pelicula getPelicula(@PathVariable String id) {
        return aplicacionPelicula.getPelicula(id);
    }
    
    
    

}