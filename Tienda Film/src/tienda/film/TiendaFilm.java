/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.film;
import java.sql.*;
/**
 *
 * @author julio.ospina
 */
public class TiendaFilm {

    /**
     * @param args the command line arguments
     */
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/sakila";
    public static void main(String[] args) {
        // TODO code application logic here
        
        MenuLogin myventana = new MenuLogin();
        myventana.setVisible(true);
    }
    
}
