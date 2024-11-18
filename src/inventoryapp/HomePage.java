/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventoryapp;

/**
 *
 * @author dhars
 */
import java.awt.*;

public class HomePage extends javax.swing.JPanel {

    public HomePage() {
        initComponents();
    }
    
    private void initComponents() {
        
        setBackground(Color.BLACK);
        
        welcomeLabel = new javax.swing.JLabel();
        welcomeLabel1 = new javax.swing.JLabel();

        welcomeLabel.setFont(new java.awt.Font("MV Boli", Font.BOLD, 45));
        welcomeLabel.setText("Welcome to your");
        welcomeLabel.setForeground(new Color(57, 255, 20));

        welcomeLabel1.setFont(new java.awt.Font("MV Boli", Font.BOLD, 45)); 
        welcomeLabel1.setText("    OptiStock Dashboard");
        welcomeLabel1.setForeground(new Color(57, 255, 20));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(welcomeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(welcomeLabel1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcomeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }                    
    javax.swing.JLabel welcomeLabel;
    javax.swing.JLabel welcomeLabel1;
}
