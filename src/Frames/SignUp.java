package Frames;

import Observer.EmailObserver;
import Observer.MessageSubject;
import Observer.Observer;
import Observer.Subject;
import Singleton.Database;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SignUp extends javax.swing.JFrame {

    private Database db;
    private Observer emailObserver;

    public SignUp() {
        initComponents();
        setLocationRelativeTo(null);
        panel.requestFocus(true);
        setTitle("Sign Up Page");
        Font font = new Font("Arial", Font.ITALIC, 15);

        Component[] components = panel.getComponents();
        for (Component component : components) {
            if (component instanceof JTextField) {
                component.setFont(font);
                component.setForeground(Color.GRAY);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phoneNum = new javax.swing.JTextField();
        signUp = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(32, 21, 32));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign Up");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please fill this form to create an account!");

        fName.setText("First Name");
        fName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fNameFocusLost(evt);
            }
        });
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        lName.setText("Last Name");
        lName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lNameFocusLost(evt);
            }
        });

        email.setText("Email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        password.setText("Password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });

        address.setText("Address");
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });

        phoneNum.setText("Phone Number");
        phoneNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneNumFocusLost(evt);
            }
        });
        phoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumActionPerformed(evt);
            }
        });

        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/arrow-right (2).png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email)
                                .addComponent(password)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(address)
                                .addComponent(phoneNum)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(back)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void phoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed

        if (fName.getText().equals("First Name") || lName.getText().equals("Last Name") || email.getText().equals("Email") || phoneNum.getText().equals("Phone Number")
                || address.getText().equals("Address") || password.getText().equals("Password")) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (email.getText().contains("@gmail.com") || email.getText().contains("@outlook.com") || email.getText().contains("@hotmail.com")) {
                db = new Database();

                if (db.register(fName.getText(), email.getText(), password.getText())) {

                    emailObserver = new EmailObserver(email.getText());
                    Subject s = new MessageSubject();
                    String message = "Hi " + fName.getText() + "\nWelcome to Coffeans cafe! We're excited you're joinin us.";
                    s.notifyUpdate(emailObserver, "Thank you for registering", message);
                    openLoginPage();
                } else {
                    JOptionPane.showMessageDialog(null, "This email is registered", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please use a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_signUpActionPerformed

    private void openLoginPage() {
        new Login().setVisible(true);
        dispose();
    }

    private void fNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameFocusLost
        if (fName.getText().equals("")) {
            fName.setText("First Name");
            Font font = new Font("Arial", Font.ITALIC, 15);
            fName.setFont(font);
            fName.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_fNameFocusLost

    private void fNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameFocusGained
        if (fName.getText().equals("First Name")) {
            fName.setText("");
        }
        Font font = new Font("Arial", Font.BOLD, 15);
        fName.setFont(font);
        fName.setForeground(Color.BLACK);
    }//GEN-LAST:event_fNameFocusGained

    private void lNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lNameFocusGained
        if (lName.getText().equals("Last Name")) {
            lName.setText("");
        }
        Font font = new Font("Arial", Font.BOLD, 15);
        lName.setFont(font);
        lName.setForeground(Color.BLACK);
    }//GEN-LAST:event_lNameFocusGained

    private void lNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lNameFocusLost
        if (lName.getText().equals("")) {
            lName.setText("Last Name");
            Font font = new Font("Arial", Font.ITALIC, 15);
            lName.setFont(font);
            lName.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_lNameFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        if (email.getText().equals("Email")) {
            email.setText("");
        }
        Font font = new Font("Arial", Font.BOLD, 15);
        email.setFont(font);
        email.setForeground(Color.BLACK);
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().equals("")) {
            email.setText("Email");
            Font font = new Font("Arial", Font.ITALIC, 15);
            email.setFont(font);
            email.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_emailFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        if (address.getText().equals("Address")) {
            address.setText("");
        }
        Font font = new Font("Arial", Font.BOLD, 15);
        address.setFont(font);
        address.setForeground(Color.BLACK);
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        if (address.getText().equals("")) {
            address.setText("Address");
            Font font = new Font("Arial", Font.ITALIC, 15);
            address.setFont(font);
            address.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_addressFocusLost

    private void phoneNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumFocusGained
        if (phoneNum.getText().equals("Phone Number")) {
            phoneNum.setText("");
        }
        Font font = new Font("Arial", Font.BOLD, 15);
        phoneNum.setFont(font);
        phoneNum.setForeground(Color.BLACK);
    }//GEN-LAST:event_phoneNumFocusGained

    private void phoneNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneNumFocusLost
        if (phoneNum.getText().equals("")) {
            phoneNum.setText("Phone Numeber");
            Font font = new Font("Arial", Font.ITALIC, 15);
            phoneNum.setFont(font);
            phoneNum.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_phoneNumFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if (password.getText().equals("Password")) {
            password.setText("");
        }
        Font font = new Font("Arial", Font.BOLD, 15);
        password.setFont(font);
        password.setForeground(Color.BLACK);
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if (password.getText().equals("")) {
            password.setText("Password");
            Font font = new Font("Arial", Font.ITALIC, 15);
            password.setFont(font);
            password.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_passwordFocusLost

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel back;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField lName;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phoneNum;
    private javax.swing.JButton signUp;
    // End of variables declaration//GEN-END:variables
}
