/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Logs.log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Allisson Castro
 */
public class Conexion {         
   
    
    public static Connection getConexion() {                  
        
        log lo = new log();
        String con1 = "Conexion";    
        String con2 = ""; 
            
        
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"                
                + "database=FarmaciaSAG;"
                + "user=sa;"
                + "password=1234;"
                + "loginTimeout=30;";

        try {                                  
            Connection con = DriverManager.getConnection(conexionUrl);          
            return con;
        } catch (SQLException ex) {                                                
            lo.LogBitacora("No se pudo establecer la conexión con la base de datos" + ex,con1, con2);            
            System.out.println(ex.toString());
            return null;
        }
    }
}
