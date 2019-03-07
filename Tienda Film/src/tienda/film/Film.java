/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.film;
import java.time.*;


/**
 *
 * @author julio.ospina
 */

//clase que representa una pelicula.
public class Film {
    
    public String title;
    public String descripcion;
    public java.time.Year añoRealizado;
    public int lenguajeId;
    public int duracion_renta;
    public double tasa_renta;
    public int duracionFilm;
    public double costoReposicion;
    public EnumRating ratingFilm;
    public java.time.Year añoEstrenoFilm;
    public java.util.Date fechaModificacionFilm;
    
    Film()
    {
    }
    
    
        
    

}
