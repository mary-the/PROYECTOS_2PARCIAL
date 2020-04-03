/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;



import javax.swing.*;


/**
 *
 * @author Maryt
 */
public class PrincipalFrame extends JFrame {
    private WorkPanel pnlWork;
    
    public PrincipalFrame(){
        super("Login");
        super.setSize(450,150);
        super.setResizable(false);
        
        pnlWork= new WorkPanel();

        super.add(pnlWork);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
    
   
    

}
