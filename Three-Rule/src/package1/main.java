package package1;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

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
        jLabel1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        calculate_again = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        field1 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field4 = new javax.swing.JTextField();
        arrowLabel = new javax.swing.JLabel();
        arrowLabel2 = new javax.swing.JLabel();
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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Three Rule Calculator");
        setResizable(false);

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setPreferredSize(new java.awt.Dimension(492, 210));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Proportion A");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Proportion B");

        calculate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        calculate_again.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calculate_again.setText("Calculate Again");
        calculate_again.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_againActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        field1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        field1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field1.setText("0");
        field1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field1FocusGained(evt);
            }
        });

        field3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        field3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field3.setText("0");
        field3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field3FocusGained(evt);
            }
        });

        field2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        field2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field2.setText("0");
        field2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field2FocusGained(evt);
            }
        });

        field4.setEditable(false);
        field4.setBackground(new java.awt.Color(153, 153, 153));
        field4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        field4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field4.setText("X");

        arrowLabel.setText("-->");

        arrowLabel2.setText("-->");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(calculate))
                .addGap(28, 28, 28)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(arrowLabel)
                        .addGap(13, 13, 13)
                        .addComponent(field2))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calculate_again)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(arrowLabel2)))
                        .addGap(11, 11, 11)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(clear))
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(field4)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrowLabel))
                .addGap(29, 29, 29)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrowLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate)
                    .addComponent(calculate_again)
                    .addComponent(clear))
                .addGap(25, 25, 25))
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
            .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        field1.setText("0");
        field2.setText("0");
        field3.setText("0");
        field4.setText("0");

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

        JOptionPane.showMessageDialog(null, "Version 1.3\nMarco Lecona 2018-2020");
    }//GEN-LAST:event_aboutmenuActionPerformed

    private void field1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field1FocusGained
        // TODO add your handling code here:

        field1.setText("");

        createFilteredField(field1);

    }//GEN-LAST:event_field1FocusGained

    private void field2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field2FocusGained

        field2.setText("");

        createFilteredField(field2);

    }//GEN-LAST:event_field2FocusGained

    private void field3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field3FocusGained

        field3.setText("");

        createFilteredField(field3);
    }//GEN-LAST:event_field3FocusGained

    public void createFilteredField(JTextField field) {

        AbstractDocument document = (AbstractDocument) field.getDocument();
        final int maxCharacters = 25;
        document.setDocumentFilter(new DocumentFilter() {
            public void replace(DocumentFilter.FilterBypass fb, int offs, int length,
                    String str, AttributeSet a) throws BadLocationException {

                String text = fb.getDocument().getText(0,
                        fb.getDocument().getLength());
                text += str;
                if ((fb.getDocument().getLength() + str.length() - length) <= maxCharacters
                        && text.matches("([+-]?(?=\\.\\d|\\d)(?:\\d+)?(?:\\.?\\d*))(?:[eE]([+-]?\\d+))?")) {
                    super.replace(fb, offs, length, str, a);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }

            public void insertString(DocumentFilter.FilterBypass fb, int offs, String str,
                    AttributeSet a) throws BadLocationException {

                String text = fb.getDocument().getText(0,
                        fb.getDocument().getLength());
                text += str;
                if ((fb.getDocument().getLength() + str.length()) <= maxCharacters
                        && text.matches("([+-]?(?=\\.\\d|\\d)(?:\\d+)?(?:\\.?\\d*))(?:[eE]([+-]?\\d+))?")) {
                    super.insertString(fb, offs, str, a);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        });

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JPanel Panel2;
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem aboutmenu;
    private javax.swing.JLabel arrowLabel;
    private javax.swing.JLabel arrowLabel2;
    private javax.swing.JButton calculate;
    private javax.swing.JButton calculate_again;
    private javax.swing.JButton clear;
    private javax.swing.JMenuItem closeMenu;
    private javax.swing.JMenuItem darkTheme;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem lightTheme;
    // End of variables declaration//GEN-END:variables
}
