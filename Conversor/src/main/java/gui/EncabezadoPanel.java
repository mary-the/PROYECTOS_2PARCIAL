/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maryt
 */
public class EncabezadoPanel extends JPanel {
    private JLabel label;
    private JLabel label2;
     public EncabezadoPanel(){
        super.setBackground(new Color(97,223,143));
        super.setPreferredSize(new Dimension(0,100));
        setLayout(null);
        label=new JLabel(" C O N V E R T I D O R");
        label2=new JLabel("DE                         A                 RESULTADO");
        label.setBounds(200,1,200,100);
        label2.setBounds(150,55,300,50);
        super.add(label);
        super.add(label2);
        
        
     }
}
