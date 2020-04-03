
import java.awt.Color;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maryt
 */
public class Selector extends javax.swing.JFrame {

    /**
     * Creates new form Selector
     */
    public Selector() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRed = new javax.swing.JLabel();
        jLabelGreen = new javax.swing.JLabel();
        jLabelBlue = new javax.swing.JLabel();
        jSliderGreen = new javax.swing.JSlider();
        jSliderBLue = new javax.swing.JSlider();
        jSliderRed = new javax.swing.JSlider();
        txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelRed.setForeground(new java.awt.Color(255, 51, 51));
        jLabelRed.setText("Red 0");

        jLabelGreen.setForeground(new java.awt.Color(51, 255, 0));
        jLabelGreen.setText("Green 0");

        jLabelBlue.setForeground(new java.awt.Color(0, 0, 204));
        jLabelBlue.setText("Blue 0");

        jSliderGreen.setMajorTickSpacing(20);
        jSliderGreen.setMaximum(255);
        jSliderGreen.setPaintLabels(true);
        jSliderGreen.setPaintTicks(true);
        jSliderGreen.setValue(0);
        jSliderGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderGreenStateChanged(evt);
            }
        });

        jSliderBLue.setMajorTickSpacing(20);
        jSliderBLue.setMaximum(255);
        jSliderBLue.setPaintLabels(true);
        jSliderBLue.setPaintTicks(true);
        jSliderBLue.setValue(0);
        jSliderBLue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBLueStateChanged(evt);
            }
        });

        jSliderRed.setMajorTickSpacing(20);
        jSliderRed.setMaximum(255);
        jSliderRed.setPaintLabels(true);
        jSliderRed.setPaintTicks(true);
        jSliderRed.setValue(0);
        jSliderRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderRedStateChanged(evt);
            }
        });

        txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRed)
                            .addComponent(jLabelGreen)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelBlue)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderRed, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSliderBLue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)))
                .addGap(0, 104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabelRed)
                .addGap(22, 22, 22)
                .addComponent(jSliderRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelGreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSliderGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelBlue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSliderBLue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSliderRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderRedStateChanged
      cambiarColor();
        
    }//GEN-LAST:event_jSliderRedStateChanged

    private void jSliderGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderGreenStateChanged
        cambiarColor();
    }//GEN-LAST:event_jSliderGreenStateChanged

    private void jSliderBLueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderBLueStateChanged
       cambiarColor();
    }//GEN-LAST:event_jSliderBLueStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Selector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBlue;
    private javax.swing.JLabel jLabelGreen;
    private javax.swing.JLabel jLabelRed;
    private javax.swing.JSlider jSliderBLue;
    private javax.swing.JSlider jSliderGreen;
    private javax.swing.JSlider jSliderRed;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables

    private void cambiarColor() {
        int R, G,B;
        R=jSliderRed.getValue();
        G=jSliderGreen.getValue();
        B=jSliderBLue.getValue();

        txt.setBackground(new Color (R,G,B));
    }
}
