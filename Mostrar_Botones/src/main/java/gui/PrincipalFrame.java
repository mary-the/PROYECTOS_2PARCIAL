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
public class PrincipalFrame extends JFrame {
    private WorkPanel pnlWork;
    private HeaderPanel pnlHeader;
    
    public PrincipalFrame(){
        super(".");
        super.setSize(700,400);
        super.setResizable(false);
        
        
        pnlWork=new WorkPanel();
        pnlHeader=new HeaderPanel();
        
        super.add(pnlHeader,BorderLayout.NORTH);
        super.add(pnlWork,BorderLayout.CENTER);
        
        
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);

    }


    
    
    
}
