/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Objects.Dinero;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Maryt
 */
public class WorkPanel extends JPanel {
    
        private JTextField in;
        private JTextField out;
        private JComboBox<String> cmbPD;
        private Dinero dinero;

    public WorkPanel(){
        super.setBackground(new Color(97,223,143));
        super.setLayout(new FlowLayout());
       
        cmbPD= new JComboBox<String>();
        cmbPD.addItem("Pesos");
        cmbPD.addItem("Dolar");
        
        
        Font fuente=new Font("Dialog", Font.BOLD, 36);
        
        in= new JTextField();
        in.setPreferredSize(new Dimension(100,50));
        in . setFont ( fuente ) ;
        
        out = new JTextField();
        out.setPreferredSize(new Dimension(100,50));
        out.setEditable(false);
        out.setFont ( fuente ) ;
        

        super.add(in);
        super.add(cmbPD);
        super.add(out);
        
        dinero=new Dinero();
        cmbPD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           
                    if(cmbPD.getSelectedItem()=="Pesos"){
                        out.setText(String.valueOf(dinero.convertir(Double.parseDouble(in.getText()), 2)));
                    }else{
                        out.setText(String.valueOf(dinero.convertir(Double.parseDouble(in.getText()), 1)));

                    }
            } 
        });
        
    
    }
    
    
}
