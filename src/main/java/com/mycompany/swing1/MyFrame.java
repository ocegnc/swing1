/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class MyFrame extends JFrame{
    
    private String buttonText;
    private Color buttonColor;
    private MyButton button;
    
    public MyFrame(String buttonText){ 
        this("My Frame", buttonText, null);
    }
    
    public MyFrame(String buttonText, Color buttonColor){ 
        this("My Frame", buttonText, buttonColor);
    }
    
    public MyFrame(String title, String buttonText, Color buttonColor){
        super(title);
        this.buttonText = buttonText;
        this.buttonColor = buttonColor;
        this.setUpAndDisplay();
    }
    
    private void setUpAndDisplay(){
        //Créer un cadre
        this.getContentPane().setLayout(new FlowLayout());
        // Créer un bouton
        button = new MyButton(this.buttonText, this.buttonColor);
        // Ajouter le bouton dans le cadre (mauvaise pratique!)
        this.add(button);
        
        // Dimmensionner le cadre
        this.setSize(200, 200);
        // Faire en sorte de fermer le cadre et d'arrêter le programme
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Afficher le cadre
        this.setVisible(true);
    }

    public MyButton getButton() {
        return button;
    }
}
