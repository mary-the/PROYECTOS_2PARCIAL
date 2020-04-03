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
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Maryt
 */
public class filePanel extends JPanel{
 private  JButton open;
 private JLabel texto;
  private JLabel archivo;
 private JButton buscar;
    public filePanel(){
        super.setBackground(new java.awt.Color(136, 220, 192));
        super.setPreferredSize(new Dimension(0,200));
        buscar = new JButton("BUSCAR");
        buscar.setBounds(50,50, 500, 500);
         texto =new JLabel();
         
        archivo =new JLabel("ARCHIVO");
        archivo.setBounds(10, 20, 500, 100); 
        Font fuente=new Font("Dialog", Font.BOLD, 100);
        archivo. setFont ( fuente ) ;
        archivo.setForeground(Color.RED);
        
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            open=new JButton();
            JFileChooser fc=new JFileChooser();
            fc.setCurrentDirectory(new java.io.File("C:/Users"));
            fc.setDialogTitle("Selecciona");
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            if (fc.showOpenDialog(open)== JFileChooser.APPROVE_OPTION){
            //
            }
            
            
        texto.setBounds(80, 20, 200, 50);
        texto.setText(fc.getSelectedFile().getAbsolutePath());
                    
            }
        });
        
       super.add(archivo);
       super.add(texto);
       super.add(buscar);
      
       
    }
}
