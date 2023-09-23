/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizan.e.raza.ext;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUSSAIN
 */
public class A_T_C extends JInternalFrame{

    public A_T_C() {
             this.setClosable(true);
            this.setMaximizable(false);
            this.setIconifiable(false);
            this.setSize(300,300);
            this.setTitle("ATTENDENCE SHEET PRINTING");
            this.setLocation(600, 300);
            
            JLabel l1=new JLabel("CLASS");
            l1.setBounds(20, 40, 50, 20);
            this.add(l1);
            JComboBox cb=new JComboBox(new Object[]{"","DARJA-E-OULA","DARJA-E-SAANIA","DARJA-E-SALISA","DARJA-E-RABIYAH","DARJA-E-KHAMISAH","DARJA-E-SADISAH","DARJA-E-SABIAH","DARJA MAUQOOF ILEH","DAURA-E-HADEES","TAKHASUS"});
            cb.setBounds(80, 40, 150, 20);
            this.add(cb);
            
            JLabel l2=new JLabel("MONTH");
            l2.setBounds(20, 70, 50, 20);
            this.add(l2);
            JComboBox cb2=new JComboBox(new Object[]{"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"});
            cb2.setBounds(80, 70, 150, 20);
            this.add(cb2);
            JLabel l3=new JLabel("YEAR");
            l3.setBounds(20, 100, 50, 20);
            this.add(l3);
            JTextField txt=new JTextField();
            txt.setBounds(80, 100, 150,20);
            this.add(txt);
            JButton btn1=new JButton("OK");
            btn1.setBounds(250, 130, 30, 20);
            btn1.setBackground(Color.green);
            btn1.setForeground(Color.white);
            this.add(btn1);
            JButton btn=new JButton("CREATE ATTENDENCE SHEET");
            btn.setBounds(50, 130, 200, 30);
            btn.setBackground(Color.green);
            btn.setForeground(Color.white);
            
            this.add(btn);
            JTable tb=new JTable();
            JScrollPane sp=new JScrollPane(tb);
        tb.setRowHeight(60);
            tb.setFont(new Font("arial",Font.PLAIN,25));
                       this.add(sp);
            String jk[]=new String[32];
   DefaultTableModel dtm=new DefaultTableModel();
             String row[][]={};

   btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                                   }
                   });
                   btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                             jk[0]="Names";

                        for (int i = 1; i < jk.length; i++) {
                            jk[i]=""+i;

                        }

dtm.setDataVector(row, jk);     
              
tb.setModel(dtm);
 tb.getColumnModel().getColumn(0).setPreferredWidth(500);

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://PROGRAMMER_PC\\MSSQLSERVERS;databaseName=faizaneraza;integratedSecurity=true;";
        Connection con = DriverManager.getConnection(url);
        Statement sti=con.createStatement();
 
                        sp.setBounds(0, 160, 2200, 200);                  
                        ResultSet rs=sti.executeQuery("select name from st_r where ac='"+cb.getSelectedItem()+"'");
                        while (rs.next()) {
                            dtm.addRow(new Object[]{rs.getString("name").toUpperCase(),"      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      ","      "});
                            
                        }
                        MessageFormat mf=new MessageFormat("FAIZAN-E-RAZA "+cb.getSelectedItem()+" "+cb2.getSelectedItem()+" "+txt.getText());
                        tb.print(JTable.PrintMode.FIT_WIDTH, mf, null,true,null,true,null);
                    } catch (SQLException ex) {
                        Logger.getLogger(A_T_C.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (PrinterException ex) {
                        Logger.getLogger(A_T_C.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(A_T_C.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
            });
            
            
            this.setLayout(null);
        }
    
    }
    
    
    
    
    

