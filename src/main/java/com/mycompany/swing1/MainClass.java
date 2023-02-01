/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swing1;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author oce_g
 */
public class MainClass {

    public static void main(String[] args) {
        
        MyFrame mf = new MyFrame("TITRE", "UN BOUTON", Color.orange);
        MyFrame mf1 = new MyFrame("MON BOUTON", Color.red);
        // Surveiller le bouton pour répondre à un évènement
        mf1.getButton().addActionListener((e) -> {
            System.out.println("Coucou");
        });        
        MyFrame mf2 = new MyFrame("LE BOUTON");
   
    }
}
