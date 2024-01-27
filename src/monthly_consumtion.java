
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m
 */
public class monthly_consumtion {
    
       JFrame fram=new JFrame();
       JPanel back=new JPanel();

    public monthly_consumtion() {
    
 
        back.add(fram);
        fram.setSize(500,350);
        fram.setLocation(600, 300);
        fram.setTitle("COLLECT");
        fram.setVisible(true);
    
        fram.setResizable(false);
    }
}