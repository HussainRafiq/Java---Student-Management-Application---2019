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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HUSSAIN
 */
public class M_A  extends JPanel{
String path="";
     
    public M_A() {
       
 try {
Statement sti=new st().al();

     Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
          //  
            //this.setPreferredSize(d.width,1800);
        
            this.setBackground(Color.lightGray);
        JLabel lb1=new JLabel("ADMISSION FORM");
            lb1.setFont(new Font("algerian", Font.BOLD, 40));
            
            this.setLayout(null);
            lb1.setBounds(0, 0, d.width, 60);
            lb1.setHorizontalAlignment(JLabel.CENTER);
            this.add(lb1);
            String columns[]={"GR.NO","STUDENT'S NAME","FATHER'S NAME","DATE OF BIRTH","CONTACT NO","EMAIL ADDRESS","ADDRESS","PROFESSION","QUALIFICATION","PREVIOUS MADRASSA","SHIFT","NATURE OF WORK","EXPERTISE","ADDMISSION IN CLASS"};
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
            cb.setBounds(500, 845, 250, 40);
            this.add(cb);
            JLabel imgpr=new JLabel("PICTURE");
            imgpr.setBounds(1000, 80, 170,220);
            imgpr.setHorizontalAlignment(JLabel.CENTER);
            imgpr.setBorder(new LineBorder(Color.darkGray,2));
            this.add(imgpr);
            
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
            
            
            
            
             
    
            
            
            JButton btnok=new JButton("SUBMIT");
            btnok.setBounds(400, 900, 170,50);
            btnok.setBackground(Color.GREEN);
            btnok.setForeground(Color.white);
            ResultSet rs=sti.executeQuery("select id from st_r");
           int i=0;
           
           while(rs.next()){
               i=Integer.parseInt(""+rs.getInt("id"));
            
           }
           i++; 
           l2.setText(""+i);
           this.addAncestorListener(new  AncestorListener() {
                @Override
                public void ancestorAdded(AncestorEvent event) {
                    try {
                        ResultSet rs=sti.executeQuery("select id from st_r");
                        int i=0;
                        
                        while(rs.next()){
                            i=Integer.parseInt(""+rs.getInt("id"));
                            
                        }
                        i++;
                        l2.setText(""+i);
                    } catch (SQLException ex) {
                        Logger.getLogger(M_A.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   
                }

//                @Override
//                public void ancestorRemoved(AncestorEvent event) {
//                }
//
//                @Override
//                public void ancestorMoved(AncestorEvent event) {
//                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                }

                @Override
                public void ancestorRemoved(AncestorEvent event) {
txtadd.setText("");                }

                @Override
                public void ancestorMoved(AncestorEvent event) {
                    txtadd.setText(txtadd.getText());                 }
            });
            btnok.addActionListener(new ActionListener() {
              
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (txtname.getText().equals(null) && txtfname.getText().equals(null) && txtage.getText().equals(null) && txtcon.getText().equals(null) && txtem.getText().equals(null) && txtadd.getText().equals(null) && txtqu.getText().equals(null) && txtpr.getText().equals(null) && txtpm.getText().equals(null) && txtsh.getText().equals(null) && txtnw.getText().equals(null) && txtexp.getText().equals(null) && cb.getSelectedIndex()==0 && imgpr.getText().toUpperCase().equals("PICTURE")) {
                        JOptionPane.showMessageDialog(null, "FILL ALL TH FEILDS");
                        
                    }
                    else{
                    try {
                        Statement sti=new st().al();
                        
                        Date d=new Date();
                        DateFormat df=new SimpleDateFormat("dd - MM - yyyy");
                        sti.execute("insert into st_r values ("+l2.getText()+",'"+txtname.getText()+"','"+txtfname.getText()+"','"+txtage.getText()+"','"+txtcon.getText()+"','"+txtadd.getText()+"','"+txtpr.getText()+"','"+txtqu.getText()+"','"+txtpm.getText()+"','"+txtsh.getText()+"','"+txtnw.getText()+"','"+txtexp.getText()+"','"+cb.getSelectedItem()+"','"+df.format(d)+"','"+path+"','"+txtem.getText()+"')");
                        JOptionPane.showMessageDialog(null,"INSERTED");
            ResultSet rs=sti.executeQuery("select id from st_r");
           while(rs.next()){
               int i=Integer.parseInt(""+rs.getInt("id"))+1;
            l2.setText(""+i);
           }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(M_A.class.getName()).log(Level.SEVERE, null, ex);
                    }catch (SQLException ex) {
                        Logger.getLogger(M_A.class.getName()).log(Level.SEVERE, null, ex);
                    }   catch (IOException ex) {
                            Logger.getLogger(M_A.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });
            this.add(btnok);
            txtadd.setAutoscrolls(true);
            txtadd.setLineWrap(true);
            txtadd.setWrapStyleWord(true);
            
            JButton btnc=new JButton("CLEAR");
            btnc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
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
                    
                }
            });
            btnc.setBounds(600, 900, 170,50);
            btnc.setBackground(Color.red);
            btnc.setForeground(Color.white);
            this.add(btnc);
            this.repaint();
            this.addAncestorListener(new AncestorListener() {
                @Override
                public void ancestorAdded(AncestorEvent event) {
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
              
                }

                @Override
                public void ancestorRemoved(AncestorEvent event) {
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
              }

                @Override
                public void ancestorMoved(AncestorEvent event) {
               }
            });
                   
            

                        
            //         // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        } catch (IOException ex) {
        Logger.getLogger(M_A.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
