/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author luis ferrnando
 */
public class procesar {
      public void agregarUsuario(usuarios user) {
        Conectar conn = new Conectar();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO usuario VALUES('" + user.Nombre + "', '" + user.Usuario+ "', '" + user.Contraseña+ "', '"+"empleado"+  "')";
            consulta.executeUpdate(sql);
            System.out.println("Usuario registrado");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }
 public void Existencia(Productos inven) {
        Conectar conn = new Conectar();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO productos VALUES('" + inven.leche+ "', '" + inven.harina+ "', '" + inven.chongos+ "', '"+ inven.fresa+  "', '" +inven.zarzamora+ "', '" +inven.cajeta+ "', '" +inven.philadelfia+"', '" +inven.nutella+ "')";
            consulta.executeUpdate(sql);
            System.out.println("Inventario actualizado ");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }
 public void Ventas(Productos inven) {
        Conectar conn = new Conectar();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO ventas VALUES('" + inven.leche+ "', '" + inven.harina+ "', '" + inven.chongos+ "', '"+ inven.fresa+  "', '" +inven.zarzamora+ "', '" +inven.cajeta+ "', '" +inven.philadelfia+"', '" +inven.nutella+ "')";
            consulta.executeUpdate(sql);
            System.out.println("Inventario actualizado ");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }
 public void Surtir (Productos inven) {
        Conectar conn = new Conectar();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO productos surtir('" + inven.leche+ "', '" + inven.harina+ "', '" + inven.chongos+ "', '"+ inven.fresa+  "', '" +inven.zarzamora+ "', '" +inven.cajeta+ "', '" +inven.philadelfia+"', '" +inven.nutella+ "')";
            consulta.executeUpdate(sql);
            System.out.println("Inventario actualizado ");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }
    public ArrayList<Productos> Inventario() {
        ArrayList<Productos> arrUser = new ArrayList<>();
        Conectar conn = new Conectar();
        String sql = "SELECT * FROM productos";
        try {
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Productos produ = new Productos(rs.getDouble("harina"),rs.getDouble("chongos"),rs.getDouble("leche") ,rs.getDouble("fresa"),rs.getDouble("zarzamora"),rs.getDouble("cajeta"),rs.getDouble("philadelfia"),rs.getDouble("nutella"));
                arrUser.add(produ);
               
                
            }
            rs.close();
            st.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrUser;
        
    }

}
