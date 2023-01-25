/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swing1;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author oce_g
 */
public class MainClass {

    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        JButton jb = new JButton("Click me !");
        
        myWindow.add(jb);
        jb.addActionListener((e) -> {
            System.out.println("Coucou");
        });
        
        myWindow.setSize(200, 200);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }
}
