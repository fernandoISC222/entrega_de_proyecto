/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;

import java.io.PrintWriter;

/**
 *
 * @author luis ferrnando
 */
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class Surtir extends javax.swing.JFrame {

    /**
     * Creates new form Surtir
     */
    public Surtir() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Sleche = new javax.swing.JTextField();
        Sphiladelfia = new javax.swing.JTextField();
        Scajeta = new javax.swing.JTextField();
        Szarzamora = new javax.swing.JTextField();
        Sfresa = new javax.swing.JTextField();
        Schongos = new javax.swing.JTextField();
        Sharina = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Snutella = new javax.swing.JTextField();
        actualizar1 = new javax.swing.JButton();
        Sphi = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ZARZAMORA");

        jLabel2.setText("FRESA");

        jLabel3.setText("PHILADELFIA ");

        jLabel4.setText("CAJETA");

        jLabel5.setText("HARINA");

        jLabel6.setText("LECHE");

        jLabel7.setText("CHONGOS");

        Sleche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SlecheActionPerformed(evt);
            }
        });

        Sphiladelfia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SphiladelfiaActionPerformed(evt);
            }
        });

        Sfresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SfresaActionPerformed(evt);
            }
        });

        Sharina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SharinaActionPerformed(evt);
            }
        });

        jButton2.setText("regresar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("NUTELLA");

        actualizar1.setText("actualizar ");
        actualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar1MouseClicked(evt);
            }
        });
        actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Sfresa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sleche, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sphiladelfia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Scajeta, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Szarzamora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(Snutella, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Schongos)
                                    .addComponent(Sphi, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(Sharina, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 331, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(actualizar1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Snutella, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Sleche, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sharina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Schongos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sfresa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Szarzamora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Scajeta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Sphiladelfia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sphi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualizar1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SfresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SfresaActionPerformed
       
    }//GEN-LAST:event_SfresaActionPerformed

    private void SphiladelfiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SphiladelfiaActionPerformed
        Sphiladelfia.setEditable(false);
    }//GEN-LAST:event_SphiladelfiaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ventas().setVisible(true);

//        Iunventario.lzarzamora.setText(String.valueOf(zarzamora));
//
//        Iunventario.Tleche.setText(String.valueOf(leche));
//        Iunventario.Tfresa.setText(String.valueOf(fresa));
//        Iunventario.Tharina.setText(String.valueOf(harina));
//        Iunventario.Tzarzamora.setText(String.valueOf(zarzamora));
//        Iunventario.Tnutella.setText(String.valueOf(nutella));
//        Iunventario.Tphiladelfia.setText(String.valueOf(philadelfia));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SlecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SlecheActionPerformed
        Sleche.setEditable(false);
    }//GEN-LAST:event_SlecheActionPerformed

    private void SharinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SharinaActionPerformed
        Sharina.setEditable(false);
    }//GEN-LAST:event_SharinaActionPerformed
    double chongos, leche, fresa, harina, zarzamora, nutella, philadelfia, cajeta;


     
    private void actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar1ActionPerformed
  
    }//GEN-LAST:event_actualizar1ActionPerformed
// double Gchongos, Gleche, Gfresa, Gharina, Gzarzamora, Gnutella, Gphiladelfia, Gcajeta;
    private void actualizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar1MouseClicked
procesar agregar = new procesar();
        Productos x = new Productos();
      
        x.setLeche(Double.parseDouble(Sleche.getText()));
        x.setHarina(Double.parseDouble(Sharina.getText()));
        x.setChongos(Double.parseDouble(Schongos.getText()));
        x.setFresa(Double.parseDouble(Sfresa.getText()));
        x.setZarzamora(Double.parseDouble(Szarzamora.getText()));
        x.setCajeta(Double.parseDouble(Scajeta.getText()));
        x.setPhiladelfia(Double.parseDouble(Sphiladelfia.getText()));
        x.setNutella(Double.parseDouble(Snutella.getText()));
        agregar.Existencia(x);



//     try{
//         String linea ;
//         BufferedReader br=new BufferedReader(new FileReader("guardarS.txt"));
//         while ((linea =br.readLine())!=null){
//         StringTokenizer tk= new StringTokenizer(linea ,",");
//         Double Gchongos=Double.parseDouble(tk.nextToken().trim());
//         Double Gleche=Double.parseDouble(tk.nextToken().trim());
//         Double Gfresa=Double.parseDouble(tk.nextToken().trim());
//         Double Gharina=Double.parseDouble(tk.nextToken().trim());
//         Double Gzarzamora=Double.parseDouble(tk.nextToken().trim());
//         Double Gnutella=Double.parseDouble(tk.nextToken().trim());
//         Double Gphiladelfia=Double.parseDouble(tk.nextToken().trim());
//         Double Gcajeta=Double.parseDouble(tk.nextToken().trim());
//         
//         }
//         
//     }
//     
//     catch(Exception e){
//     JOptionPane.showMessageDialog(null, "error al tomar los valores guardados "+e);
//     }
//        
//        
//        try {
//      PrintWriter prw= new PrintWriter(new FileWriter("guardarS.txt"));  
//  prw.print((Gnutella+Snutella.getText())+","+(Sleche.getText()+Gleche)+","+(Sharina.getText()+Gharina)+","+(Schongos.getText()+Gchongos)+","+(Sfresa.getText()+Gfresa)+","+(Szarzamora.getText()+Gzarzamora)+","+(Scajeta.getText()+Gcajeta)+","+(Sphiladelfia.getText()+Gphiladelfia));
//  prw.close();
//      } 
//  catch (Exception e){
//    JOptionPane.showMessageDialog(null, "Se produjo el error: " + e);
//  }
    }//GEN-LAST:event_actualizar1MouseClicked
  
    
    public void inv(double philadelfia) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Surtir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Surtir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Surtir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Surtir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Surtir().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Scajeta;
    public static javax.swing.JTextField Schongos;
    private javax.swing.JTextField Sfresa;
    private javax.swing.JTextField Sharina;
    private javax.swing.JTextField Sleche;
    private javax.swing.JTextField Snutella;
    private javax.swing.JTextField Sphi;
    private javax.swing.JTextField Sphiladelfia;
    private javax.swing.JTextField Szarzamora;
    private javax.swing.JButton actualizar1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
