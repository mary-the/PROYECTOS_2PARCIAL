/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Maryt
 */
public class WorkPanel extends JPanel {
   
    private JLabel jUser;
    private JLabel jPass;
    private JTextField jtxUser; 
    private JPasswordField jPasswF; 
    private JToggleButton tbVer; 
    private JButton jbAceptar; 
    
    public WorkPanel(){
    super.setBackground(new Color(247, 187, 205));   
    super.setLayout(null);

     Font fuente=new Font("Dialog", Font.BOLD, 20);
    
     jUser = new JLabel("Usuario:   ");
     jUser.setBounds(75,10, 150, 20);
     jUser . setFont ( fuente ) ;
     
     jPass = new JLabel("Contraseña: ");
     jPass.setBounds(40, 40, 150, 20);
     jPass . setFont ( fuente ) ;
     
     jtxUser = new JTextField();
    // jtxUser.setPreferredSize(new Dimension(100,50));
     jtxUser.setBounds(155, 10, 200, 25);          
     jtxUser . setFont ( fuente ) ;
     
     jPasswF = new JPasswordField();
     //jtxUser.setPreferredSize(new Dimension(100,50));
     jPasswF.setBounds(155, 40, 200, 25);
     jPasswF.setEchoChar('*');  
     jPasswF . setFont ( fuente ) ;
     
     
     tbVer = new JToggleButton("Ver",false);
     tbVer.setBounds(380, 40, 50, 25);
      tbVer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tbVer.isSelected()){                              
                    jPasswF.setEchoChar((char)0);
                }else{
                    jPasswF.setEchoChar('*');                    
                }
            }
        });
     
      
     jbAceptar=new JButton("Aceptar");
     jbAceptar.setBounds(275, 80, 80, 25);
     
     
    super.add(jUser);
    super.add(jtxUser);
    super.add(jPass);
    super.add(jPasswF);
    super.add(tbVer);
    super.add(jbAceptar);
    
    }
}