/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Camtouille
 */
public class FramePtsCardinaux extends JFrame {
    
    private JLabel centre;
    private JButton nord, sud, est, ouest;
    
    public FramePtsCardinaux()
    {
        super("Notre super première frame") ;

        getContentPane().setLayout(new BorderLayout());
        centre = new JLabel("", JLabel.CENTER);
        nord = new JButton("Nord");
        sud = new JButton("Sud");
        est = new JButton("Est");
        ouest = new JButton("Ouest");
        getContentPane().add(centre, "Center");
        getContentPane().add(nord, "North") ;
        getContentPane().add(sud, "South") ;
        getContentPane().add(est, "East") ;
        getContentPane().add(ouest, "West") ;
        
        centre.setPreferredSize(new Dimension(300, 300));
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                centre.setText("Tu as cliqué sur " + b.getText() + ".");
            }
        };
        
        nord.addActionListener(al);
        sud.addActionListener(al);
        est.addActionListener(al);
        ouest.addActionListener(al);
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
        setVisible(true);
    }
}