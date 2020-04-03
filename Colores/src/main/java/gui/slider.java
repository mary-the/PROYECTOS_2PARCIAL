/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Maryt
 */
public class slider extends JPanel {
    
    private JSlider slider;
    private JLabel label;
    
    public slider(){
            setLayout(new FlowLayout());
            slider=new JSlider(JSlider.HORIZONTAL,0,255,0);
            slider.setMajorTickSpacing(5);
            slider.setPaintTicks(true);
            
            super.add(slider);
            
            label=new JLabel("valor 0");
            super.add(label);
            slider.add(label);
            
            event e=new event();
            slider.addChangeListener(e);
            
            
            
            
    }
    public class event implements ChangeListener{
        public void stateChanfe(ChangeEvent e){
        int value= slider.getValue();
        
        label.setText("Valor"+ value);
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    

}

