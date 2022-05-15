package Frames;

import CartOrder.*;
import Decorate.*;
import javax.swing.JLabel;

public class detail extends javax.swing.JFrame {

    Coffee coffee;

    public detail(Coffee coffee) {
        initComponents();
        this.coffee = coffee;
        this.CoffeePic.setIcon(coffee.getIcon());
        this.CoffeePic.setHorizontalAlignment(JLabel.CENTER);
        this.CoffeePic.setVerticalAlignment(JLabel.CENTER);
        this.coffeName.setText(coffee.getDescription());
        this.coffeePrice.setText(coffee.cost() + " sar");
    }

    public detail() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sizeGroup = new javax.swing.ButtonGroup();
        flavorGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        picPanel = new javax.swing.JPanel();
        CoffeePic = new javax.swing.JLabel();
        coffeName = new javax.swing.JLabel();
        coffeePrice = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();
        sizeChoice = new javax.swing.JPanel();
        largeRadio = new javax.swing.JRadioButton();
        medRadio = new javax.swing.JRadioButton();
        toppingChoice = new javax.swing.JPanel();
        creamCheck = new javax.swing.JCheckBox();
        mintCheck = new javax.swing.JCheckBox();
        iceCheck = new javax.swing.JCheckBox();
        flavorChoice = new javax.swing.JPanel();
        vanillaRadio = new javax.swing.JRadioButton();
        caramelRadio = new javax.swing.JRadioButton();
        redRadio = new javax.swing.JRadioButton();
        addBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(32, 21, 32));
        setMinimumSize(new java.awt.Dimension(400, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 21, 32));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picPanel.setBackground(new java.awt.Color(53, 43, 53));
        picPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CoffeePic.setForeground(new java.awt.Color(255, 255, 255));
        CoffeePic.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        CoffeePic.setIconTextGap(0);
        picPanel.add(CoffeePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 230));

        jPanel1.add(picPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 260, 230));

        coffeName.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        coffeName.setForeground(new java.awt.Color(255, 255, 255));
        coffeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coffeName.setText("CoffeeName");
        jPanel1.add(coffeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 260, 40));

        coffeePrice.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        coffeePrice.setForeground(new java.awt.Color(255, 255, 255));
        coffeePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coffeePrice.setText("Price");
        jPanel1.add(coffeePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 260, 30));

        TabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        sizeChoice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sizeGroup.add(largeRadio);
        largeRadio.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        largeRadio.setText("Large");
        largeRadio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        largeRadio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        largeRadio.setIconTextGap(20);
        sizeChoice.add(largeRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, -1));

        sizeGroup.add(medRadio);
        medRadio.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        medRadio.setText("Medium");
        medRadio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        medRadio.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        medRadio.setIconTextGap(20);
        sizeChoice.add(medRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 170, -1));

        TabbedPane.addTab("Size", sizeChoice);

        creamCheck.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        creamCheck.setText("Wipped Cream");
        creamCheck.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        creamCheck.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        mintCheck.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mintCheck.setText("Mint");
        mintCheck.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mintCheck.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        iceCheck.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        iceCheck.setText("Ice Cream");
        iceCheck.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iceCheck.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout toppingChoiceLayout = new javax.swing.GroupLayout(toppingChoice);
        toppingChoice.setLayout(toppingChoiceLayout);
        toppingChoiceLayout.setHorizontalGroup(
            toppingChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppingChoiceLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(toppingChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iceCheck)
                    .addComponent(mintCheck)
                    .addComponent(creamCheck))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        toppingChoiceLayout.setVerticalGroup(
            toppingChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toppingChoiceLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(creamCheck)
                .addGap(18, 18, 18)
                .addComponent(mintCheck)
                .addGap(18, 18, 18)
                .addComponent(iceCheck)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Topping", toppingChoice);

        flavorGroup.add(vanillaRadio);
        vanillaRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vanillaRadio.setText("Vanilla");

        flavorGroup.add(caramelRadio);
        caramelRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        caramelRadio.setText("Caramel");

        flavorGroup.add(redRadio);
        redRadio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        redRadio.setText("Red Velvet");

        javax.swing.GroupLayout flavorChoiceLayout = new javax.swing.GroupLayout(flavorChoice);
        flavorChoice.setLayout(flavorChoiceLayout);
        flavorChoiceLayout.setHorizontalGroup(
            flavorChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flavorChoiceLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(flavorChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(redRadio)
                    .addComponent(caramelRadio)
                    .addComponent(vanillaRadio))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        flavorChoiceLayout.setVerticalGroup(
            flavorChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flavorChoiceLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(vanillaRadio)
                .addGap(29, 29, 29)
                .addComponent(caramelRadio)
                .addGap(30, 30, 30)
                .addComponent(redRadio)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Flavor", flavorChoice);

        jPanel1.add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 330, 260));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addBtn.setText("Add To Cart");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 260, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        calculateItems();
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addBtnActionPerformed

    public void calculateItems() {
        
          if (medRadio.isSelected()) {
            coffee = new MediumSize(coffee);
        }
          
           if (largeRadio.isSelected()) {
            coffee = new LargeSize(coffee);
        }
           
        if (creamCheck.isSelected()) {
            coffee = new WhippedCream(coffee);
        }

        if (mintCheck.isSelected()) {
            coffee = new Mint(coffee);
        }

        if (iceCheck.isSelected()) {
            coffee = new IceCream(coffee);
        }

        if (vanillaRadio.isSelected()) {
            coffee = new Vanilla(coffee);
        }

        if (caramelRadio.isSelected()) {
            coffee = new Caramel(coffee);
        }

        if (redRadio.isSelected()) {
            coffee = new Velvet(coffee);
        }
        Order.getOrder().getCart().addToCart(coffee);
    }

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CoffeePic;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton addBtn;
    private javax.swing.JRadioButton caramelRadio;
    private javax.swing.JLabel coffeName;
    private javax.swing.JLabel coffeePrice;
    private javax.swing.JCheckBox creamCheck;
    private javax.swing.JPanel flavorChoice;
    private javax.swing.ButtonGroup flavorGroup;
    private javax.swing.JCheckBox iceCheck;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton largeRadio;
    private javax.swing.JRadioButton medRadio;
    private javax.swing.JCheckBox mintCheck;
    private javax.swing.JPanel picPanel;
    private javax.swing.JRadioButton redRadio;
    private javax.swing.JPanel sizeChoice;
    private javax.swing.ButtonGroup sizeGroup;
    private javax.swing.JPanel toppingChoice;
    private javax.swing.JRadioButton vanillaRadio;
    // End of variables declaration//GEN-END:variables
}
