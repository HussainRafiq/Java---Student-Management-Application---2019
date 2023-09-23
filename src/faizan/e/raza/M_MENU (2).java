/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizan.e.raza;
import faizan.e.raza.ext.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author HUSSAIN
 */
public class M_MENU extends  JMenuBar{

    public M_MENU() {
        JMenu mn=new JMenu("FILE");
        JMenu mn1=new JMenu("RECORD");
        JMenu mn2=new JMenu("EXTRAS");
        JMenuItem mt11=new JMenuItem("EXIT");
         mt11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
new FAIZANERAZA().m.dispose();
            }
        });
     
        mt11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
     
        JMenuItem mt21=new JMenuItem("STUDENT RECORD");
        mt21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           new FAIZANERAZA().P0.show();
            }
        });
        mt21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
//     JMenuItem mt22=new JMenuItem("TEACHERS RECORD");
//        mt22.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
     JMenu mt31=new JMenu("PRINTING OPTION");
        JMenuItem mt311=new JMenuItem("ATTENDENCE SHEET PRINTING");
        mt311.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok");
                new faizan.e.raza.FAIZANERAZA().p09.show();
            }
        });
        mt311.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
     JMenuItem mt312=new JMenuItem("CIRCULAR PRINTING");
        mt312.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
     mt312.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok");
                new faizan.e.raza.FAIZANERAZA().p10.show();
            }
        });
        //JMenuItem mt32=new JMenuItem("BACKUP AND RESTORE");
        //mt32.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
//     //mt32.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("ok");
//                new faizan.e.raza.FAIZANERAZA().p10.show();
//            }
//        });
//     
        mn.add(mt11);
       mn1.add(mt21);
//      mn1.add(mt22);
      mn2.add(mt31);
     // mn2.add(mt32);
      mt31.add(mt311);
      mt31.add(mt312);
          
         
        this.add(mn);
        this.add(mn1);
        this.add(mn2);
    
    }
    
    
}
