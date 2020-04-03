/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Maryt
 */
public class PrincipalFrame extends JFrame{
    
    private cPanel pnlColor;
    private filePanel pnlFile;
    
    public PrincipalFrame(){
        super("Seleccionar COLOR & ARCHIVO");
        super.setLayout(new BorderLayout());
        super.setSize(500,400);
        super.setResizable(false);
        
        pnlColor = new cPanel();
        pnlFile = new filePanel();
        
        super.add(pnlColor,BorderLayout.SOUTH);
        super.add(pnlFile,BorderLayout.NORTH);
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
}