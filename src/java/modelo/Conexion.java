/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author santo
 */
public class Conexion {
    //url conexion = jdbc; my sql; local host; puerto
    public final String puerto= "3306";
    public final String bd= "db_empresa";
    public final String urlconexion = String.format("jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,bd);
    public final String usuario = "root";
    public final String contra = "Tamili20000";
    public final String jdbc = "com.mysql.cj.jdbc.Driver";
    public Connection conexionBD;
    public void abrir_conexion(){
        try{  
            Class.forName(jdbc);
            conexionBD=DriverManager.getConnection(urlconexion, usuario, contra);
            System.out.println("Conexion Exitosa");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Algo salio mal :"+ex.getMessage());
        }
    }
   public void cerrar_conexion(){
     try{ 
         conexionBD.close();
        }
        catch(SQLException ex){
            System.out.println("Algo salio mal :"+ex.getMessage());
        }
    }
}
