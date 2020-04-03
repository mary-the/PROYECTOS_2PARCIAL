/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Maryt
 */
public class PrincipalFrame extends JFrame {
    
    private WorkPanel pnlWork;
    private EncabezadoPanel pnlEncabezado;

    
    
    
    
    
    public PrincipalFrame(){
     
        super("C O N V E R T I D O R [$PESO$<->$DOLAR$]");
        super.setLayout(new BorderLayout());
        super.setSize(500,300);
        super.setLocationRelativeTo(null); 
        super.setResizable(false); //   >.< jijiji
  
       
        pnlWork = new WorkPanel();
        pnlEncabezado=new EncabezadoPanel();
      
        
        
        
        super.add(pnlWork,BorderLayout.CENTER);
        super.add(pnlEncabezado, BorderLayout.NORTH);
        
     super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     super.setVisible(true);    
     
     }
    
  
    
}
