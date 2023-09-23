/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizan.e.raza.ext;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUSSAIN
 */
public class A_T_Ct extends JInternalFrame{

    public A_T_Ct() {
             this.setClosable(true);
            this.setMaximizable(false);
            this.setIconifiable(false);
            this.setSize(300,300);
            this.setTitle("CIRCULAR PRINTING");
            this.setLocation(600, 300);
            
            JScrollPane sp=new JScrollPane();
                JTextArea txtadd=new JTextArea();
                sp.setViewportView(txtadd);
                sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                //txtadd.setBounds(0,0, 350, 70);
                sp.setBounds(20, 20, 250, 200);
                this.add(sp);
               JButton btn=new JButton("CREATE CIRCULAR");
            btn.setBounds(50, 210, 200, 30);
            btn.setBackground(Color.green);
            btn.setForeground(Color.white);
            
            this.add(btn);
                   btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        MessageFormat mf=new MessageFormat("FAIZAN-E-RZA ACADEMEY");
                        
                        txtadd.print(mf, null);
                    } catch (PrinterException ex) {
                        Logger.getLogger(A_T_Ct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            
            this.setLayout(null);
        }
    
    }
    
    
    
    
    

