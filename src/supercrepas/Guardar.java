/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author luis ferrnando
 */
public class Guardar {

    String Usuario;
    String Contraseña;
    String Nombre;
    int TipoUsu;

    public void guardar_Empleado(int usua, String usuario, String contraseña) {

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("administrador.txt"));
            pw.println(usuario + "," + contraseña + "," + usua);

            pw.close();
            JOptionPane.showMessageDialog(null, "HAS GUARDADO UN NUEVO USUARIO ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "tu error es " + e);
        }

    }

    public int verificarUgeneral(String usuario, String contraseña) {
        int tipo = 0;
        try {
            procesar p=new procesar();
            String linea ;
            while ((linea = br.readLine) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String Vusuario = st.nextToken().trim();
                String Vcontraseña = st.nextToken().trim();
                if (usuario.equals(Vusuario) && contraseña.equals(Vcontraseña)) {
                    tipo = Integer.parseInt(st.nextToken().trim());
                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "el error es " + e);
        }
        return tipo;
    }

    public void bajas(double nutella, double leche, double harina, double chongos, double fresa, double zarzamora, double cajeta, double philadelfia) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("bajas"));
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                double Gnutella = Double.parseDouble(st.nextToken().trim());
                Gnutella += nutella;
                double Gleche = Double.parseDouble(st.nextToken().trim());
                Gleche += leche;
                double Gharina = Double.parseDouble(st.nextToken().trim());
                Gharina += harina;
                double Gchongos = Double.parseDouble(st.nextToken().trim());
                Gchongos += chongos;

                double Gfresa = Double.parseDouble(st.nextToken().trim());
                Gfresa += fresa;
                double Gzarzamora = Double.parseDouble(st.nextToken().trim());
                Gzarzamora += zarzamora;
                double Gcajeta = Double.parseDouble(st.nextToken().trim());
                Gcajeta += cajeta;
                double Gphiladelfia = Double.parseDouble(st.nextToken().trim());
                Gphiladelfia += philadelfia;
                     PrintWriter prw= new PrintWriter(new FileWriter("bajas"));
     prw.print(Gnutella+","+Gleche+","+Gharina+","+Gchongos+","+Gfresa+","+Gzarzamora+","+Gcajeta+","+Gphiladelfia+",");
prw.close();

            }
        } catch (Exception e) {}


    }

}
