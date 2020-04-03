package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maryt
 */
public class cPanel extends JPanel{
    private JButton b;
    private Color color = (Color.WHITE);
    private JPanel panel2;
    
    
    
    public cPanel(){
        super.setBackground(java.awt.Color.white);
        super.setPreferredSize(new Dimension(0,180));
        panel2 = new JPanel();
        panel2.setBackground(color);
        
        b= new JButton("Escoge un Color");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                color=JColorChooser.showDialog(null,"Colores",color);
                if(color==null){
                    color=(Color.WHITE);
                }
                
                panel2.setBackground(color);
                
            }
        });
        
        panel2.setSize(200,200);
        super.add(panel2,BorderLayout.CENTER);
        super.add(b,BorderLayout.SOUTH);
        
        
    }
}
