/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.film;

/**
 *
 * @author julio.ospina
 */
public enum EnumRating 
{
    G("G"), 
    PG("PG"), 
    PG_13("PG-13"), 
    R("R"),
    NC_17("NC-17");
 
    final private String clasificacionFilm;
 
    EnumRating(String clasificacionfilm) {
        this.clasificacionFilm = clasificacionfilm;
    }

    public String getClasificacionFilm() {
        return clasificacionFilm;
    }
    
 
   
}