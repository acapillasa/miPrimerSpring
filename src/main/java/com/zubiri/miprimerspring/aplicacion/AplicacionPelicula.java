package com.zubiri.miprimerspring.aplicacion;

import java.util.List;

import com.zubiri.miprimerspring.dominio.Pelicula;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AplicacionPelicula implements IAplicacionPeliculas {

    private List<Pelicula> peliculas;
    private String nombre;

    @Override
    public Pelicula getPelicula(String id) {
        
        return peliculas.get(Integer.parseInt(id));
    }

    @Override
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    @Override
    public String insertPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);

        return nombre;
    }
    
}
