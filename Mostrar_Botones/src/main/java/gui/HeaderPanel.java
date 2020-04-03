/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maryt
 */
public class HeaderPanel extends JPanel{
    
    private JLabel titulo;
 
    
    public HeaderPanel(){
        super.setPreferredSize(new Dimension(0,100));
        super.setBackground(new Color(255, 122, 162));   
        super.setLayout(null);
        
        Font fuente=new Font("Dialog", Font.ROMAN_BASELINE, 40);
        
        titulo=new JLabel("VENTANA CON BOTONES");
        titulo.setBounds(75,0,600,100);
        titulo.setFont(fuente);
        titulo.setForeground(Color.WHITE);
        
        super.add(titulo);
        
        
        
        
    }
}
