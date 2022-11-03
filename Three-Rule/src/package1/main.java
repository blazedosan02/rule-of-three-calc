package package1;

import java.awt.Color;
import java.awt.Toolkit;
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
        mainPanel = new javax.swing.JPanel();
        proportionA = new javax.swing.JLabel();
        proportionB = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        field1 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field4 = new javax.swing.JTextField();
        arrowLabel = new javax.swing.JLabel();
        arrowLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        about = new javax.swing.JMenu();
        aboutmenu = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        lightTheme = new javax.swing.JMenuItem();
        darkTheme = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rule Of Three Calculator");
        setResizable(false);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(492, 210));

        proportionA.setBackground(new java.awt.Color(0, 0, 0));
        proportionA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proportionA.setText("Proportion A");

        proportionB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proportionB.setText("Proportion B");

        clear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.setPreferredSize(new java.awt.Dimension(172, 27));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        field1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        field1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field1.setText("0");
        field1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        field1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field1FocusGained(evt);
            }
        });
        field1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field1KeyReleased(evt);
            }
        });

        field3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        field3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field3.setText("0");
        field3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        field3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field3FocusGained(evt);
            }
        });
        field3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field3KeyReleased(evt);
            }
        });

        field2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        field2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field2.setText("0");
        field2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        field2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                field2FocusGained(evt);
            }
        });
        field2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                field2KeyReleased(evt);
            }
        });

        field4.setEditable(false);
        field4.setBackground(new java.awt.Color(153, 153, 153));
        field4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        field4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        field4.setText("X");
        field4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        arrowLabel.setText("-->");

        arrowLabel2.setText("-->");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(proportionA)
                    .addComponent(proportionB))
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(arrowLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(arrowLabel)
                                .addGap(18, 18, 18)
                                .addComponent(field2))))
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proportionA)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrowLabel)
                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proportionB)
                    .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrowLabel2)
                    .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        about.setText("File");

        aboutmenu.setText("About");
        aboutmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutmenuActionPerformed(evt);
            }
        });
        about.add(aboutmenu);

        menuBar.add(about);

        editMenu.setText("View");

        lightTheme.setText("Light Theme");
        lightTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightThemeActionPerformed(evt);
            }
        });
        editMenu.add(lightTheme);

        darkTheme.setText("Dark Theme");
        darkTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkThemeActionPerformed(evt);
            }
        });
        editMenu.add(darkTheme);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed

        field1.setText("0");
        field2.setText("0");
        field3.setText("0");
        field4.setText("X");

        field1.setEditable(true);
        field2.setEditable(true);
        field3.setEditable(true);
        field4.setEditable(false);


    }//GEN-LAST:event_clearActionPerformed


    private void lightThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightThemeActionPerformed

        mainPanel.setBackground(Color.white);

        proportionA.setForeground(Color.black);

        proportionB.setForeground(Color.black);

        arrowLabel.setForeground(Color.black);

        arrowLabel2.setForeground(Color.black);

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

        mainPanel.setBackground(new Color(20, 20, 20));

        proportionA.setForeground(Color.white);

        proportionB.setForeground(Color.white);

        arrowLabel.setForeground(Color.white);

        arrowLabel2.setForeground(Color.white);

        //Field Colors
        field1.setForeground(Color.white);

        field1.setBackground(new Color(51, 51, 51));

        field2.setForeground(Color.white);

        field2.setBackground(new Color(51, 51, 51));

        field3.setForeground(Color.white);

        field3.setBackground(new Color(51, 51, 51));

        field4.setForeground(Color.white);

        field4.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_darkThemeActionPerformed

    private void aboutmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutmenuActionPerformed

        JOptionPane.showMessageDialog(null, "Version 2.0\nMarco Lecona 2018-2022");

    }//GEN-LAST:event_aboutmenuActionPerformed

    private void field1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field1KeyReleased

        calculate();

    }//GEN-LAST:event_field1KeyReleased

    private void field2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field2KeyReleased

        calculate();

    }//GEN-LAST:event_field2KeyReleased

    private void field3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_field3KeyReleased

        calculate();

    }//GEN-LAST:event_field3KeyReleased

    private void field1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field1FocusGained

        createFilteredField(field1);

        setZero(field1);


    }//GEN-LAST:event_field1FocusGained

    private void field2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field2FocusGained

        createFilteredField(field2);

        setZero(field2);


    }//GEN-LAST:event_field2FocusGained

    private void field3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field3FocusGained

        createFilteredField(field3);

        setZero(field3);

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

    public void calculate() {

        try {

            field4.setText(null);

            field1c = Float.parseFloat(field1.getText());

            field2c = Float.parseFloat(field2.getText());

            field3c = Float.parseFloat(field3.getText());

            float result = (field3c * field2c) / field1c;

            String resultfinal = Float.toString(result);

            field4.setText(resultfinal);

        } catch (NumberFormatException num) {

            field4.setText("0");

        }

    }

    public void setZero(JTextField field) {

        if (field.getText().equals("0")) {

            field.setText("");

        }
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
    private javax.swing.JMenu about;
    private javax.swing.JMenuItem aboutmenu;
    private javax.swing.JLabel arrowLabel;
    private javax.swing.JLabel arrowLabel2;
    private javax.swing.JButton clear;
    private javax.swing.JMenuItem darkTheme;
    private javax.swing.JMenu editMenu;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem lightTheme;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel proportionA;
    private javax.swing.JLabel proportionB;
    // End of variables declaration//GEN-END:variables
}
