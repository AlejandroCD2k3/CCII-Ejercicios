/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author juanc
 */
public class Ventana extends javax.swing.JFrame {
    
    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablero = new javax.swing.JTextArea();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 51));
        setForeground(new java.awt.Color(51, 102, 0));

        tablero.setEditable(false);
        tablero.setColumns(20);
        tablero.setRows(5);
        jScrollPane1.setViewportView(tablero);

        suma.setBackground(new java.awt.Color(204, 255, 153));
        suma.setForeground(new java.awt.Color(51, 102, 0));
        suma.setText("+");

        resta.setBackground(new java.awt.Color(204, 255, 153));
        resta.setForeground(new java.awt.Color(51, 102, 0));
        resta.setText("-");

        multiplicacion.setBackground(new java.awt.Color(204, 255, 153));
        multiplicacion.setForeground(new java.awt.Color(51, 102, 0));
        multiplicacion.setText("*");

        division.setBackground(new java.awt.Color(204, 255, 153));
        division.setForeground(new java.awt.Color(51, 102, 0));
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        uno.setBackground(new java.awt.Color(255, 204, 153));
        uno.setText("1");

        dos.setBackground(new java.awt.Color(255, 204, 153));
        dos.setText("2");

        tres.setBackground(new java.awt.Color(255, 204, 153));
        tres.setText("3");

        cuatro.setBackground(new java.awt.Color(255, 204, 153));
        cuatro.setText("4");

        cinco.setBackground(new java.awt.Color(255, 204, 153));
        cinco.setText("5");

        seis.setBackground(new java.awt.Color(255, 204, 153));
        seis.setText("6");

        ocho.setBackground(new java.awt.Color(255, 204, 153));
        ocho.setText("8");

        siete.setBackground(new java.awt.Color(255, 204, 153));
        siete.setText("7");

        nueve.setBackground(new java.awt.Color(255, 204, 153));
        nueve.setText("9");

        cero.setBackground(new java.awt.Color(255, 204, 153));
        cero.setText("0");

        borrar.setBackground(new java.awt.Color(255, 153, 153));
        borrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        borrar.setForeground(new java.awt.Color(102, 0, 0));
        borrar.setText("Borrar");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        enter.setBackground(new java.awt.Color(204, 255, 153));
        enter.setForeground(new java.awt.Color(51, 102, 0));
        enter.setText("Enter");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cuatro)
                                .addGap(18, 18, 18)
                                .addComponent(cinco)
                                .addGap(18, 18, 18)
                                .addComponent(seis))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uno)
                                .addGap(18, 18, 18)
                                .addComponent(dos)
                                .addGap(18, 18, 18)
                                .addComponent(tres))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siete)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cero)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ocho)
                                        .addGap(18, 18, 18)
                                        .addComponent(nueve))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(borrar)
                        .addGap(65, 65, 65)
                        .addComponent(suma)
                        .addGap(18, 18, 18)
                        .addComponent(multiplicacion)
                        .addGap(18, 18, 18)
                        .addComponent(resta)
                        .addGap(18, 18, 18)
                        .addComponent(division)
                        .addGap(28, 28, 28)
                        .addComponent(enter)
                        .addGap(29, 29, 29)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(uno)
                                            .addComponent(dos)
                                            .addComponent(tres))
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cinco)
                                            .addComponent(seis)
                                            .addComponent(cuatro))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(siete)
                                    .addComponent(ocho)
                                    .addComponent(nueve))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cero)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(suma)
                                .addComponent(multiplicacion)
                                .addComponent(resta)
                                .addComponent(division)
                                .addComponent(enter))
                            .addComponent(borrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divisionActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterActionPerformed
    
    public JScrollPane getJScrollPane2(){
        return jScrollPane2;
    }
    
    public JPanel getJPanel1(){
        return jPanel1;
    }
    
    public void setJPanel1(JPanel jPanel1){
        this.jPanel1 = jPanel1;
    }
    /*
    public void actualizarVista(){
        jScrollPane2.removeAll();
        Rectangle rectangulo = jPanel1.getBounds();
        jPanel1 = this.miArbol.getDibujo();
        jPanel1.setBounds(rectangulo);
        jPanel1.setVisible(true);
        jScrollPane2.add(jPanel1);
        jScrollPane2.updateUI();
    }
    */
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton borrar;
    public javax.swing.JButton cero;
    public javax.swing.JButton cinco;
    public javax.swing.JButton cuatro;
    public javax.swing.JButton division;
    public javax.swing.JButton dos;
    public javax.swing.JButton enter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton multiplicacion;
    public javax.swing.JButton nueve;
    public javax.swing.JButton ocho;
    public javax.swing.JButton resta;
    public javax.swing.JButton seis;
    public javax.swing.JButton siete;
    public javax.swing.JButton suma;
    public javax.swing.JTextArea tablero;
    public javax.swing.JButton tres;
    public javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
