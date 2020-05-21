/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smtp;

import java.awt.event.MouseEvent;
import java.util.Properties;
import javax.mail.AuthenticationFailedException;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import static smtp.Alignment.centerTheWindow;

/**
 *
 * @author User
 */
public class LoginWindow extends javax.swing.JFrame {

    MouseEvent getPositionEvent;

    /**
     * Creates new form LoginWindow
     */
    public LoginWindow() {
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

        jPanelDragWindow = new javax.swing.JPanel();
        jPanelCloseWindow = new javax.swing.JPanel();
        SendPanel = new javax.swing.JPanel();
        UsernameTextField = new javax.swing.JTextField();
        MessageToSend = new javax.swing.JLabel();
        SendTo = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        PasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTextLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            .addGap(0, 68, Short.MAX_VALUE)
        );
        jPanelCloseWindowLayout.setVerticalGroup(
            jPanelCloseWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelDragWindowLayout = new javax.swing.GroupLayout(jPanelDragWindow);
        jPanelDragWindow.setLayout(jPanelDragWindowLayout);
        jPanelDragWindowLayout.setHorizontalGroup(
            jPanelDragWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDragWindowLayout.createSequentialGroup()
                .addGap(0, 732, Short.MAX_VALUE)
                .addComponent(jPanelCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelDragWindowLayout.setVerticalGroup(
            jPanelDragWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDragWindowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelCloseWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelDragWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        SendPanel.setBackground(new java.awt.Color(52, 73, 94));
        SendPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        SendPanel.setLayout(null);
        SendPanel.add(UsernameTextField);
        UsernameTextField.setBounds(230, 170, 180, 30);

        MessageToSend.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MessageToSend.setForeground(new java.awt.Color(240, 240, 240));
        MessageToSend.setText("Password");
        SendPanel.add(MessageToSend);
        MessageToSend.setBounds(220, 220, 110, 30);

        SendTo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SendTo.setForeground(new java.awt.Color(240, 240, 240));
        SendTo.setText("Username");
        SendPanel.add(SendTo);
        SendTo.setBounds(220, 140, 110, 30);

        LoginButton.setText("Login");
        LoginButton.setToolTipText("");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        SendPanel.add(LoginButton);
        LoginButton.setBounds(280, 330, 79, 21);
        SendPanel.add(PasswordField);
        PasswordField.setBounds(230, 250, 180, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_google_plus_50px.png"))); // NOI18N
        SendPanel.add(jLabel2);
        jLabel2.setBounds(610, 390, 50, 50);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Powered by");
        SendPanel.add(jLabel1);
        jLabel1.setBounds(480, 390, 130, 50);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME");
        SendPanel.add(jLabel3);
        jLabel3.setBounds(190, 60, 260, 56);

        jLabelTextLogin.setForeground(new java.awt.Color(240, 52, 52));
        jLabelTextLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SendPanel.add(jLabelTextLogin);
        jLabelTextLogin.setBounds(230, 290, 180, 30);

        getContentPane().add(SendPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 660, 440));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, -1, -1));

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelCloseWindowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCloseWindowMousePressed
        // TODO add your handling code here:
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

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        String username = UsernameTextField.getText();
        String password = new String(PasswordField.getPassword());

        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true"); //TLS

            Session session = Session.getInstance(properties, null);
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", 587, username, password);
            
            this.setVisible(false);
            
            MailController controller = MailController.getInstance();
            controller.setLoginData(username, password);
            
            MainWindow mainWindow = new MainWindow();
            centerTheWindow(mainWindow);
            mainWindow.setVisible(true);
            // Close transport
            transport.close();
        } catch (AuthenticationFailedException ex) {
            jLabelTextLogin.setText("Invalid username or password");
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_LoginButtonMouseClicked

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
            java.util.logging.Logger.getLogger(LoginWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel MessageToSend;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel SendPanel;
    private javax.swing.JLabel SendTo;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTextLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCloseWindow;
    private javax.swing.JPanel jPanelDragWindow;
    // End of variables declaration//GEN-END:variables
}