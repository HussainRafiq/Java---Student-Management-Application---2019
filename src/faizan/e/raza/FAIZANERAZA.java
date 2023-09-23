/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package faizan.e.raza;
import faizan.e.raza.ext.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
/**
 *
 * @author HUSSAIN
 */
public class FAIZANERAZA {

    /**
     * @param args the command line arguments
     */
   static JFrame m12=new starter();
 
   static JFrame m=new M_WINDOW();
   static JMenuBar m1=new M_MENU();
 //  static JPanel m2=new down();
   static JDesktopPane m3=new MD_P();

   
   
   static JPanel m4=new M_HEADER();
 //  static M_R_A_R p1=new  M_R_A_R();
//static M_R_A_u p3=new  M_R_A_u();
static M_R_A P9=new M_R_A();
static M_A p34=new M_A();
static M_A_U p32=new M_A_U();
static M_A_U_a p39;

static M_N_W P0=new M_N_W();

static JScrollPane sp=new JScrollPane();
static JInternalFrame p09=new A_T_C();
//static JInternalFrame p90=new B_R();
static JInternalFrame p10=new A_T_Ct();
static JScrollPane sp1=new JScrollPane();
static JTabbedPane m5=new M_R();
   public static Dimension d=Toolkit.getDefaultToolkit().getScreenSize(); 
   public static void main(String[] args) {
m.setIconImage(Toolkit.getDefaultToolkit().getImage("lop.png"));
// TODO code application logic here
        m.setJMenuBar(m1);
      //  m2.setBounds(0,d.height-100,d.width,100);
       // m.add(m2);
        m3.setBounds(0, 0, d.width, d.height);
        m.add(m3);
        m4.setBounds(0, 0, d.width, 130);
        m3.add(m4);
        m5.setBounds(0,130, d.width, d.height);
        m3.add(m5);
        
        p34.setSize(d.width,800);
sp.setSize(400, 400);
Dimension d1=new Dimension(d.width, 1200);
p34.setPreferredSize(d1);
sp.setViewportView(p34);
sp.setBackground(Color.red);
sp1.setSize(400, 400);
Dimension d2=new Dimension(d.width, 1300);
p32.setPreferredSize(d1);
sp1.setViewportView(p32);
            sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
m3.add(P0);

P9.add("ADMISSION FORM", sp);
            JTabbedPane tp=new JTabbedPane();
            String j[]={"DARJA-E-OULA","DARJA-E-SAANIA","DARJA-E-SALISA","DARJA-E-RABIYAH","DARJA-E-KHAMISAH","DARJA-E-SADISAH","DARJA-E-SABIAH","DARJA MAUQOOF ILEH","DAURA-E-HADEES","TAKHASUS"};
            Dimension d23=new Dimension(800, 1300);

//            m3.add(p90);
            for (String hj:j) {
                
            
    p39=new M_A_U_a(hj);
p39.setPreferredSize(d1);
    JScrollPane sp3= new JScrollPane();
sp3.setViewportView(p39);
            sp3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    
           tp.add(hj,sp3);
           
       }
            
            m3.add(p09);
            m3.add(p10);
           P0.add(tp);
            
        P9.add("STUDENT DETAIL UPDATE OR DELETE", sp1);
        m5.add("STUDENT RECORD", P9);
        m.repaint();
        m12.setVisible(true);
       
        
    }
    
}
