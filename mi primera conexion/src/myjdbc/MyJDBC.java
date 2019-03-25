/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myjdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 *
 * @author julio.ospina
 */

public class MyJDBC {

    /**
     * @param args the command line arguments
     */
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/sakila";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        
        try
        {
            
            connection  = DriverManager.getConnection(DATABASE_URL,"root","contrasena");
            statement = connection.createStatement();
           
            resultset = statement.executeQuery("SELECT * FROM film");
            ResultSetMetaData metaData = resultset.getMetaData();
            
            int numColumnas = metaData.getColumnCount();
            
            System.out.println("Tabla ciudad \n");
            
            for(int i=1; i<= numColumnas;i++)
            {
                String nombreColumna = metaData.getColumnName(i);
                
                
                System.out.printf("%s,",nombreColumna);
                
            }
            
            System.out.println();
            /*
            while(resultset.next())
            {
                
                    
                    System.out.printf("%s;%s;",resultset.getString("city.Name"),resultset.getString("country.Name"));
                    System.out.println();
                
            }*/
            
            
        }
        catch( SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        finally
        {
            try
            {
                resultset.close();
                statement.close();
                connection.close();
                
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
                
            }
        }
        
    }
    
}
