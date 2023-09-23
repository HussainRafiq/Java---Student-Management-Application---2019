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
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.MessageFormat;
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
public class M_A_U extends JPanel{
String path="";
     
 String col[]={"GR.NO","STUDENT'S NAME","FATHER'S NAME","DATE OF BIRTH","CONTACT NO","EMAIL ADDRESS","ADDRESS","PROFESSION","QUALIFICATION","PREVIOUS MADRASSA","SHIFT / CAMPUS","NATURE OF WORK","EXPERTISE","ADDMISSION IN CLASS","ADMISSION DATE","image"};
            String row[][]={};
            
     DefaultTableModel dtm=new DefaultTableModel(row,col);
    public M_A_U() {
           
        try {
            
            dtm.getDataVector().removeAllElements();
            try {
                Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    //            jScrollPane2.setSize(d.width,2100);
                //this.setPreferredSize(d.width,1800);
                this.setBackground(Color.LIGHT_GRAY);
                JLabel lb1=new JLabel("INFORMATION");
               Statement sti=new st().al();
                lb1.setFont(new Font("algerian", Font.BOLD, 40));
                
                this.setLayout(null);
                lb1.setBounds(0, 0, d.width, 60);
                lb1.setHorizontalAlignment(JLabel.CENTER);
                this.add(lb1);
                String columns[]={"GR.NO","STUDENT'S NAME","FATHER'S NAME","DATE OF BIRTH","CONTACT NO","EMAIL ADDRESS","ADDRESS","PROFESSION","QUALIFICATION","PREVIOUS MADRASSA","SHIFT / CAMPUS","NATURE OF WORK","EXPERTISE","ADDMISSION IN CLASS","ADMISSION DATE"};
                int y=80;
                
                for (String lo : columns) {
                    JLabel l=new JLabel(lo);
                    l.setFont(new Font("arial",Font.PLAIN,20));
                    this.setSize(d.width,2500);
                    l.setBounds(200, y, 250, 40);
                    // l.setBorder(new LineBorder(Color.yellow, 4));
                    if (lo.equals("ADDRESS")) {
                        y+=50;
                    }
                    y+=55;
                    this.add(l);
                    
                }
                JLabel l2=new JLabel("     ");
                l2.setBounds(500, 80, 250, 40);
                l2.setBorder(new LineBorder(Color.BLACK,4));
                this.add(l2);
                
                JTextField txtname=new JTextField();
                txtname.setBounds(500, 135, 250, 40);
                this.add(txtname);
                
                JTextField txtfname=new JTextField();
                txtfname.setBounds(500, 190, 250, 40);
                this.add(txtfname);
                
                JTextField txtage=new JTextField();
                txtage.setBounds(500, 245, 250, 40);
                this.add(txtage);
                
                JTextField txtcon=new JTextField();
                txtcon.setBounds(500,300 ,250, 40);
                this.add(txtcon);
                
                JLabel seid=new JLabel("ID");
                seid.setBounds(900,370 ,30, 20);
                this.add(seid);
                JTextField seeid=new JTextField();
                seeid.setBounds(940,370 ,50, 20);
                this.add(seeid);
                
                JLabel sena=new JLabel("NAME");
                sena.setBounds(1000,370 ,50, 20);
                this.add(sena);
                JTextField seena=new JTextField();
                seena.setBounds(1060,370 ,100, 20);
                this.add(seena);
                
                
                
                
                      
                JTextField txtem=new JTextField();
                txtem.setBounds(500, 355, 350, 40);
                this.add(txtem);
                JScrollPane sp=new JScrollPane();
                JTextArea txtadd=new JTextArea();
                sp.setViewportView(txtadd);
                sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                txtadd.setBounds(0,0, 350, 70);
                sp.setBounds(500, 410, 350, 70);
                this.add(sp);
                
                JTextField txtpr=new JTextField();
                txtpr.setBounds(500, 515, 250, 40);
                this.add(txtpr);
                
                JTextField txtqu=new JTextField();
                txtqu.setBounds(500, 570, 250, 40);
                this.add(txtqu);
                
                JTextField txtpm=new JTextField();
                txtpm.setBounds(500, 625, 250, 40);
                this.add(txtpm);
                
                JTextField txtsh=new JTextField();
                txtsh.setBounds(500, 680, 250, 40);
                this.add(txtsh);
                
                JTextField txtnw=new JTextField();
                txtnw.setBounds(500, 735, 250, 40);
                this.add(txtnw);
                
                JTextField txtexp=new JTextField();
                txtexp.setBounds(500, 790, 250, 40);
                this.add(txtexp);
                
                JComboBox cb=new JComboBox(new Object[]{"","DARJA-E-OULA","DARJA-E-SAANIA","DARJA-E-SALISA","DARJA-E-RABIYAH","DARJA-E-KHAMISAH","DARJA-E-SADISAH","DARJA-E-SABIAH","DARJA MAUQOOF ILEH","DAURA-E-HADEES","TAKHASUS"});
                cb.setBounds(500, 845, 250, 40);;
                this.add(cb);
                
                JLabel l3=new JLabel("     ");
                l3.setBounds(500, 900, 250, 40);
                l3.setBorder(new LineBorder(Color.BLACK,4));
                this.add(l3);
                
                JLabel imgpr=new JLabel("PICTURE");
                imgpr.setBounds(1000, 80, 170,220);
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
                ResultSet rsq=sti.executeQuery("select * from st_r");
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
                sp1.setBounds(900, 400, 400, 400);
                this.add(sp1);
                JButton btnb=new JButton("BROWSE");
                btnb.setBounds(1000, 310, 170,50);
                this.add(btnb);
                btnb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fc=new JFileChooser();
                        fc.setFileFilter(new FileNameExtensionFilter("JPG FILE", "JPG"));
                        fc.setMultiSelectionEnabled(false);
                        fc.setFileFilter(new FileNameExtensionFilter("JPEG FILE", "JPEG"));
                        fc.setFileFilter(new FileNameExtensionFilter("PNG FILE", "PNG"));
                        int a=fc.showOpenDialog(null);
                        if (a==JFileChooser.APPROVE_OPTION) {
                            imgpr.setText("");
                            path=fc.getSelectedFile().getAbsolutePath();
                            ImageIcon im=new ImageIcon(fc.getSelectedFile().getAbsolutePath());
                            Image im1=im.getImage().getScaledInstance(170, 220, 0);
                            imgpr.setIcon(new ImageIcon(im1));
                            
                        }
                        
                    }
                    
                    
                    
                });
          
                
                JButton btnL=new JButton("PRINT");
                btnL.setBounds(200, 960, 170,50);
                btnL.setBackground(Color.GREEN);
                btnL.setForeground(Color.white);
                this.add(btnL);
                btnL.addActionListener(new ActionListener() {
              
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            String hok[]=new String[15];
                            hok[0]=l2.getText();
                            hok[1]=txtname.getText();
                            hok[2]=txtfname.getText();
                            hok[3]=txtage.getText();
                            hok[4]=txtcon.getText();
                            hok[5]=txtem.getText();
                            hok[6]=txtadd.getText();
                            hok[7]=txtpr.getText();
                            hok[8]=txtqu.getText();
                            hok[9]=txtpm.getText();
                            hok[10]=txtsh.getText();
                            hok[11]=txtnw.getText();
                            hok[12]=txtexp.getText();
                            hok[13]=""+cb.getSelectedItem();
                            hok[14]=l3.getText();
                            
                            new faizan.e.raza.print(hok,path);
//                        try {
//                            JTextArea txt=new JTextArea();
//                            String ab=""+col[0]+"  :  "+l2.getText()+" \n\n"+col[1]+"  :  "+txtname.getText()+" \n\n"+col[2]+"  :  "+txtfname.getText()+" \n\n"+col[3]+" : "+txtage.getText()+" \n\n"+col[4]+" : "+txtcon.getText()+" \n\n"+col[5]+" : "+txtem.getText()+" \n\n"+col[6]+" : "+txtadd.getText()+" \n\n"+col[7]+" : "+txtpr.getText()+" \n\n"+col[8]+" : "+txtqu.getText()+" \n\n"+col[9]+" : "+txtpm.getText()+" \n\n"+col[10]+" : "+txtsh.getText()+" \n\n"+col[11]+" : "+txtnw.getText()+" \n\n"+col[12]+" : "+txtexp.getText()+" \n\n"+col[13]+" : "+cb.getSelectedItem()+" \n\n"+col[14]+" : "+l3.getText();
//                            txt.setText(ab);
//                            txt.print(new MessageFormat("FAIZANERAZA"), null);
//                        } catch (PrinterException ex) {
//                            Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
//                        }
                        } catch (PrinterException ex) {
                            Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
                
                
                
                JButton btnok=new JButton("UPDATE");
                btnok.setBounds(400, 960, 170,50);
                btnok.setBackground(Color.GREEN);
                btnok.setForeground(Color.white);
                btnok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (txtname.getText().equals("") && txtfname.getText().equals("") && txtage.getText().equals("") && txtcon.getText().equals("") && txtem.getText().equals("") && txtadd.getText().equals("") && txtqu.getText().equals("") && txtpr.getText().equals("") && txtpm.getText().equals("") && txtsh.getText().equals("") && txtnw.getText().equals("") && txtexp.getText().equals("") && cb.getSelectedIndex()==0 && imgpr.getIcon().equals(null)) {
                            JOptionPane.showMessageDialog(null, "FILL ALL TH FEILDS");
                            
                        }
                        else{
                            try {
                                Statement sti=new st().al();
                                
                                Date d=new Date();
                                DateFormat df=new SimpleDateFormat("dd - MM - yyyy");
                                                sti.execute("delete from st_r where id="+l2.getText());
                                sti.execute("insert into st_r values ("+l2.getText()+",'"+txtname.getText()+"','"+txtfname.getText()+"','"+txtage.getText()+"','"+txtcon.getText()+"','"+txtadd.getText()+"','"+txtpr.getText()+"','"+txtqu.getText()+"','"+txtpm.getText()+"','"+txtsh.getText()+"','"+txtnw.getText()+"','"+txtexp.getText()+"','"+cb.getSelectedItem()+"','"+df.format(d)+"','"+path+"','"+txtem.getText()+"')");
                               ResultSet rsq1=sti.executeQuery("select * from st_r");
                                dtm.getDataVector().removeAllElements();
                                while(rsq1.next()){
                                    dtm.addRow(new Object[]{
                                        rsq1.getInt(1),rsq1.getString(2),rsq1.getString(3),rsq1.getString(4),rsq1.getString(5),rsq1.getString(16),rsq1.getString(6),rsq1.getString(7),rsq1.getString(8),rsq1.getString(9),rsq1.getString(10),rsq1.getString(11),rsq1.getString(12),rsq1.getString(13),rsq1.getString(14),rsq1.getString(15)
                                    });
                                    
                                }
                                JOptionPane.showMessageDialog(null,"UPDATED");
                                
                            }catch (SQLException ex) {
                               
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
                this.add(btnok);
                txtadd.setAutoscrolls(true);
                txtadd.setLineWrap(true);
                txtadd.setWrapStyleWord(true);
                this.addAncestorListener(new AncestorListener() {
                @Override
                public void ancestorAdded(AncestorEvent event) {
                    try {
                        txtname.setText("");
                        txtfname.setText("");
                        l2.setText("");
                        l3.setText("");
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
Statement sti=new st().al();
                        ResultSet rsq1=sti.executeQuery("select * from st_r");
                        dtm.getDataVector().removeAllElements();
                        while(rsq1.next()){
                            dtm.addRow(new Object[]{
                                rsq1.getInt(1),rsq1.getString(2),rsq1.getString(3),rsq1.getString(4),rsq1.getString(5),rsq1.getString(16),rsq1.getString(6),rsq1.getString(7),rsq1.getString(8),rsq1.getString(9),rsq1.getString(10),rsq1.getString(11),rsq1.getString(12),rsq1.getString(13),rsq1.getString(14),rsq1.getString(15)
                            });
                            
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
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
                        l3.setText(""); txtadd.setText("");
                        txtcon.setText("");
                        txtpr.setText("");
                        txtqu.setText("");
                        txtnw.setText("");
                        txtsh.setText("");
                        txtexp.setText("");
                        txtpm.setText("");
                        imgpr.setText("PICTURE");
                        imgpr.setIcon(null);
                        Statement sti=new st().al();
                        ResultSet rsq1=sti.executeQuery("select * from st_r");
                        dtm.getDataVector().removeAllElements();
                        while(rsq1.next()){
                            dtm.addRow(new Object[]{
                                rsq1.getInt(1),rsq1.getString(2),rsq1.getString(3),rsq1.getString(4),rsq1.getString(5),rsq1.getString(16),rsq1.getString(6),rsq1.getString(7),rsq1.getString(8),rsq1.getString(9),rsq1.getString(10),rsq1.getString(11),rsq1.getString(12),rsq1.getString(13),rsq1.getString(14),rsq1.getString(15)
                            });
                            
                        }
                        
                        cb.setSelectedIndex(0);
                    } catch (SQLException ex) {
                        Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                    }
              }

                @Override
                public void ancestorMoved(AncestorEvent event) {
               
               }
            });
                   
            
                JButton btnc=new JButton("DELETE");
                btnc.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            
                            
                            Statement sti=new st().al();
                            sti.execute("delete from st_r where id="+l2.getText());
                     ResultSet rsq1=sti.executeQuery("select * from st_r");
                                dtm.getDataVector().removeAllElements();
                                while(rsq1.next()){
                                    dtm.addRow(new Object[]{
                                        rsq1.getInt(1),rsq1.getString(2),rsq1.getString(3),rsq1.getString(4),rsq1.getString(5),rsq1.getString(16),rsq1.getString(6),rsq1.getString(7),rsq1.getString(8),rsq1.getString(9),rsq1.getString(10),rsq1.getString(11),rsq1.getString(12),rsq1.getString(13),rsq1.getString(14),rsq1.getString(15)
                                    });
                                    
                                }
                               
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
                             l2.setText(""); l3.setText("");
                            imgpr.setText("PICTURE");
                            imgpr.setIcon(null);
                            cb.setSelectedIndex(0);
                            JOptionPane.showMessageDialog(null,"DELETED");
                            dtm.getDataVector().removeAllElements();
                        } catch (ClassNotFoundException ex) {
                        } catch (SQLException ex) {
                        } catch (IOException ex) {
                            Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                });
                btnc.setBounds(600, 960, 170,50);
                btnc.setBackground(Color.red);
                btnc.setForeground(Color.white);
                this.add(btnc);
                seeid.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyReleased(KeyEvent e) {
                        try {
Statement sti=new st().al();
                            ResultSet rsq=sti.executeQuery("select * from st_r where id = "+seeid.getText());
                            dtm.getDataVector().removeAllElements();
                            while(rsq.next()){
                                dtm.addRow(new Object[]{
                                    rsq.getInt(1),rsq.getString(2),rsq.getString(3),rsq.getString(4),rsq.getString(5),rsq.getString(16),rsq.getString(6),rsq.getString(7),rsq.getString(8),rsq.getString(9),rsq.getString(10),rsq.getString(11),rsq.getString(12),rsq.getString(13),rsq.getString(14),rsq.getString(15)
                                });
                                
                            }
                        } catch (SQLException ex) {
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                        }
                      
                    }
                });
seena.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyReleased(KeyEvent e) {
                        try {
                            System.out.println("ok");
                            Statement sti=new st().al();
                                    ResultSet rsq=sti.executeQuery("select * from st_r where name like '"+seena.getText()+"%'");
                            dtm.getDataVector().removeAllElements();
                            while(rsq.next()){
                                dtm.addRow(new Object[]{
                                    rsq.getInt(1),rsq.getString(2),rsq.getString(3),rsq.getString(4),rsq.getString(5),rsq.getString(16),rsq.getString(6),rsq.getString(7),rsq.getString(8),rsq.getString(9),rsq.getString(10),rsq.getString(11),rsq.getString(12),rsq.getString(13),rsq.getString(14),rsq.getString(15)
                                });
                                
                            }
                        } catch (SQLException ex) {
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
                        }
                      
                    }
                });
                
                //         // TODO add your handling code here:
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
            }
        } catch (IOException ex) {
        Logger.getLogger(M_A_U.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
}
