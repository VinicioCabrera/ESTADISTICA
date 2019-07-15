/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author VINICIO
 */
public class coneccion {
 private Connection conexionBD;  

    public coneccion() {
    
    }
     public Connection getConexionBD() {
        return conexionBD;
    }
   public void conectar(){
       String  url ="jdbc:postgresql://localhost:5432/MiBaseDeDatos";
       String user="postgres";
       String password="alien";
       try{
           conexionBD = DriverManager.getConnection(url,user,password);
           if(conexionBD.isValid(5000)){
               System.out.println("Coneccion exitosa");
           }
       }catch(SQLException ex){
           ex.printStackTrace();
       }
   }
   public void desconectar(){
       try{
           if(!conexionBD.isClosed()){
               conexionBD.close();
               System.out.println("Coneccion desactivada");
           }
       }catch(SQLException ex){
           ex.printStackTrace();
       }
   }
}
