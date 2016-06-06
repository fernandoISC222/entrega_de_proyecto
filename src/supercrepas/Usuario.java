/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;

/**
 *
 * @author iserm
 */
public class Usuario {
  
    private String nombreUs;
    private String password;
 

    public Usuario() {
    }
    
    

    public Usuario(String nombreUs, String password) {
        
        this.nombreUs = nombreUs;
        this.password = password;
      
    }
    
    // Parámetros Set
    public void setNombreUs(String strNombreUs) {
        this.nombreUs = strNombreUs;
    }
    
    public void setPassword(String strPassword) {
        this.password = strPassword;
    }
    
  
    
    // Parámetros Get
    
   
    
    public String getNombreUs() {
        return nombreUs;
    }
    
    public String getPassword() {
        return password;
    }
    
   
    
    String[] getRow() {
        String [] row = new String[3];
       
        row[1] = nombreUs;
        
        
        return row;
    }
}
