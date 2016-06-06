/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;

import java.util.Vector;

/**
 *
 * @author luis ferrnando
 */
public class Productos {
   double cajeta ;
     double nutella ;
     double philadelfia ;
     double leche ;
    double harina ;
  double zarzamora ;
   double fresa;
     double chongos ;
     String fecha;
   public Productos (){}
  public Productos ( double leche, double harina, double chongos, double fresa, double zarzamora, double cajeta, double philadelfia,double nutella)
  {this.cajeta=cajeta;
  this.leche=leche;
  this.harina=harina;
  this.chongos=chongos;
  this.fresa=fresa;
  this.zarzamora=zarzamora;
  this.philadelfia=philadelfia;
  this.fecha=fecha;
  }

    public String getfecha(){
    return fecha;
    }
    public double getCajeta() {
        return cajeta;
    }
public void setfecha(String fecha){
this.fecha=fecha;
}
    /**
     * @param cajeta the cajeta to set
     */
    public void setCajeta(double cajeta) {
        this.cajeta = cajeta;
    }

    /**
     * @return the nutella
     */
    public double getNutella() {
        return nutella;
    }

    /**
     * @param nutella the nutella to set
     */
    public void setNutella(double nutella) {
        this.nutella = nutella;
    }

    /**
     * @return the philadelfia
     */
    public double getPhiladelfia() {
        return philadelfia;
    }

    /**
     * @param philadelfia the philadelfia to set
     */
    public void setPhiladelfia(double philadelfia) {
        this.philadelfia = philadelfia;
    }

    /**
     * @return the leche
     */
    public double getLeche() {
        return leche;
    }

    /**
     * @param leche the leche to set
     */
    public void setLeche(double leche) {
        this.leche = leche;
    }

    /**
     * @return the harina
     */
    public double getHarina() {
        return harina;
    }

    /**
     * @param harina the harina to set
     */
    public void setHarina(double harina) {
        this.harina = harina;
    }

    /**
     * @return the zarzamora
     */
    public double getZarzamora() {
        return zarzamora;
    }

    /**
     * @param zarzamora the zarzamora to set
     */
    public void setZarzamora(double zarzamora) {
        this.zarzamora = zarzamora;
    }

    /**
     * @return the fresa
     */
    public double getFresa() {
        return fresa;
    }

    /**
     * @param fresa the fresa to set
     */
    public void setFresa(double fresa) {
        this.fresa = fresa;
    }

    /**
     * @return the chongos
     */
    public double getChongos() {
        return chongos;
    }

    /**
     * @param chongos the chongos to set
     */
    public void setChongos(double chongos) {
        this.chongos = chongos;
    }

    String[] getRow() {
        String [] row = new String[8];
        row[0] = ""+leche;
        row[1] =""+ harina ;
         row[2] = ""+chongos;
        row[3] = ""+fresa;
         row[4] = ""+zarzamora;
          row[5] = ""+cajeta    ;
          row[6] = ""+philadelfia   ;
           row[7] = ""+nutella;
           
        
        
        return row;
    }
    
    
}
