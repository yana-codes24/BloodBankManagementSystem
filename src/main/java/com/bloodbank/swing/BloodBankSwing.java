/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bloodbank.swing;

/**
 *
 * @author Yana Pandey
 */

import javax.swing.*;
import java.awt.*;

public class BloodBankSwing {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Blood Bank Management System");

        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        JLabel title = new JLabel(
                "Blood Bank Management System",
                SwingConstants.CENTER
        );

        title.setFont(new Font("Arial", Font.BOLD, 20));

        JButton donorButton = new JButton("Manage Donors");
        JButton stockButton = new JButton("View Blood Stock");
        JButton exitButton = new JButton("Exit");

        donorButton.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        frame, "Donor Management Module"
                )
        );

        stockButton.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        frame, "Blood Stock Module"
                )
        );

        exitButton.addActionListener(e -> frame.dispose());

        panel.add(title);
        panel.add(donorButton);
        panel.add(stockButton);
        panel.add(exitButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
