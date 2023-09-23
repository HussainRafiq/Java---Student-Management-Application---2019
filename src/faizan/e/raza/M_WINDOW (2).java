/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizan.e.raza;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javafx.scene.control.Tooltip;
import javax.swing.JFrame;

/**
 *
 * @author HUSSAIN
 */
public class M_WINDOW extends JFrame{

    public M_WINDOW() throws HeadlessException {
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(d);
        this.setTitle("FAIZAN-E-RAZA ACADEMY");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
       this.setLayout(null);
    
    
    
    
    }
    
    
}
