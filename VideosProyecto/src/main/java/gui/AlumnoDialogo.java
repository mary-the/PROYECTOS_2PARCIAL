/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import interfaces.AlumnoListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import objects.Alumno;
import objects.Carrera;
import objects.Fecha;

/**
 *
 * @author Maryt
 */
public class AlumnoDialogo extends JDialog{
    
    private JPanel pnlWork;
    private JPanel pnlButton;
    
    private JButton btnAceptar;
    private JButton btnCancelar;
    
    private AlumnoListener listener;
    
    public AlumnoDialogo(JFrame owner){
        super(owner, "Datos del alumno",true); //owner=dueño del dialogo, tittle=titulo, modal=No nos permite hacer nada fuera de la ventana
        super.setSize(400,300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(owner);
        
        pnlWork=new JPanel();
        pnlButton=new JPanel();
        pnlButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        pnlButton.setBackground(Color.red);
        
        btnAceptar=new JButton("Aceptar");
        
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno alumno=new Alumno("72215","Mtt","Revilla","Rasgado",new Fecha(03,06,1999), Carrera.PSICOLOGIA);
                listener.aceptarButtonClick(alumno);
            }
        });
        
        btnCancelar= new JButton("Cancelar");
        
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AlumnoDialogo.this.setVisible(false); //Se tiene que poner todo el nombre por que si no seria lo de new Act
            }
        });
        
        pnlButton.add(btnAceptar);
        pnlButton.add(btnCancelar);
        
        super.add(pnlButton,BorderLayout.SOUTH);
        super.add(pnlWork,BorderLayout.CENTER);
        
        super.setVisible(false);
    }
    
    public void setListener(AlumnoListener listener){
        this.listener=listener;
    }
    
}
