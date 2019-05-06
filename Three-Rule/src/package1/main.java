package package1;

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        field1 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field4 = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calculate_again = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Three Rule Calculator");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Grenadier NF", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rule Of Three Calculator");

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
        field3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                field3FocusLost(evt);
            }
        });

        field4.setBackground(new java.awt.Color(0, 0, 0));
        field4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        field4.setForeground(new java.awt.Color(255, 255, 255));
        field4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field4FocusGained(evt);
            }
        });

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

        close.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 1, 14)); // NOI18N
        jLabel2.setText("IS");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(calculate)
                .addGap(67, 67, 67)
                .addComponent(clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(calculate_again)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate)
                    .addComponent(clear)
                    .addComponent(close))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculate_again)
                .addGap(18, 18, 18))
        );

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

        if (field4.getText().isEmpty()) {

            field4.setText(null);

            field1c = Float.parseFloat(field1.getText());

            field2c = Float.parseFloat(field2.getText());

            field3c = Float.parseFloat(field3.getText());

            float result = (field3c * field2c) / field1c;

            String resultfinal = Float.toString(result);

            field4.setText(resultfinal);
            option = 1;

        } else if (field3.getText().isEmpty()) {

            field1c = Float.parseFloat(field1.getText());

            field2c = Float.parseFloat(field2.getText());

            field4c = Float.parseFloat(field4.getText());

            float result = (field4c * field1c) / field2c;

            String resultfinal = Float.toString(result);

            field3.setText(resultfinal);

            option = 2;

        } else if (field1.getText().isEmpty()) {

            field2c = Float.parseFloat(field2.getText());

            field3c = Float.parseFloat(field3.getText());

            field4c = Float.parseFloat(field4.getText());

            float result = (field3c * field2c) / field4c;

            String resultfinal = Float.toString(result);

            field1.setText(resultfinal);

            option = 3;

        } else if (field2.getText().isEmpty()) {

            field1c = Float.parseFloat(field1.getText());

            field3c = Float.parseFloat(field3.getText());

            field4c = Float.parseFloat(field4.getText());

            float result = (field4c * field1c) / field3c;

            String resultfinal = Float.toString(result);

            field2.setText(resultfinal);

            option = 4;

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
        field4.setEditable(true);


    }//GEN-LAST:event_clearActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        if (evt.getSource().equals(close)) {

            System.exit(0);

        }
    }//GEN-LAST:event_closeActionPerformed


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

    private void field4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field4FocusGained
        // TODO add your handling code here:

        if (field4.getText().isEmpty()) {

            field4.setText(null);

            field1c = Float.parseFloat(field1.getText());

            field2c = Float.parseFloat(field2.getText());

            field3c = Float.parseFloat(field3.getText());

            float result = (field3c * field2c) / field1c;

            String resultfinal = Float.toString(result);

            field4.setText(resultfinal);
            option = 1;
        }
    }//GEN-LAST:event_field4FocusGained

    private void field3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field3FocusLost
        // TODO add your handling code here:
        
        field4.requestFocusInWindow();
        
      /*  

        if (field4.getText().isEmpty()) {

            field4.setText(null);

            field1c = Float.parseFloat(field1.getText());

            field2c = Float.parseFloat(field2.getText());

            field3c = Float.parseFloat(field3.getText());

            float result = (field3c * field2c) / field1c;

            String resultfinal = Float.toString(result);

            field4.setText(resultfinal);
            option = 1;
        } */
    }//GEN-LAST:event_field3FocusLost

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
    private javax.swing.JButton calculate;
    private javax.swing.JButton calculate_again;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
