/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faizan.e.raza;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.plaf.InternalFrameUI;

/**
 *
 * @author HUSSAIN
 */
public class M_N_W extends JInternalFrame {

    public M_N_W() {
    
    this.setClosable(true);
    this.setMaximizable(false);
    this.setIconifiable(false);
//    this.setUI(new InternalFrameUI() {
//       
//});
    this.setTitle("STUDENT RECORD");
    this.setSize(1000, 500);
    this.setLocation(100, 100);
this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
   
   
   
    
    
    
    
    }
    
    
}
