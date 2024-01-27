/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elec;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author m
 */
public class login implements ActionListener{
    
    JButton blg1;
    JFrame f1,f4,frame;
    JButton bww1, bww2;
    JTextField tt1;
    JPasswordField tt2;
    
    
    public login()
    {
        JPanel p1;
        JLabel l2,l3,l4;
        
        ImageIcon image=new ImageIcon(getClass().getResource("s.png"));
        f1=new JFrame();
        p1=new JPanel();
        bww1=new JButton("Login");
        bww1.addActionListener(this);
        
        bww2=new JButton("Reset");
        bww2.addActionListener(this);
        l2 =new JLabel("User Name :");
        l3 =new JLabel("Password :");
        l4 =new JLabel("Login Form");
        tt1 =new JTextField();
        tt2 =new JPasswordField();
        
        JLabel l=new JLabel(image);
        l.setBounds(320,80,150,150);
        l.setBorder(new LineBorder(Color.BLACK,4));

        
        Font ff1=new Font("Tahoma",Font.BOLD,50);
        Font ff5=new Font("Arial",Font.BOLD,20);
        Font ff2=new Font("Thoma",Font.BOLD,20);
        Font ff4=new Font("Thoma",Font.PLAIN,30);
        
        f1.setTitle("Login");
        f1.setVisible(true);
        f1.setSize(500,350);
        f1.setResizable(false);
        f1.setLocation(600,300); 
        p1.setLayout(null);
        p1.setBackground(Color.DARK_GRAY);
        f1.add(p1);
       
        bww1.setBounds(80,250,150,50);
        bww1.setBorder(new LineBorder(Color.BLACK,3));
        bww2.setBounds(280,250, 150, 50);
        bww2.setBorder(new LineBorder(Color.BLACK,3));
        tt1.setBounds(150,100,160,40);
        tt1.setBorder(new LineBorder(Color.BLACK,3));
        tt2.setBounds(150, 155, 160,40);
        tt2.setBorder(new LineBorder(Color.BLACK,3));
        
        l2.setBounds(10,100,160,40);
        l3.setBounds(10,155,150, 40);
        l4.setBounds(100,0,400,80);

        l2.setFont(ff5);
        l3.setFont(ff5);
        bww1.setFont(ff2);
        l4.setFont(ff1);
        tt1.setFont(ff5);
        tt2.setFont(ff5);
        bww2.setFont(ff2);
        bww1.setBackground(Color.WHITE);bww2.setBackground(Color.WHITE);
        bww1.setForeground(Color.DARK_GRAY);bww2.setForeground(Color.DARK_GRAY);
        l2.setForeground(Color.CYAN);
        l3.setForeground(Color.CYAN);
        l4.setForeground(Color.yellow);
        p1.add(bww1);p1.add(bww2);p1.add(tt1);p1.add(tt2);p1.add(l2);p1.add(l3);p1.add(l4);p1.add(l);

        
    } 
    
    
    int flage;
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==bww1)
        {
            int i;
            String s=tt1.getText();
            String v=tt2.getText(),n="admin";
            
                    for(i=0;i<s.length();i++){
                        if(s.charAt(i)==n.charAt(i)&&v.charAt(i)==n.charAt(i)){
                            flage=1;
                        }
                        else{
                            flage=0;
                            break ;
                        }
                        }
                    }
            if(flage==1) 
            {
                Admin a=new Admin();
                a.admin();
                f1.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(frame, "your user name or password is incorrect !!", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            if(ae.getSource()==bww2){
                tt1.setText("");tt2.setText("");
            }
                
        }
    }
