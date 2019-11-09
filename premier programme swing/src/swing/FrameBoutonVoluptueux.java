/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Camtouille
 */
public class FrameBoutonVoluptueux extends JFrame {
    
     private JButton bv;
     
     public FrameBoutonVoluptueux()
     {
        super("Bouton Voluptueux");
        getContentPane().setLayout(new BorderLayout());
        bv = new JButton("Cliquez-moi!");
        getContentPane().add(bv, "Center");
        bv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                b.setText("Encore!");
            }
        });
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
        setVisible(true);
     }
}
