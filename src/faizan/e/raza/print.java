/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizan.e.raza;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.font.TextAttribute;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

/**
 *
 * @author HUSSAIN
 */
public class print extends JFrame{

    public print(String hok[],String path1) throws PrinterException {
   this.setBackground(null);
        this.setLayout(null);
         ImageIcon im=new ImageIcon("lop.png");
       Image im1=im.getImage().getScaledInstance(100, 50, 0);
    
     JLabel l1=new JLabel(new ImageIcon(im1));
        l1.setText("فیضان رضا اکیڈمی");
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        l1.setBounds(0, 0, d.width,100);
        l1.setFont(new Font("arial",Font.BOLD,50));
    this.setSize(d.width,d.height);
   
    this.setVisible(true);
          JLabel l6=new JLabel("STUDENT RECORD");
                    l6.setFont(new Font("arial",Font.PLAIN,25));
                 //   l.setBorder(new LineBorder(Color.yellow, 10));
                    l6.setBounds(0,120, d.width, 30);
                    this.add(l6);
                    l6.setHorizontalAlignment(JLabel.CENTER);
                   
        l1.setForeground(Color.BLACK);
        l1.setHorizontalAlignment(JLabel.CENTER);
    l1.setBounds(30, 10,Toolkit.getDefaultToolkit().getScreenSize().width, 130);
    this.add(l1);
   
    String columns[]={"GR.NO","STUDENT'S NAME","FATHER'S NAME","DATE OF BIRTH","CONTACT NO","EMAIL ADDRESS","ADDRESS","PROFESSION","QUALIFICATION","PREVIOUS MADRASSA","SHIFT / CAMPUS","NATURE OF WORK","EXPERTISE","ADDMISSION IN CLASS","ADMISSION DATE"};
                int y=160;
                
                for (String lo : columns) {
                    JLabel l=new JLabel(lo);
                    l.setFont(new Font("arial",Font.PLAIN,15));
                 //   l.setBorder(new LineBorder(Color.yellow, 10));
                    l.setBounds(50, y, 250, 15);
                    if (lo.equals("ADDRESS")) {
                        y+=20;
                    }
                    y+=25;
                    this.add(l);
                    
                }
              int  y1=160;
              int j=0;
                for (String li:hok) {
                    j++;
            JLabel l2=new JLabel(li);
                    l2.setFont(new Font("arial",Font.PLAIN,15));
                    l2.setBounds(300, y1, 250, 15);
                    Font font = l2.getFont();
Map attributes = font.getAttributes();
attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_LOW_GRAY);
l2.setFont(font.deriveFont(attributes));
                  //  l2.setBorder(new LineBorder(Color.yellow, 10));
                    if (j==7) {
                        y1+=20;
                    }
                    y1+=25;
                    this.add(l2);
                    
        }
                JLabel ln=new JLabel();
                ln.setBounds(700, 200, 100, 150);
                this.add(ln);
                
         ImageIcon im4=new ImageIcon(path1);
       Image im3=im4.getImage().getScaledInstance(100, 150, 0);
       ln.setIcon(new ImageIcon(im3));
    
                
    PrinterJob pjob = PrinterJob.getPrinterJob();
PageFormat preformat = pjob.defaultPage();
preformat.setOrientation(PageFormat.LANDSCAPE);
PageFormat postformat = pjob.pageDialog(preformat);
//If user does not hit cancel then print.
if (preformat != postformat) {
    //Set print component)
    pjob.setPrintable(new faizan.e.raza.printer(this), postformat);
    if (pjob.printDialog()) {
        pjob.print();
    }
}
this.dispose();
    }

    
    
}
