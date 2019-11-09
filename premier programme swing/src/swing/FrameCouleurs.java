/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

/**
 *
 * @author Camtouille
 */
public class FrameCouleurs extends JFrame {
    private JSlider R, V, B;
    private JPanel panneau;
    
    public FrameCouleurs()
    {
        super("Choix de couleur");
        getContentPane().setLayout(new BorderLayout());
        R = new JSlider(0, 255, 255);
        V = new JSlider(0, 255, 0);
        B = new JSlider(0, 255, 0);
        R.setBackground(Color.red);
        V.setBackground(Color.green);
        B.setBackground(Color.blue);
        panneau = new JPanel();
        panneau.setPreferredSize(new Dimension(500, 500));
        getContentPane().add(panneau, "Center");
        JPanel sud = new JPanel();
        sud.setLayout(new GridLayout(3, 1));
        getContentPane().add(sud, "South");
        sud.add(R);
        sud.add(V);
        sud.add(B);
        
        panneau.setBackground(new Color (R.getValue(), V.getValue(), B.getValue()));
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
        setVisible(true);
    }
}
