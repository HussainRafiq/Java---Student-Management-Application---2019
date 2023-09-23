/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizan.e.raza;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javafx.scene.AccessibleRole;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

/**
 *
 * @author HUSSAIN
 */
public class M_HEADER extends JPanel {

    public M_HEADER() {
        this.setBackground(new Color(0,102,0));
        this.setLayout(null);
        
         ImageIcon im=new ImageIcon("lop.png");
       Image im1=im.getImage().getScaledInstance(150, 100, 0);
        
        JLabel l1=new JLabel(new ImageIcon(im1));
        l1.setText("فیضان رضا اکیڈمی");
        l1.setFont(new Font("arial",Font.BOLD,100));
        l1.setForeground(Color.white);
        l1.setHorizontalAlignment(JLabel.CENTER);
    l1.setBounds(30, 10,Toolkit.getDefaultToolkit().getScreenSize().width, 130);
    this.add(l1);
    }
    
    
}
