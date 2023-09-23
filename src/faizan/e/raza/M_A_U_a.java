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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUSSAIN
 */
public class M_A_U_a extends JPanel{
String path="";
     Statement  sti;
 String col[]={"GR.NO","STUDENT'S NAME","FATHER'S NAME","DATE OF BIRTH","CONTACT NO","EMAIL ADDRESS","ADDRESS","PROFESSION","QUALIFICATION","PREVIOUS MADRASSA","SHIFT","NATURE OF WORK","EXPERTISE","ADDMISSION IN CLASS","ADMISSION DATE","image"};
            String row[][]={};
            
     DefaultTableModel dtm=new DefaultTableModel(row,col);
    public M_A_U_a(String ok) {
     try {
            
            dtm.getDataVector().removeAllElements();
            sti=new st().al();
            try {
                Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    //            jScrollPane2.setSize(d.width,2100);
                //this.setPreferredSize(d.width,1800);
                this.setBackground(Color.LIGHT_GRAY);
                JLabel lb1=new JLabel("INFORMATION");
                sti=new st().al();
                lb1.setFont(new Font("algerian", Font.BOLD, 40));
                
                this.setLayout(null);
                lb1.setBounds(0, 0,1000, 60);
                lb1.setHorizontalAlignment(JLabel.CENTER);
                this.add(lb1);
                String columns[]={"GR.NO","STUDENT'S NAME","FATHER'S NAME","DATE OF BIRTH","CONTACT NO","EMAIL ADDRESS","ADDRESS","PROFESSION","QUALIFICATION","PREVIOUS MADRASSA","SHIFT / CAMPUS","NATURE OF WORK","EXPERTISE","ADDMISSION IN CLASS","ADMISSION DATE"};
                int y=80;
             
                
                for (String lo : columns) {
                    JLabel l=new JLabel(lo);
                    l.setFont(new Font("arial",Font.PLAIN,20));
                    this.setSize(d.width,2500);
                    l.setBounds(80, y, 250, 40);
                    // l.setBorder(new LineBorder(Color.yellow, 4));
                    if (lo.equals("ADDRESS")) {
                        y+=50;
                    }
                    y+=55;
                    this.add(l);
                    
                }
                JLabel l2=new JLabel("     ");
                l2.setBounds(300, 80, 250, 40);
                l2.setBorder(new LineBorder(Color.BLACK,4));
                this.add(l2);
                
                JTextField txtname=new JTextField();
                txtname.setBounds(300, 135, 250, 40);
                this.add(txtname);
                
                JTextField txtfname=new JTextField();
                txtfname.setBounds(300, 190, 250, 40);
                this.add(txtfname);
                
                JTextField txtage=new JTextField();
                txtage.setBounds(300, 245, 250, 40);
                this.add(txtage);
                
                JTextField txtcon=new JTextField();
                txtcon.setBounds(300,300 ,250, 40);
                this.add(txtcon);
                
                JLabel seid=new JLabel("ID");
                seid.setBounds(710,370 ,30, 20);
                this.add(seid);
                JTextField seeid=new JTextField();
                seeid.setBounds(750,370 ,50, 20);
                this.add(seeid);
                
                JLabel sena=new JLabel("NAME");
                sena.setBounds(800,370 ,50, 20);
                this.add(sena);
                JTextField seena=new JTextField();
                seena.setBounds(860,370 ,100, 20);
                this.add(seena);
                
                
                
                
                      
                JTextField txtem=new JTextField();
                txtem.setBounds(300, 355, 350, 40);
                this.add(txtem);
                JScrollPane sp=new JScrollPane();
                JTextArea txtadd=new JTextArea();
                sp.setViewportView(txtadd);
                sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                txtadd.setBounds(0,0, 350, 70);
                sp.setBounds(300, 410, 350, 70);
                this.add(sp);
                
                JTextField txtpr=new JTextField();
                txtpr.setBounds(300, 515, 250, 40);
                this.add(txtpr);
                
                JTextField txtqu=new JTextField();
                txtqu.setBounds(300, 570, 250, 40);
                this.add(txtqu);
                
                JTextField txtpm=new JTextField();
                txtpm.setBounds(300, 625, 250, 40);
                this.add(txtpm);
                
                JTextField txtsh=new JTextField();
                txtsh.setBounds(300, 680, 250, 40);
                this.add(txtsh);
                
                JTextField txtnw=new JTextField();
                txtnw.setBounds(300, 735, 250, 40);
                this.add(txtnw);
                
                JTextField txtexp=new JTextField();
                txtexp.setBounds(300, 790, 250, 40);
                this.add(txtexp);
                
                JComboBox cb=new JComboBox(new Object[]{"","DARJA-E-OULA","DARJA-E-SAANIA","DARJA-E-SALISA","DARJA-E-RABIYAH","DARJA-E-KHAMISAH","DARJA-E-SADISAH","DARJA-E-SABIAH","DARJA MAUQOOF ILEH","DAURA-E-HADEES","TAKHASUS"});
                cb.setBounds(300, 845, 250, 40);;
                this.add(cb);
                
                JLabel l3=new JLabel("     ");
                l3.setBounds(300, 900, 250, 40);
                l3.setBorder(new LineBorder(Color.BLACK,4));
                this.add(l3);
                
                JLabel imgpr=new JLabel("PICTURE");
                imgpr.setBounds(700, 80, 170,220);
                imgpr.setHorizontalAlignment(JLabel.CENTER);
                imgpr.setBorder(new LineBorder(Color.darkGray,2));
                this.add(imgpr);
                JTable tb=new JTable(dtm);
                            txtname.setText("");
                    txtfname.setText("");
                    txtage.setText("");
                    txtem.setText("");
                    txtadd.setText("");
                    txtcon.setText("");
                    txtpr.setText("");
                    txtqu.setText("");
                    txtnw.setText("");
                    txtsh.setText("");
                    txtexp.setText("");
                    txtpm.setText("");
                    imgpr.setText("PICTURE");
                    imgpr.setIcon(null);
                    cb.setSelectedIndex(0);
        
                JScrollPane sp1=new JScrollPane(tb);
                ResultSet rsq=sti.executeQuery("select * from st_r where ac='"+ok+"'");
                while(rsq.next()){
                    dtm.addRow(new Object[]{
                        rsq.getInt(1),rsq.getString(2),rsq.getString(3),rsq.getString(4),rsq.getString(5),rsq.getString(16),rsq.getString(6),rsq.getString(7),rsq.getString(8),rsq.getString(9),rsq.getString(10),rsq.getString(11),rsq.getString(12),rsq.getString(13),rsq.getString(14),rsq.getString(15)
                    });
                }
                tb.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int ab=tb.getSelectedRow();
                        System.out.println(""+ab);
                        String h=dtm.getDataVector().get(ab).toString().substring(1);
                        
                        String convert[]=h.substring(0,h.length()-1).split(",");
                        l2.setText(convert[0]);
                        txtname.setText(convert[1].toString().substring(1));
                        txtfname.setText(convert[2].toString().substring(1));
                        txtage.setText(convert[3].toString().substring(1));
                        txtcon.setText(convert[4].toString().substring(1));
                        txtem.setText(convert[5].toString().substring(1));
                        txtadd.setText(convert[6].toString().substring(1));
                        txtpr.setText(convert[7].toString().substring(1));
                        txtqu.setText(convert[8].toString().substring(1));
                        txtpm.setText(convert[9].toString().substring(1));
                        txtsh.setText(convert[10].toString().substring(1));
                        txtnw.setText(convert[11].toString().substring(1));
                        txtexp.setText(convert[12].toString().substring(1));
                        cb.setSelectedItem(""+convert[13].toString().substring(1));
                        l3.setText(convert[14]);
                        //  System.out.println(""+convert[15]);
                        File f=new File(convert[15]);
                        Image im=new ImageIcon(""+f.toString().substring(1)).getImage().getScaledInstance(170,220, 0);
                        path=f.toString().substring(1);
                        imgpr.setIcon(new ImageIcon(im));
                        
                    }
                    
                });
                sp1.setBounds(670, 400, 300, 400);
                this.add(sp1);
                this.addAncestorListener(new AncestorListener() {
                @Override
                public void ancestorAdded(AncestorEvent event) {
                    try {
                        txtname.setText("");
                        txtfname.setText("");
                        txtage.setText("");
                        txtem.setText("");
                        txtadd.setText("");
                        l2.setText("");
                        l3.setText("");
                        txtcon.setText("");
                        txtpr.setText("");
                        txtqu.setText("");
                        txtnw.setText("");
                        txtsh.setText("");
                        txtexp.setText("");
                        txtpm.setText("");
                        imgpr.setText("PICTURE");
                        imgpr.setIcon(null);
                        cb.setSelectedIndex(0);
                        ResultSet rsq=sti.executeQuery("select * from st_r where ac='"+ok+"'");
                         dtm.getDataVector().removeAllElements();
                        while(rsq.next()){
                            dtm.addRow(new Object[]{
                                rsq.getInt(1),rsq.getString(2),rsq.getString(3),rsq.getString(4),rsq.getString(5),rsq.getString(16),rsq.getString(6),rsq.getString(7),rsq.getString(8),rsq.getString(9),rsq.getString(10),rsq.getString(11),rsq.getString(12),rsq.getString(13),rsq.getString(14),rsq.getString(15)
                            });
                        }   } catch (SQLException ex) {
                        Logger.getLogger(M_A_U_a.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                @Override
                public void ancestorRemoved(AncestorEvent event) {
                    try {
                        txtname.setText("");
                        txtfname.setText("");
                        txtage.setText("");
                        txtem.setText("");
                        l2.setText("");
                        l3.setText("");
                        txtadd.setText("");
                        txtcon.setText("");
                        txtpr.setText("");
                        txtqu.setText("");
                        txtnw.setText("");
                        txtsh.setText("");
                        txtexp.setText("");
                        txtpm.setText("");
                        imgpr.setText("PICTURE");
                        imgpr.setIcon(null);
                    dtm.getDataVector().removeAllElements();
                        ResultSet rsq=sti.executeQuery("select * from st_r where ac='"+ok+"'");
                        while(rsq.next()){
                            dtm.addRow(new Object[]{
                                rsq.getInt(1),rsq.getString(2),rsq.getString(3),rsq.getString(4),rsq.getString(5),rsq.getString(16),rsq.getString(6),rsq.getString(7),rsq.getString(8),rsq.getString(9),rsq.getString(10),rsq.getString(11),rsq.getString(12),rsq.getString(13),rsq.getString(14),rsq.getString(15)
                            });
                        }
                        cb.setSelectedIndex(0);
                    } catch (SQLException ex) {
                        Logger.getLogger(M_A_U_a.class.getName()).log(Level.SEVERE, null, ex);
                    }
              }

                @Override
                public void ancestorMoved(AncestorEvent event) {
                    
               }
            });
                   
            
                txtadd.setAutoscrolls(true);
                txtadd.setLineWrap(true);
                txtadd.setWrapStyleWord(true);
                seeid.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyReleased(KeyEvent e) {
                        try {
                            System.out.println("ok");
                            ResultSet rsq=sti.executeQuery("select * from st_r where id = "+seeid.getText());
                            dtm.getDataVector().removeAllElements();
                            while(rsq.next()){
                              if (rsq.getString(13).equals(ok)) {
                                   
                                dtm.addRow(new Object[]{
                                    
                                
                                    rsq.getInt(1),rsq.getString(2),rsq.getString(3),rsq.getString(4),rsq.getString(5),rsq.getString(16),rsq.getString(6),rsq.getString(7),rsq.getString(8),rsq.getString(9),rsq.getString(10),rsq.getString(11),rsq.getString(12),rsq.getString(13),rsq.getString(14),rsq.getString(15)
                                            
                                            });
                            }
                            }
                        } catch (SQLException ex) {
                        }
                      
                    }
                });
seena.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyReleased(KeyEvent e) {
                        try {
                            System.out.println("ok");
                            ResultSet rsq=sti.executeQuery("select * from st_r where name like '"+seena.getText()+"%'");
                            dtm.getDataVector().removeAllElements();
                            while(rsq.next()){
                                 if (rsq.getString(13).equals(ok)) {
                                   
                                dtm.addRow(new Object[]{
                                    rsq.getInt(1),rsq.getString(2),rsq.getString(3),rsq.getString(4),rsq.getString(5),rsq.getString(16),rsq.getString(6),rsq.getString(7),rsq.getString(8),rsq.getString(9),rsq.getString(10),rsq.getString(11),rsq.getString(12),rsq.getString(13),rsq.getString(14),rsq.getString(15)
                                });
                                 }
                            }
                        } catch (SQLException ex) {
                        }
                      
                    }
                });
                
                //         // TODO add your handling code here:
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
            }
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (IOException ex) {
        Logger.getLogger(M_A_U_a.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
}
