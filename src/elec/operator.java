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
import javax.swing.border.LineBorder;

/**
 *
 * @author mody
 */
public class operator  {
    public operator()
    { }
    public void collect()
    {
        JFrame framee=new JFrame();
        JPanel back=new JPanel();
        Font newf=new Font("Arial",Font.BOLD,20);
        Font f1=new Font("Tahoma",Font.BOLD,40);
        
        
        JTextField field=new JTextField();
        JTextField fi=new JTextField();
        
        
        JButton read =new JButton("read");
         JButton b=new JButton("Submit"); 
       
        
        
        JLabel lab=new JLabel("Collect");
        lab.setForeground(Color.YELLOW);
        lab.setFont(f1);
        lab.setBounds(160,10,200,50);
        back.add(lab);
        
        String []items={"January","February","March","Apri","May","June","July","August","September","October","November","December"};
        JComboBox box =new JComboBox(items);
        
        
        
         
        
        back.setBackground(Color.DARK_GRAY);
        back.setLayout(null);
        
        
 
        
        framee.add(back);
        framee.setSize(500,350);
        framee.setLocation(600, 300);
        framee.setTitle("COLLECT");
        framee.setVisible(true);
        framee.setResizable(false);
       
        
        
        JLabel lable=new JLabel("Mater Code:");
        lable.setForeground(Color.CYAN);
        lable.setBounds(10,109 ,150,20);
        
        lable.setFont(newf);
        back.add(lable);
        
        
        field.setBounds(140,100,180,40);
        field.setBorder(new LineBorder(Color.BLACK, 3));
        field.setFont(newf);
        back.add(field);
        
       
        
     
        
        
        JButton bott =new JButton("Submit");
        Font in=new Font("Thoma",Font.BOLD,20);
        bott.setFont(in);
        bott.setBounds(200,220,100,60);
        bott.setBackground(Color.WHITE);
        bott.setBorder(new LineBorder(Color.BLACK, 3));
        
        
       
        
     
      
        bott.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==bott){
                    print();
                    framee.setVisible(false);
                }    
              
            
                
                
                
                 
            }
        });
        back.add(bott);
        Font newfont=new Font("Arial",Font.BOLD,20);
        box.setBounds(350, 102,130,35);
        box.setFont(newfont);
        box.setForeground(Color.BLACK);
        box.setBackground(Color.WHITE);
        back.add(box);
        
          
        
        
         
                    
       
    
        
     }
    
   public void print()
   {
    JFrame contract =new JFrame();
    JPanel back=new JPanel();
    JButton bott =new JButton("Print");
    Font f1=new Font("Arial",Font.BOLD,30);
    Font f2=new Font("Thoma",Font.BOLD,20);
    Font f3=new Font("Thoma",Font.ITALIC,20);
    back.setBackground(Color.WHITE);
    back.setLayout(null);
       
    contract.setSize(500, 500);
    contract.setVisible(true);
    contract.setResizable(false);
    contract.setLocation(100, 100);
    
       JLabel l1=new JLabel("ELECTRICITY Billing System");
       l1.setBounds(20, 15, 500, 50);
       l1.setFont(f1);
       back.add(l1);
       
        JLabel l2=new JLabel("________________________");
       l2.setBounds(20, 30, 600, 50);
       l2.setFont(f1);
       back.add(l2);
       
        JLabel l3=new JLabel("NAME:");
       l3.setBounds(15, 80, 150, 50);
       l3.setFont(f2);
       back.add(l3);
      
       JLabel l4=new JLabel("ADDRESS:");
       l4.setBounds(15, 120, 200, 50);
       l4.setFont(f2);
       back.add(l4);
       
       JLabel l5=new JLabel("CITY:");
       l5.setBounds(15, 160, 200, 50);
       l5.setFont(f2);
       back.add(l5);
       JLabel l6=new JLabel("EMAIL:");
       l6.setBounds(15, 200, 200, 50);
       l6.setFont(f2);
       back.add(l6);
       JLabel l7=new JLabel("PHONE Number:");
       l7.setBounds(15, 240, 200, 50);
       l7.setFont(f2);
       back.add(l7);
       JLabel l8=new JLabel("ADDRESS:");
       l8.setBounds(15, 280, 200, 50);
       l8.setFont(f2);
       back.add(l8);
       
      JLabel l9=new JLabel("METTER Code:");
       l9.setBounds(15, 320, 200, 50);
       l9.setFont(f2);
       back.add(l9);
       
       JLabel l10=new JLabel("MONTH:");
       l10.setBounds(15, 360, 200, 50);
       l10.setFont(f2);
       back.add(l10);
       
       JLabel l11=new JLabel("BILLS:");
       l11.setBounds(15, 400, 200, 50);
       l11.setFont(f2);
       back.add(l11);
      
       contract.add(back);
       
     
       
       
   
   }
   
   public void cancel()
   {
    JFrame cont =new JFrame();
    JPanel panl=new JPanel();
    Font on=new Font("Arial",Font.BOLD,20);
    panl.setBackground(Color.DARK_GRAY);
    panl.setLayout(null);
    
    
    JTextField fi=new JTextField();
    fi.setBounds(140,100,180,40);
    fi.setBorder(new LineBorder(Color.BLACK, 3));
    fi.setFont(on);
    panl.add(fi);
    
       
        
    JButton but=new JButton("Submit");
    
    but.setBounds(200,220,100,60);
    but.setBackground(Color.WHITE);
    but.setBorder(new LineBorder(Color.BLACK, 3));
    but.setFont(on);
    panl.add(but);
    
    
    
    
    cont.add(panl);
    cont.setSize(500, 350);
    cont.setVisible(true);
    cont.setResizable(false);
    cont.setTitle("CANCEL AND STOP METTER");
    cont.setLocation(200, 200);
    
    JLabel lab=new JLabel("cancel and stop matter");
    Font f8=new Font("Tahoma",Font.BOLD,40);
    lab.setFont(f8);
    lab.setBounds(10,10,500,50);
    lab.setForeground(Color.yellow);
    panl.add(lab);
    
    
     
    
        ;
   
    JLabel lab1=new JLabel("Mater Code:");
    lab1.setFont(on);
    lab1.setBounds(10,109 ,150,20);
    lab1.setForeground(Color.cyan);
    panl.add(lab1);
    
   
        
        
        
    
    
    
   }
   
   public void reading(){
        JFrame frame =new JFrame();
        Font f=new Font("Arial",Font.BOLD,20);
        Font f1=new Font("Tahoma",Font.BOLD,40);
        JPanel back=new JPanel();
        back.setLayout(null);
        back.setBackground(Color.DARK_GRAY);
        JTextField t=new JTextField();
        t.setBounds(150,100,180,40);
        t.setFont(f);
        t.setBorder(new LineBorder(Color.BLACK, 3));
        
        JLabel l1=new JLabel("Reading");
        l1.setForeground(Color.YELLOW);
        l1.setFont(f1);
        l1.setBounds(160,10,200,50);
        
        JLabel l=new JLabel("Mater code:");
        l.setForeground(Color.CYAN);
        l.setFont(f);
        l.setBounds(10,109 ,150,20);
        
        JButton b=new JButton("Submit"); 
        b.setBounds(200,220,100,60);
        b.setBackground(Color.WHITE);
        b.setBorder(new LineBorder(Color.BLACK, 3));
        b.setFont(f);
        
        String[] items = { "January","February","March","Apri","May","June","July","August","September","October","November","December" };
        JComboBox comboBox = new JComboBox( items );  
        comboBox.setBounds(350, 102,130,35);
        comboBox.setFont(f);
        comboBox.setForeground(Color.BLACK);   
        comboBox.setBackground(Color.WHITE); 
        
        JTextField t2=new JTextField();
        t2.setBounds(150,160,180,40);
        t2.setFont(f);
        t2.setBorder(new LineBorder(Color.BLACK, 3));
        
        
        JLabel l2=new JLabel("Consumptoin:");
        l2.setForeground(Color.CYAN);
        l2.setFont(f);
        l2.setBounds(10,169 ,150,20);
        
        JLabel l3=new JLabel("KW");
        l3.setForeground(Color.DARK_GRAY);
        l3.setFont(f);
        t2.add(l3);
        l3.setBounds(130,10,40,20);

        
        back.add(t);back.add(l);back.add(l1);back.add(b);back.add(comboBox);back.add(t2);back.add(l2);
        frame.add(back);
        frame.setVisible(true);
        frame.setLocation(600,300);
        frame.setTitle("READING");
        frame.setResizable(false);
        frame.setSize(500,350);
        
     
          
   }
   
   
   public void operator(){
        JFrame frame=new JFrame();
        ImageIcon image=new ImageIcon(getClass().getResource("a.jpg"));
        ImageIcon image1=new ImageIcon(getClass().getResource("collect.png"));
        ImageIcon image2=new ImageIcon(getClass().getResource("reading.png"));
        ImageIcon image3=new ImageIcon(getClass().getResource("view.png"));
        ImageIcon image4=new ImageIcon(getClass().getResource("cancel.png"));
        
        JLabel back=new JLabel(image);
        JLabel collect=new JLabel(image1);
        collect.setBounds(210,350,220,220);
        collect.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 collect();
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
                if(me.getSource()==collect){
                    collect.setBounds(210,340,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==collect){
                    collect.setBounds(210,350,220,220);
                }    
            }
            
        });
        
        JLabel reading=new JLabel(image2);
        reading.setBounds(460,350,220,220);
        reading.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 reading();
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
                if(me.getSource()==reading){
                    reading.setBounds(460,340,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==reading){
                    reading.setBounds(460,350,220,220);
                }    
            }
            
        });
        
        
        JLabel view=new JLabel(image3);
        view.setBounds(810,350,220,220);
        view.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 print();
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
                if(me.getSource()==view){
                    view.setBounds(810,340,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==view){
                    view.setBounds(810,350,220,220);
                }    
            }
            
        });
        
        
        JLabel cancel=new JLabel(image4);
        cancel.setBounds(1060,350,220,220);
        cancel.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 cancel();
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
                if(me.getSource()==cancel){
                    cancel.setBounds(1060,340,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==cancel){
                    cancel.setBounds(1060,350,220,220);
                }    
            }
            
        });
        
        JMenuBar m=new JMenuBar();
        m.setBounds(0, 0,1500,30);
        JMenu help=new JMenu("Help");
        JMenu file=new JMenu("File");
        JMenu tool=new JMenu("Tool");
        m.add(help);m.add(tool); m.add(file);
        
        JMenuItem calc=new JMenuItem("calc");
        JMenuItem bill=new JMenuItem("bill");
        help.add(calc);help.add(bill);
        
        
        back.add(collect);back.add(reading);back.add(view);back.add(cancel);back.add(m);
        frame.add(back);
        frame.setSize(1500,900);
        frame.setTitle("operator");
        frame.setResizable(false);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
  
   
}

