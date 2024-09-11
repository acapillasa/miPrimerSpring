package com.zubiri.miprimerspring.aplicacion;

import com.zubiri.miprimerspring.dominio.Pelicula;
import java.util.List;

public interface IAplicacionPeliculas {
    
    public Pelicula getPelicula (String id);

    public List<Pelicula> getPeliculas();

    public String insertPelicula(Pelicula pelicula);
}
