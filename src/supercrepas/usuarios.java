/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;

/**
 *
 * @author luis ferrnando
 */ 
public class usuarios {
    
   String Nombre, Contraseña,Usuario,Tipo;
  
    

 
          public usuarios(){}
    public usuarios(String Nombre, String usuario, String Contraseña ,String Tipo) {
        this.Usuario= Usuario;
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
         this.Tipo=Tipo;
    }
public void setTipo (String tipo){
this.Tipo=Tipo;
}

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }

    public void setNombre(String name) {
        this.Nombre = name;
    }

    public void setContraseña(String contraseña) {
        this.Contraseña =  contraseña;
    }
public String getTipo(){
return this.Tipo;
}
    public String getUsuario() {
        return this.Usuario;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getContraseña() {
        return this.Contraseña;
    }
    
    String[] getRow() {
        String [] row = new String[3];
        row[0] = Usuario;
        row[1] = Nombre;
        row[2] = Contraseña;
        row[3]=Tipo;
        return row;
    }
   
}
