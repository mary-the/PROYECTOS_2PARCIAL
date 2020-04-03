/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controler.Controlador;
import exceptions.AlumnoExistenteException;
import interfaces.AlumnoListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import objects.Alumno;
import objects.Carrera;
import objects.Fecha;

/**
 *
 * @author Maryt
 */
public class PrincipalFrame extends JFrame  {
 //Vamos a agregar nuestros paneles como elementos miembro
    private EncabezadoPanel pnlEncabezado;
    private WorkPanel pnlWork;
    private BusquedaPanel pnlBusqueda;
   
    private Controlador controlador;
    
    private AlumnoDialogo dlgAlumno;
    
    public PrincipalFrame(){
     super("Control escolar"); //titulo de la ventana
     super.setLayout(new BorderLayout());
     super.setSize(800,500); //Tamaño
     super.setLocationRelativeTo(null); //Si lo ponemos con null hacemos que salga centrado
     
     dlgAlumno=new AlumnoDialogo(this);
     dlgAlumno.setListener(new AlumnoListener() {
         @Override
         public void aceptarButtonClick(Alumno alumno) {
             try {
                 controlador.addAlumno(alumno);
             } catch (AlumnoExistenteException ex) {
                 JOptionPane.showMessageDialog(
                         PrincipalFrame.this,
                         "La matricula ya ha sido insertada anteriormente",
                         "Matricula invalida",
                         JOptionPane.ERROR_MESSAGE);
             }
         }
     });
     
     
     controlador= new Controlador();
     cargaInicial();
     
     pnlEncabezado=new EncabezadoPanel();
     
     
     pnlWork= new WorkPanel(controlador);
     
     
     pnlBusqueda=new BusquedaPanel();
     
     super.setJMenuBar(createMenu());
     
     super.add(pnlEncabezado, BorderLayout.NORTH);
     super.add(pnlWork,BorderLayout.CENTER);
     super.add(pnlBusqueda,BorderLayout.SOUTH);
     
     
     super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para cerrar cuando le des cerrar
     super.setVisible(true); //Para hacerlo visible
 }
 
    
    private void cargaInicial(){
       
            Alumno a=new Alumno("0114534","Mary The","Revilla","Rasgado",new Fecha(3,06,1999),Carrera.SISTEMAS);
            
            
            try {
                controlador.addAlumno(a);
            } catch (AlumnoExistenteException ex) {
             ex.printStackTrace();   
            }
        
        
    }
    
    private JMenuBar createMenu(){
        JMenuBar mbMain = new JMenuBar();
        
        JMenuItem bNuevo = new JMenuItem("Nuevo alumno...");
        bNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               dlgAlumno.setVisible(true);   
               
            }
        });
        JMenuItem mSalir =new JMenuItem("Salir");
        mSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JMenu mArchivo= new JMenu("Archivo");
        mArchivo.add(bNuevo);
        mArchivo.addSeparator();
        mArchivo.add(mSalir);
        
        JMenu mAyuda= new JMenu ("Ayuda");
        JMenuItem mAcerca=new JMenuItem("Acerca de...");
        mAyuda.add(mAcerca);
        
        mbMain.add(mArchivo);
        mbMain.add(mAyuda);
        return mbMain;
                
    }
}
