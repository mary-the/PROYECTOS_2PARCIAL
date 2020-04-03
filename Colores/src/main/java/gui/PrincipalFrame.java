/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;

/**
 *
 * @author Maryt
 */
public class PrincipalFrame extends JFrame {
    private slider s;
    
    public PrincipalFrame(){
     super(".");
        super.setSize(700,400);
        super.setResizable(false);

    s= new slider();
    super.add(s);
    
     super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);

    }
}
