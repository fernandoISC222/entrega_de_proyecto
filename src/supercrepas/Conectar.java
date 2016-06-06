/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luis ferrnando
 */
public class Conectar {
   static String bd="crepass";
   static String login="root";
   static String contraseña ="fernando";
   static String url="jdbc:mysql://localhost/" + bd ;
   
   Connection connection=null;
  
  
   public  Conectar() {
        try {
            //obtenemos el driver de para mysql
            Class.forName("com.mysql.jdbc.Driver");

            //obtenemos la conexión
            //url, login, contraseña
            //
            connection = DriverManager.getConnection("jdbc:mysql://localhost/crepass?user=root&password=fernando");
           
            if (connection != null) {
                System.out.println("Coneccion con DB exitosa");
            }
        }
         catch (SQLException e) {
            System.out.println("Error "+e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

    }
 public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        connection = null;
    }
}

