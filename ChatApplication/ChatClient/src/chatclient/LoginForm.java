/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DaleRoyFall
 */
public class LoginForm extends javax.swing.JFrame {

    // Mouse event
    private MouseEvent getPositionEvent;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();

        resultLabel.setForeground(Color.red);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDragWindow = new javax.swing.JPanel();
        jPanelCloseWindow = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        portField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        connectToServerButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jPanelDragWindow.setBackground(new java.awt.Color(1, 50, 67));
        jPanelDragWindow.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelDragWindowMouseDragged(evt);
            }
        });
        jPanelDragWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelDragWindowMousePressed(evt);
            }
        });

        jPanelCloseWindow.setBackground(new java.awt.Color(228, 241, 254));
        jPanelCloseWindow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelCloseWindowMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCloseWindowLayout = new javax.swing.GroupLayout(jPanelCloseWindow);
        jPanelCloseWindow.setLayout(jPanelCloseWindowLayout);
        jPanelCloseWindowLayout.setHorizontalGroup(
            jPanelCloseWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        jPanelCloseWindowLayout.setVerticalGroup(
            jPanelCloseWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelDragWindowLayout = new javax.swing.GroupLayout(jPanelDragWindow);
        jPanelDragWindow.setLayout(jPanelDragWindowLayout);
        jPanelDragWindowLayout.setHorizontalGroup(
            jPanelDragWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDragWindowLayout.createSequentialGroup()
                .addGap(0, 447, Short.MAX_VALUE)
                .addComponent(jPanelCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelDragWindowLayout.setVerticalGroup(
            jPanelDragWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCloseWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelDragWindow);
        jPanelDragWindow.setBounds(0, 0, 500, 50);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Name");

        portField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        portField.setText("1234");
        portField.setBorder(null);
        portField.setMargin(new java.awt.Insets(20, 2, 2, 2));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Port");

        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameField.setBorder(null);
        nameField.setMargin(new java.awt.Insets(20, 2, 2, 2));

        connectToServerButton.setText("Connect");
        connectToServerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                connectToServerButtonMousePressed(evt);
            }
        });

        resultLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(240, 240, 240));
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(portField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(connectToServerButton)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(connectToServerButton)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 500, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelCloseWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCloseWindowMousePressed
        System.exit(0);
    }//GEN-LAST:event_jPanelCloseWindowMousePressed

    private void jPanelDragWindowMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDragWindowMouseDragged
        // Set new location
        setLocation(evt.getXOnScreen() - getPositionEvent.getX(),
                evt.getYOnScreen() - getPositionEvent.getY());
    }//GEN-LAST:event_jPanelDragWindowMouseDragged

    private void jPanelDragWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelDragWindowMousePressed
        // Get current position
        getPositionEvent = evt;
    }//GEN-LAST:event_jPanelDragWindowMousePressed

    private void connectToServerButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connectToServerButtonMousePressed
        String name = nameField.getText();
        String port = portField.getText();

        if (name.isEmpty()) {
            resultLabel.setText("Invalid name!");
        } else if (port.isEmpty()) {
            resultLabel.setText("Invalid port!");
        } else {
            try {
                // Verify connection to server
                Socket socket = new Socket("localhost", Integer.parseInt(port));
                
                // Dispose this form
                this.dispose();
                
                // Create client form
                ClientForm clientForm = new ClientForm(socket, name, Integer.parseInt(port));
                Alignment.alignWindowToPoint(clientForm, this.getLocation());
                clientForm.setVisible(true);
                
            } catch (IOException ex) {
                resultLabel.setText("Can't connect to server!");
            }
        }


    }//GEN-LAST:event_connectToServerButtonMousePressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectToServerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCloseWindow;
    private javax.swing.JPanel jPanelDragWindow;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel resultLabel;
    // End of variables declaration//GEN-END:variables
}