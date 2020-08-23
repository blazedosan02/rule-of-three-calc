package package1;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Blaze
 */
public class main extends javax.swing.JFrame {

    float field1c, field2c, field3c, field4c;
    int option = 0;

    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field4 = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calculate_again = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        about = new javax.swing.JMenu();
        aboutmenu = new javax.swing.JMenuItem();
        closeMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        lightTheme = new javax.swing.JMenuItem();
        darkTheme = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Three Rule Calculator");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");

        field1.setBackground(new java.awt.Color(0, 0, 0));
        field1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        field1.setForeground(new java.awt.Color(255, 255, 255));
        field1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        field2.setBackground(new java.awt.Color(0, 0, 0));
        field2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        field2.setForeground(new java.awt.Color(255, 255, 255));
        field2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        field3.setBackground(new java.awt.Color(0, 0, 0));
        field3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        field3.setForeground(new java.awt.Color(255, 255, 255));
        field3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        field4.setEditable(false);
        field4.setBackground(new java.awt.Color(0, 0, 0));
        field4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        field4.setForeground(new java.awt.Color(255, 255, 255));
        field4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        calculate.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Proportion A");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proportion B");

        calculate_again.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        calculate_again.setText("Calculate Again");
        calculate_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_againActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addComponent(calculate))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(calculate_again)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clear)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(calculate)
                        .addComponent(calculate_again)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        about.setText("File");

        aboutmenu.setText("About");
        aboutmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutmenuActionPerformed(evt);
            }
        });
        about.add(aboutmenu);

        closeMenu.setText("Close");
        closeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuActionPerformed(evt);
            }
        });
        about.add(closeMenu);

        jMenuBar1.add(about);

        jMenu2.setText("Edit");

        jMenu3.setText("Appearance");

        jMenu4.setText("Theme");

        lightTheme.setText("Light Theme");
        lightTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightThemeActionPerformed(evt);
            }
        });
        jMenu4.add(lightTheme);

        darkTheme.setText("Dark Theme");
        darkTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkThemeActionPerformed(evt);
            }
        });
        jMenu4.add(darkTheme);

        jMenu3.add(jMenu4);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        
        

        if (field1.getText().isEmpty() || field2.getText().isEmpty() || field3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields Are Empty 1");

        } else if (field4.getText().isEmpty()) {

            field4.setText(null);

            field1c = Float.parseFloat(field1.getText());

            field2c = Float.parseFloat(field2.getText());

            field3c = Float.parseFloat(field3.getText());

            float result = (field3c * field2c) / field1c;

            String resultfinal = Float.toString(result);

            field4.setText(resultfinal);
            option = 1;

        } else {

            JOptionPane.showMessageDialog(null, "Fields Are Empty 2");
        }


    }//GEN-LAST:event_calculateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:

        field1.setText(null);
        field2.setText(null);
        field3.setText(null);
        field4.setText(null);

        field1.setEditable(true);
        field2.setEditable(true);
        field3.setEditable(true);
        field4.setEditable(false);


    }//GEN-LAST:event_clearActionPerformed


    private void calculate_againActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_againActionPerformed
        // TODO add your handling code here:

        if (option == 1) {

            field4.setText(null);

        } else if (option == 2) {

            field3.setText(null);

        } else if (option == 3) {

            field1.setText(null);

        } else if (option == 4) {

            field2.setText(null);

        } else {
            JOptionPane.showMessageDialog(null, "Fields Are Empty");
        }
    }//GEN-LAST:event_calculate_againActionPerformed

    private void lightThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightThemeActionPerformed
        // TODO add your handling code here:

        //Panel color
        jPanel1.setBackground(Color.white);

        //Label Colors
        jLabel3.setForeground(Color.black);

        jLabel4.setForeground(Color.black);

        //Field Colors
        field1.setForeground(Color.black);

        field1.setBackground(Color.white);

        field2.setForeground(Color.black);

        field2.setBackground(Color.white);

        field3.setForeground(Color.black);

        field3.setBackground(Color.white);

        field4.setForeground(Color.black);

        field4.setBackground(Color.white);
    }//GEN-LAST:event_lightThemeActionPerformed

    private void darkThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkThemeActionPerformed
        // TODO add your handling code here:

        //Panel color
        jPanel1.setBackground(Color.black);

        //Label Colors
        jLabel3.setForeground(Color.white);

        jLabel4.setForeground(Color.white);

        //Field Colors
        field1.setForeground(Color.white);

        field1.setBackground(Color.black);

        field2.setForeground(Color.white);

        field2.setBackground(Color.black);

        field3.setForeground(Color.white);

        field3.setBackground(Color.black);

        field4.setForeground(Color.white);

        field4.setBackground(Color.black);
    }//GEN-LAST:event_darkThemeActionPerformed

    private void closeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_closeMenuActionPerformed

    private void aboutmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutmenuActionPerformed
        // TODO add your handling code here:

        JOptionPane.showMessageDialog(null, "Version 1.2\nMarco Lecona 2018-2020");
    }//GEN-LAST:event_aboutmenuActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem aboutmenu;
    private javax.swing.JButton calculate;
    private javax.swing.JButton calculate_again;
    private javax.swing.JButton clear;
    private javax.swing.JMenuItem closeMenu;
    private javax.swing.JMenuItem darkTheme;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem lightTheme;
    // End of variables declaration//GEN-END:variables
}
