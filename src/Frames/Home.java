package Frames;

import Decorate.*;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        helloLabel = new javax.swing.JLabel();
        blackPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        blackBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        capBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        latBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        espBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mocBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        matchaBtn = new javax.swing.JButton();
        cartBtn = new javax.swing.JButton();
        helloLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Home"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(400, 700));

        jPanel1.setBackground(new java.awt.Color(32, 21, 32));
        jPanel1.setForeground(new java.awt.Color(248, 225, 169));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        helloLabel.setBackground(new java.awt.Color(238, 227, 199));
        helloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        helloLabel.setForeground(new java.awt.Color(238, 227, 199));
        helloLabel.setText("Pick your Coffee");
        jPanel1.add(helloLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        blackPanel.setBackground(new java.awt.Color(53, 43, 53));
        blackPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black1.png"))); // NOI18N
        blackPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Black");
        blackPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 20));

        blackBtn.setBackground(new java.awt.Color(238, 227, 199));
        blackBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blackBtn.setText("+");
        blackBtn.setBorderPainted(false);
        blackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackBtnMouseClicked(evt);
            }
        });
        blackPanel.add(blackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 30));

        jPanel1.add(blackPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 130));

        jPanel3.setBackground(new java.awt.Color(53, 43, 53));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cap.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("cappuccino");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 30));

        capBtn.setBackground(new java.awt.Color(238, 227, 199));
        capBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        capBtn.setText("+");
        capBtn.setBorderPainted(false);
        capBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackBtnMouseClicked(evt);
            }
        });
        capBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capBtnActionPerformed(evt);
            }
        });
        jPanel3.add(capBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 110, 130));

        jPanel5.setBackground(new java.awt.Color(53, 43, 53));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/latte.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Latte");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 40));

        latBtn.setBackground(new java.awt.Color(238, 227, 199));
        latBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        latBtn.setText("+");
        latBtn.setBorderPainted(false);
        latBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackBtnMouseClicked(evt);
            }
        });
        latBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latBtnActionPerformed(evt);
            }
        });
        jPanel5.add(latBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 110, 130));

        jPanel4.setBackground(new java.awt.Color(53, 43, 53));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        espBtn.setBackground(new java.awt.Color(238, 227, 199));
        espBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        espBtn.setText("+");
        espBtn.setBorderPainted(false);
        espBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackBtnMouseClicked(evt);
            }
        });
        espBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espBtnActionPerformed(evt);
            }
        });
        jPanel4.add(espBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Espresso");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/esp.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 110, 130));

        jPanel6.setBackground(new java.awt.Color(53, 43, 53));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mocha.png"))); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Mocha");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 40));

        mocBtn.setBackground(new java.awt.Color(238, 227, 199));
        mocBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mocBtn.setText("+");
        mocBtn.setBorderPainted(false);
        mocBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackBtnMouseClicked(evt);
            }
        });
        mocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mocBtnActionPerformed(evt);
            }
        });
        jPanel6.add(mocBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 110, 130));

        jPanel7.setBackground(new java.awt.Color(53, 43, 53));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/matcha.png"))); // NOI18N
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 60));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Matcha");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 40));

        matchaBtn.setBackground(new java.awt.Color(238, 227, 199));
        matchaBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        matchaBtn.setText("+");
        matchaBtn.setBorderPainted(false);
        matchaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blackBtnMouseClicked(evt);
            }
        });
        matchaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchaBtnActionPerformed(evt);
            }
        });
        jPanel7.add(matchaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 50, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 110, 130));

        cartBtn.setBackground(new java.awt.Color(238, 227, 199));
        cartBtn.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        cartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cart.png"))); // NOI18N
        cartBtn.setText("Cart");
        cartBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 650, 210, 40));

        helloLabel1.setBackground(new java.awt.Color(238, 227, 199));
        helloLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        helloLabel1.setForeground(new java.awt.Color(238, 227, 199));
        helloLabel1.setText("Hello Sunshine! ");
        jPanel1.add(helloLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtnActionPerformed
        // TODO add your handling code here:
        new viewCart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cartBtnActionPerformed

    private void blackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blackBtnMouseClicked
        // TODO add your handling code here:
        detail d = new detail(new Black());
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_blackBtnMouseClicked

    private void capBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capBtnActionPerformed
        // TODO add your handling code here:
        detail d = new detail(new Cappuccino());
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_capBtnActionPerformed

    private void espBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espBtnActionPerformed
        // TODO add your handling code here:
        detail d = new detail(new Espresso());
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_espBtnActionPerformed

    private void latBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latBtnActionPerformed
        // TODO add your handling code here:
        detail d = new detail(new Latte());
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_latBtnActionPerformed

    private void matchaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchaBtnActionPerformed
        // TODO add your handling code here:
        detail d = new detail(new Matcha());
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_matchaBtnActionPerformed

    private void mocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mocBtnActionPerformed
        // TODO add your handling code here:
        detail d = new detail(new Mocha());
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mocBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blackBtn;
    private javax.swing.JPanel blackPanel;
    private javax.swing.JButton capBtn;
    private javax.swing.JButton cartBtn;
    private javax.swing.JButton espBtn;
    private javax.swing.JLabel helloLabel;
    private javax.swing.JLabel helloLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton latBtn;
    private javax.swing.JButton matchaBtn;
    private javax.swing.JButton mocBtn;
    // End of variables declaration//GEN-END:variables
}
