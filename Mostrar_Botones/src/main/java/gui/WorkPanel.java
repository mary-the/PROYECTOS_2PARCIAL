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
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Maryt
 */
public class WorkPanel extends JPanel{
    private JLabel texto;
    private JCheckBox jcBox1;
    private JCheckBox jcBox2;
    private JCheckBox jcBox3;
    private JCheckBox jcBox4;
    private JCheckBox jcBox5;
    private JCheckBox jcBox6;
    private JCheckBox jcBox7;
    private JCheckBox jcBox8;
    private JButton button;
    public ArrayList<String> list;
    private BotonesDialog dialog;
    
    public WorkPanel(){
       
       Color p= new Color(247, 187, 205);
       super.setBackground(p);   
       super.setLayout(null);
       super.setPreferredSize(new Dimension(0,50));
   
    Font fuente=new Font("Dialog", Font.ROMAN_BASELINE, 20);
        
        texto=new JLabel("Escoga los botones");
        texto.setBounds(75,0,600,50);
        texto.setFont(fuente);
        texto.setForeground(Color.WHITE);
        
        jcBox1=new JCheckBox();
        jcBox1.setText("ok");
        jcBox1.setBounds(75,50,120,40);
        jcBox1.setBackground(p);
        
        jcBox2=new JCheckBox();
        jcBox2.setText("Aceptar");
        jcBox2.setBounds(75,75,120,40);
        jcBox2.setBackground(p);
        
        jcBox3=new JCheckBox();
        jcBox3.setText("Cancelar");
        jcBox3.setBounds(75,100,120,40);
        jcBox3.setBackground(p);
        
        jcBox4=new JCheckBox();
        jcBox4.setText("Siguiente");
        jcBox4.setBounds(75,125,120,40);
        jcBox4.setBackground(p);
        
        jcBox5=new JCheckBox();
        jcBox5.setText("Guardar");
        jcBox5.setBounds(200,50,120,40);
        jcBox5.setBackground(p);
        
        jcBox6=new JCheckBox();
        jcBox6.setText("Eliminar");
        jcBox6.setBounds(200,75,120,40);
        jcBox6.setBackground(p);
        
        jcBox7=new JCheckBox();
        jcBox7.setText("Anterior");
        jcBox7.setBounds(200,100,120,40);
        jcBox7.setBackground(p);
        
        jcBox8=new JCheckBox();
        jcBox8.setText("Cerrar");
        jcBox8.setBounds(200,125,120,40);
        jcBox8.setBackground(p);
        
        
        button=new JButton();
        button.setText("Abrir");
        button.setBounds(400,35,200,200);
        button.setBackground(p);
        button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
           String seleccion="";
             if(jcBox1.isSelected()){
             seleccion+=jcBox1.getText();
           }
           if(jcBox2.isSelected()){
             seleccion+=jcBox2.getText();  
           }
           if(jcBox3.isSelected()){
             list.add(jcBox3.getText());  
           }
           if(jcBox4.isSelected()){
             seleccion+=jcBox4.getText();  
           }
           if(jcBox5.isSelected()){
             seleccion+=jcBox5.getText(); 
           }
           if(jcBox6.isSelected()){
             seleccion+=jcBox6.getText(); 
           }
           if(jcBox7.isSelected()){
             seleccion+=jcBox7.getText(); 
           }
           if(jcBox8.isSelected()){
             seleccion+=jcBox8.getText(); 
           }
           JOptionPane.showMessageDialog(null,seleccion);
           
           }
        });
        
        
        super.add(texto);
        super.add(jcBox1);
        super.add(jcBox2);
        super.add(jcBox3);
        super.add(jcBox4);
        super.add(jcBox5);
        super.add(jcBox6);
        super.add(jcBox7);
        super.add(jcBox8);
        super.add(button);
    
    
    }
    
}
