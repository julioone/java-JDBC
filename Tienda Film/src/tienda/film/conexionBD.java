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
public class conexionBD {
    
    public Connection connection = null;
    public Statement statement = null ;
    

    public conexionBD() {
        
        try
        {
            connection  = DriverManager.getConnection(TiendaFilm.DATABASE_URL,"root","tucamaesmia1");
            statement = connection.createStatement();
            
        }
        
        catch( SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
    
    
  
    
}
