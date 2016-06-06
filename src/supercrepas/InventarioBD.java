/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercrepas;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis ferrnando
 */
public class InventarioBD extends javax.swing.JFrame {

      
        

    
    public InventarioBD() {
        initComponents();
   iniciarTabla();
        this.setLocationRelativeTo(null); }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlumnos2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar1.setText("Mostar en tablas");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        tblAlumnos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblAlumnos2);

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregar1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnAgregar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(191, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
class tabla1 extends Thread {

        public void run() {

            //se borra el contenido de la tabla
            try {
                int filas = modelo.getRowCount();
                for (int i = 0; filas > i; i++) {
                    modelo.removeRow(0);
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }

            //se agregan los datos
            procesar cargar = new procesar();
            ArrayList<Productos> arrUser = cargar.Inventario();
            while (!arrUser.isEmpty()) {
                Productos x = arrUser.remove(0);
//                modelo.addRow(x.getRow());
                try {
                    sleep(600);
                } catch (InterruptedException e) {
                }
            }
        }
    }
 class tabla2 extends Thread {

        public void run() {

            //se borra el contenido de la tabla
            try {
                int filas = modelo2.getRowCount();
                for (int i = 0; filas > i; i++) {
                    modelo2.removeRow(0);
                }
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }

            //se agregan los datos
            procesar cargar = new procesar();
            ArrayList<Productos> arrUser = cargar.Inventario();
            while (!arrUser.isEmpty()) {
                Productos x = arrUser.remove(0);
             modelo2.addRow(x.getRow());
                try {
                    sleep(800);
                } catch (InterruptedException e) {
                }
            }
        }
    }
    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        new tabla1().start();
        new tabla2().start();
    }//GEN-LAST:event_btnAgregar1ActionPerformed

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
            java.util.logging.Logger.getLogger(InventarioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarioBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarioBD().setVisible(true);
            }
        });
    }
     DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
  void iniciarTabla() {

        String encabezado[] = {"leche", "harina", "chongos","fresa","zarzamora","cajeta","philadelfia ","nutella"};

        modelo.setColumnIdentifiers(encabezado);
        tblAlumnos.setModel(modelo);
        
        modelo2.setColumnIdentifiers(encabezado);
        tblAlumnos2.setModel(modelo2);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTable tblAlumnos2;
    // End of variables declaration//GEN-END:variables
}
