/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;



/**
 *
 * @author m
 */
public class Elec {
    
    
    
    JLabel admin,newc,old,operator;

    public void home()
    {
        JFrame home=new JFrame();
        ImageIcon image=new ImageIcon(getClass().getResource("ab.jpg"));
        ImageIcon image1=new ImageIcon(getClass().getResource("admin.png"));
        ImageIcon image2=new ImageIcon(getClass().getResource("newcustomer.png"));
        ImageIcon image3=new ImageIcon(getClass().getResource("oldcustomer.png"));
        ImageIcon image4=new ImageIcon(getClass().getResource("oprtr.png"));
        JLabel back=new JLabel(image);
        
         admin=new JLabel(image1);
        admin.setBounds(520,230,220,220);
        admin.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
               // login log=new login();
               Admin a=new Admin();
                a.admin();
                      
            }

            @Override
            public void mousePressed(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(me.getSource()==admin){
                admin.setBounds(500,210,230,230);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==admin){
                admin.setBounds(520,230,220,220);
                }    
            }
            
        });
        
         newc=new JLabel(image2);
        newc.setBounds(740,230,220,220);
        newc.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 New_customer customer = new New_customer();
                 customer.show_new();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(me.getSource()==newc){
                    newc.setBounds(760,210,230,230);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==newc){
                    newc.setBounds(740,230,220,220);
                }    
            }
            
        });
        
         old=new JLabel(image3);
        old.setBounds(520,450,220,220);
        old.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                oldcustomer o=new oldcustomer();
                o.OldCustomer();
                //login log=new login();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(me.getSource()==old){
                old.setBounds(500,470,230,230);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==old){
                old.setBounds(520,450,220,220);
                }    
            }
            
        });
        
         operator=new JLabel(image4);
        operator.setBounds(740,450,220,220);
        operator.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                operator p=new operator();
                p.operator();
                //login log=new login();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(me.getSource()==operator){
                operator.setBounds(760,470,230,230);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==operator){
                operator.setBounds(740,450,220,220);
                }    
            }
            
        });
        
        back.setLayout(null);
        JMenuBar m=new JMenuBar();
        m.setBounds(0, 0,1500,30);
        JMenu help=new JMenu("Help"); 
        JMenu file=new JMenu("File");
        JMenu tool=new JMenu("Tool");
        m.add(help);m.add(tool); m.add(file);
        
        JMenuItem calc=new JMenuItem("calc");
        JMenuItem bill=new JMenuItem("bill");
        help.add(calc);help.add(bill);
        
        
        back.add(m);back.add(admin);back.add(newc);back.add(old);back.add(operator);
        home.add(back);
        home.setSize(1500,900);
        home.setTitle("Electricity Billing System");
        home.setResizable(false);
        home.setLocation(200,100);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
    }
    
    

        
    
    

    
    public static void main(String[] args) {
        Elec a=new Elec();
        a.home();
        Admin b=new Admin();
//        b.reading();
//oldcustomer old=new oldcustomer();
//old.OldCustomer();

//b.ubdate();

        
    }
    
}
