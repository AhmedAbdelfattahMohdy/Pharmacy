/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elec;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;
import javax.swing.table.*;
/**
 *
 * @author Ahmed Mohdy
 */
public class Admin extends person implements ActionListener{
    
    
    JButton blg1,blg2,b1,b2;
    JFrame f1,f2,f4,frame;
    JTextField tt1;
    JPasswordField tt2;
 
    
    

    public Admin() {
    }

    public Admin(String name, String adress, String region, String email, int phone, String city) {
        super(name, adress, region, email, phone, city);
    }
    
    person per=new person();
    
    
    public void edit_customers ()
    {
     f2=new JFrame();
    JPanel p=new JPanel();
     blg1=new JButton("Edit New Customer");
     blg2=new JButton("Edit Old Customer");
    JLabel l1=new JLabel("Edit Customers");
    
        f2.setTitle("Edit Customers");
        f2.setVisible(true);
        f2.setSize(1400,850);
        f2.setResizable(false);
        f2.setLocation(200, 100); 
        p.setLayout(null);
        
        blg1.addActionListener(this);
        blg2.addActionListener(this);
        blg1.setBackground(Color.WHITE);
        blg2.setBackground(Color.WHITE);
        
        blg2.setBorder(new LineBorder(Color.BLACK,3));blg1.setBorder(new LineBorder(Color.BLACK,3));
        
        
        p.setBackground(Color.DARK_GRAY);
        l1.setForeground(Color.yellow);
        blg1.setFont(new Font("Arial",Font.BOLD,60)); blg2.setFont(new Font("Arial",Font.BOLD,60));
        l1.setFont(new Font("Arial",Font.BOLD,130));
        blg1.setBounds(100, 500, 600, 150);
        blg2.setBounds(720, 500, 600, 150);
        l1.setBounds(200, 50, 1000, 350);
        f2.add(p);
        p.add(blg1);p.add(blg2);
        p.add(l1);
    
    }
    
    person perr=new person();
    JTable t1;
    JFrame f3;
    public void edit_new_customers()
    { 

            f3=new JFrame();
            JPanel p=new JPanel();
            b1=new JButton("Add");
            b1.addActionListener(this);
            b2=new JButton("Delete");
            b2.addActionListener(this);
            JLabel l1=new JLabel("Edit New Customer");
            JScrollPane sp = null;
            f3.setTitle("Edit New Customer");
            
            f3.setSize(1400,850);
            f3.setResizable(false);
            f3.setLocation(200, 100);
            
            p.setLayout(null);
            p.setBackground(Color.DARK_GRAY);
            
            
            b1.setFont(new Font("Arial",Font.BOLD,50)); b2.setFont(new Font("Arial",Font.BOLD,50));
            b1.setBackground(Color.white);b2.setBackground(Color.white);
            b1.setBorder(new LineBorder(Color.BLACK,3));b2.setBorder(new LineBorder(Color.BLACK,3));
            b1.setBounds(490, 650, 210, 70);
            b2.setBounds(720, 650, 210, 70);
            
            l1.setForeground(Color.yellow);
            l1.setFont(new Font("Arial",Font.BOLD,100));
            l1.setBounds(300, 50, 950, 120);
            
            
            
            String x[] = {"Name","Email","Phone","Adress","City","Region"};
            String y[][] = new String[20][8];
            int i=0, j=0;
            
            try {
            
            conn c1  = new conn();
            String s1 = "select * from new";
            ResultSet rs  = c1.s.executeQuery(s1);
            
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("adress");
                y[i][j++]=rs.getString("city");
                y[i][j++]=rs.getString("region");
                y[i][j++]=rs.getString("passward");
                
                

                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            t1.setFont(new Font("Arial",Font.BOLD,13));
            
            
            
            t1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                   
                   int i=t1.getSelectedRow();
                   
                   TableModel model=t1.getModel();
                   
                   perr.setName(model.getValueAt(i,0).toString());
                   perr.setPassward(model.getValueAt(i,6).toString());
                   perr.setEmail(model.getValueAt(i,1).toString());
                   String q=(String) model.getValueAt(i, 2);
                   perr.setPhone(Integer.parseInt(q));
                   perr.setAdress(model.getValueAt(i,3).toString());
                   perr.setCity(model.getValueAt(i,4).toString());
                   perr.setRegion(model.getValueAt(i,5).toString());

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
                
            }

            @Override
            public void mouseExited(MouseEvent me) {
                    
            }
            
        });
            sp = new JScrollPane(t1);
            
            sp.setBounds(200,300,1000,300);
            
            p.add(sp);
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        p.add(b1);p.add(b2);p.add(l1);
            f3.add(p);
        f3.setVisible(true);
        
        

        

    }
    
    
    
   
    JButton bb1,bb2;
    String q;
    public void edit_old_customers()
    {
        f3=new JFrame();
            JPanel p=new JPanel();
            bb1=new JButton("Delete");
            bb1.addActionListener(this);
            bb2=new JButton("Update");
            bb2.addActionListener(this);
            JLabel l1=new JLabel("Edit Old Customer");
            JScrollPane sp = null;
            f3.setTitle("Edit Old Customer");
            
            f3.setSize(1400,850);
            f3.setResizable(false);
            f3.setLocation(200, 100);
            
            p.setLayout(null);
            p.setBackground(Color.DARK_GRAY);
            
            
            bb1.setFont(new Font("Arial",Font.BOLD,50)); bb2.setFont(new Font("Arial",Font.BOLD,50));
            bb1.setBackground(Color.white);bb2.setBackground(Color.white);
            bb1.setBorder(new LineBorder(Color.BLACK,3));bb2.setBorder(new LineBorder(Color.BLACK,3));
            bb1.setBounds(490, 650, 210, 70);
            bb2.setBounds(720, 650, 210, 70);
            
            l1.setForeground(Color.yellow);
            l1.setFont(new Font("Arial",Font.BOLD,100));
            l1.setBounds(300, 50, 950, 120);
            
            JTable t1;
            
            String x[] = {"Name","Email","Phone","Adress","City","Region","Mater Code"};
            String y[][] = new String[20][8];
            int i=0, j=0;
            
            try {
            
            conn c1  = new conn();
            String s1 = "select * from old";
            ResultSet rs  = c1.s.executeQuery(s1);
            
            while(rs.next()){
                y[i][j++]=rs.getString("name");
                y[i][j++]=rs.getString("email");
                y[i][j++]=rs.getString("phone");
                y[i][j++]=rs.getString("adress");
                y[i][j++]=rs.getString("city");
                y[i][j++]=rs.getString("region");
                y[i][j++]=rs.getString("mater");
                y[i][j++]=rs.getString("passward");
                

                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            t1.setFont(new Font("Arial",Font.BOLD,13));
            
            
            
            t1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                   
                   int i=t1.getSelectedRow();
                   
                   TableModel model=t1.getModel();
                   
                   perr.setName(model.getValueAt(i,0).toString());
                   perr.setEmail(model.getValueAt(i,1).toString());
                   q=(String) model.getValueAt(i, 2);
                   perr.setPhone(Integer.parseInt(q));
                   perr.setAdress(model.getValueAt(i,3).toString());
                   perr.setCity(model.getValueAt(i,4).toString());
                   perr.setRegion(model.getValueAt(i,5).toString());
                   String s=model.getValueAt(i,6).toString();
                   perr.setMater(Integer.parseInt(s));
                   perr.setPassward(model.getValueAt(i,7).toString());
                   
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
                
            }

            @Override
            public void mouseExited(MouseEvent me) {
                    
            }
            
        });
            sp = new JScrollPane(t1);
            
            sp.setBounds(200,300,1000,300);
            
            p.add(sp);
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        p.add(bb1);p.add(bb2);p.add(l1);
            f3.add(p);
        f3.setVisible(true);
        
        

        

        
    }
    
    public void viewbills()
    {
        JFrame f5=new JFrame();
        JPanel p1=new JPanel();
      
        JLabel l1=new JLabel("Choose Reasion");
        
        JLabel l3=new JLabel("View Bills");
        
        ButtonGroup g1=new ButtonGroup();
        
        String[] items = { "Cairo", "Giza", "Alex", "Zagazig" , "Aswan" };
        JComboBox comboBox = new JComboBox( items );  
        comboBox.setBounds(700, 300, 450, 70);
        Font newFont = new Font("Arial", Font.BOLD, 70); 
        comboBox.setFont(newFont);
        comboBox.setForeground(Color.cyan);   
        comboBox.setBackground(Color.gray); 
        p1.add(comboBox);
        
        
        String columns[] = {"Name", "Adress","Phone_Num","bill cost"};    
        String data[][] = {                                     
            {"Mhamad", "GIze","6451503","300 LE" },
            {"Ahmad", "cairo","8644551051","300 LE" },
            {"Hala", "erlmkv","9522140","300 LE" },
            {"Rim", "sfvlmk","6468534513" ,"300 LE"},
            {"Said", "dmlfk","8252265","300 LE" },
            {"Abdullah", "ol","4896165651" , "300 LE"},
           
        };
 
        DefaultTableModel model = new DefaultTableModel();       
        model.setDataVector(data, columns); 
        model.addRow(data);
        JTable table = new JTable(model);                       
        JScrollPane tableScroller= new JScrollPane(table);      
 
        tableScroller.setBounds(200, 500, 1000, 210);
        p1.add(tableScroller); 
        
        
        f5.setTitle("Consumption");
        f5.setSize(1400,850);
        f5.setVisible(true);
        f5.setResizable(false);
        f5.setLocation(200,100);
        p1.setLayout(null);
       
        l1.setBounds(200, 300, 470, 70);
        
        l3.setBounds(460, 50, 1100, 120);
        
        
        p1.setBackground(Color.darkGray);
        
        l1.setFont(new Font("Arial",Font.BOLD,60));
        
        l3.setFont(new Font("Arial",Font.BOLD,100));
        
        l1.setForeground(Color.yellow);
        
        l3.setForeground(Color.yellow);
        
        f5.add(p1);
        p1.add(l1);
        p1.add(l3);
    }
    
    public void total_consumption()
    {
        JFrame f6=new JFrame();
        JPanel p1=new JPanel();
        JTextField t1=new JTextField();
        
        JLabel l1=new JLabel("Choose Reasion");
        JLabel l2=new JLabel("Total");
        JLabel l3=new JLabel("Total consumption");
        JLabel l4=new JLabel("KW");
        ButtonGroup g1=new ButtonGroup();
        
        String[] items = { "Cairo", "Giza", "Alex", "Zagazig" , "Aswan" };
        JComboBox comboBox = new JComboBox( items );  
        comboBox.setBounds(700, 300, 450, 70);
        Font newFont = new Font("Arial", Font.BOLD, 70); 
        comboBox.setFont(newFont);
        comboBox.setForeground(Color.cyan);   
        comboBox.setBackground(Color.gray); 
        p1.add(comboBox);
        
        f6.setTitle("Consumption");
        f6.setSize(1400,850);
        f6.setVisible(true);
        f6.setResizable(false);
        f6.setLocation(200,100);
        p1.setLayout(null);
       
        t1.setBounds(700, 610, 400, 70);
        
        l1.setBounds(200, 300, 470, 70);
        l2.setBounds(420, 600, 270, 100);
        l3.setBounds(250, 50, 1100, 120);
        l4.setBounds(325,10,80,50);
        
        p1.setBackground(Color.darkGray);
        
        l1.setFont(new Font("Arial",Font.BOLD,60));
        l2.setFont(new Font("Arial",Font.BOLD,60));
        l4.setFont(new Font("Arial",Font.BOLD,40));
        l3.setFont(new Font("Arial",Font.BOLD,100));
        t1.setFont(new Font("Arial",Font.BOLD,60));
        
        
        l1.setForeground(Color.yellow);
        l2.setForeground(Color.yellow);
        l3.setForeground(Color.yellow);
        l4.setForeground(Color.DARK_GRAY);
        
        f6.add(p1);
        p1.add(t1);p1.add(l1);p1.add(l2);
        p1.add(l3);
        t1.add(l4);
    }
    
    
    public void total_collected()
    {
        JFrame f7=new JFrame();
        JPanel p1=new JPanel();
        JTextField t1=new JTextField();
        
        JLabel l1=new JLabel("Choose Reasion");
        JLabel l2=new JLabel("Total");
        JLabel l3=new JLabel("Total Collected");
        JLabel l4=new JLabel("LE");
        ButtonGroup g1=new ButtonGroup();
        
        String[] items = { "Cairo", "Giza", "Alex", "Zagazig" , "Aswan" };
        JComboBox comboBox = new JComboBox( items );  
        comboBox.setBounds(700, 300, 450, 70);
        Font newFont = new Font("Arial", Font.BOLD, 70); 
        comboBox.setFont(newFont);
        comboBox.setForeground(Color.cyan);   
        comboBox.setBackground(Color.gray); 
        p1.add(comboBox);
        
        
        f7.setTitle("Consumption");
        f7.setSize(1400,850);
        f7.setVisible(true);
        f7.setResizable(false);
        f7.setLocation(200,100);
        p1.setLayout(null);
       
        t1.setBounds(700, 610, 400, 70);
        l1.setBounds(200, 300, 470, 70);
        l2.setBounds(420, 600, 270, 100);
        l3.setBounds(350, 50, 1100, 120);
        l4.setBounds(335,10,80,50);
        
        p1.setBackground(Color.darkGray);
        
        l1.setFont(new Font("Arial",Font.BOLD,60));
        l2.setFont(new Font("Arial",Font.BOLD,60));
        l3.setFont(new Font("Arial",Font.BOLD,100));
        l4.setFont(new Font("Arial",Font.BOLD,40));
        t1.setFont(new Font("Arial",Font.BOLD,60));
        
        
        l1.setForeground(Color.yellow);
        l2.setForeground(Color.yellow);
        l3.setForeground(Color.yellow);
        
        f7.add(p1);
        p1.add(t1);p1.add(l1);p1.add(l2);
        p1.add(l3);
        t1.add(l4);
    }
      
    
    
    
    
    JFrame f8;
    JScrollPane spp;
    String month,mater;
    JButton comp;
    public void complains()
    {
        
        f8=new JFrame();
        JPanel p1=new JPanel();
       
        JLabel l3=new JLabel("Complains");
        
        JTable t1;
            
            String x[] = {"Mater","Month"};
            String y[][] = new String[20][8];
            int i=0, j=0;
            
            try {
            
            conn c1  = new conn();
            String s1 = "select * from complain";
            ResultSet rs  = c1.s.executeQuery(s1);
            
            while(rs.next()){
                y[i][j++]=rs.getString("matere");
                y[i][j++]=rs.getString("month");
                y[i][j++]=rs.getString("complain");
                

                i++;
                j=0;
            }
            t1 = new JTable(y,x);
            t1.setFont(new Font("Arial",Font.BOLD,13));
            spp = new JScrollPane(t1);
            
            spp.setBounds(500,250,500,250);
            
            p1.add(spp);
            
            t1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                   
                   int i=t1.getSelectedRow();
                   
                   TableModel model=t1.getModel();
                   
                   
                   mater=(String) model.getValueAt(i, 0);
                   perr.setMater(Integer.parseInt(mater));
                   month=(String) model.getValueAt(i,1);
                   perr.setComplain(model.getValueAt(i,2).toString());
                   
                   
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
                
            }

            @Override
            public void mouseExited(MouseEvent me) {
                    
            }
            
        });
            
            }catch(Exception r){
                
            }
        
        
        f8.setTitle("Consumption");
        f8.setSize(1400,850);
        f8.setVisible(true);
        f8.setResizable(false);
        f8.setLocation(200,100);
        p1.setLayout(null);
        
        comp=new JButton("Complain Text");
        

        l3.setBounds(460, 50, 1100, 120);
        comp.setBounds(500, 550, 500, 80);
        
        p1.setBackground(Color.darkGray);
        
        l3.setFont(new Font("Arial",Font.BOLD,100));
        comp.setFont(new Font("Arial",Font.BOLD,50));
        comp.setBackground(Color.white);
        comp.setBorder(new LineBorder(Color.BLACK,3));
        comp.addActionListener(this);
        
        l3.setForeground(Color.yellow);
        f8.add(p1);
        
        p1.add(l3);
        p1.add(comp);
        
    }
    
    JFrame f9;
    
    public void cancel()
    {
        f9=new JFrame();
        JPanel p=new JPanel();
        JButton b1=new JButton("Cancel");
        JLabel l1=new JLabel("Cancel Consumption");
        
        f9.setTitle("cancel");
        f9.setVisible(true);
        f9.setSize(1400,850);
        f9.setResizable(false);
        f9.setLocation(200, 100);
        p.setLayout(null);
        p.setBackground(Color.DARK_GRAY);
        l1.setForeground(Color.yellow);
        b1.setFont(new Font("Arial",Font.BOLD,50)); 
        l1.setFont(new Font("Arial",Font.BOLD,100));
        b1.setBounds(590, 650, 210, 70);
        b1.setBackground(Color.white);
        b1.setBorder(new LineBorder(Color.BLACK,3));
        
        l1.setBounds(200, 50, 1050, 120);
        f9.add(p);
        p.add(b1);
        p.add(l1);
        
        
        String columns[] = {"Matar_Code","Name", "Adress", "region","Phone_Num"};    
        String data[][] = {                                     
            {"1","Mhamad", "GIze","ljk","6451503" },
            {"2","Ahmad", "cairo","yjh","8644551051" },
            {"10","Rawan", "lvkfv","lmkmk.l","12080502" }
                
        };
 
        DefaultTableModel model = new DefaultTableModel();       
        model.setDataVector(data, columns);          
        JTable table = new JTable(model);                       
        JScrollPane tableScroller= new JScrollPane(table);      
 
        tableScroller.setBounds(200, 300, 1000, 210);
        p.add(tableScroller);  
    }
    
    
    
    
    
    
    public void admin(){
        frame=new JFrame();
        ImageIcon image=new ImageIcon(getClass().getResource("b.jpg"));
        ImageIcon image1=new ImageIcon(getClass().getResource("totalcollect.png"));
        ImageIcon image2=new ImageIcon(getClass().getResource("view2.png"));
        ImageIcon image3=new ImageIcon(getClass().getResource("statistics.png"));
        ImageIcon image4=new ImageIcon(getClass().getResource("fdh.png"));
        ImageIcon image5=new ImageIcon(getClass().getResource("complain2.png"));
        ImageIcon image6=new ImageIcon(getClass().getResource("cancelled.png"));
        ImageIcon image7=new ImageIcon(getClass().getResource("edit2.png"));
        

        
        JLabel back=new JLabel(image);
        back.setLayout(null);
        
        JLabel total=new JLabel(image1);
        total.setBounds(100,150,180,180);
        total.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                   total_collected();
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
                if(me.getSource()==total){
                    total.setBounds(100,140,180,180);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==total){
                    total.setBounds(100,150,180,180);
                }    
            }
            
        });
        
        JLabel view=new JLabel(image2);
        view.setBounds(100,350,180,180);
        view.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                viewbills();
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
                    view.setBounds(100,340,180,180);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==view){
                    view.setBounds(100,350,180,180);
                }    
            }
            
        });
        
        JLabel statis=new JLabel(image3);
        statis.setBounds(100,550,180,180);
        statis.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                total_consumption();
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
                if(me.getSource()==statis){
                    statis.setBounds(100,540,180,180);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==statis){
                    statis.setBounds(100,550,180,180);
                }    
            }
            
        });
        
        JLabel edit=new JLabel(image4);
        edit.setBounds(300,150,180,180);
        edit.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                edit_customers();
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
                if(me.getSource()==edit){
                    edit.setBounds(300,140,180,180);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==edit){
                    edit.setBounds(300,150,180,180);
                }    
            }
            
        });
        
        JLabel complain=new JLabel(image5);
        complain.setBounds(300,350,180,180);
        complain.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                      complains();
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
                if(me.getSource()==complain){
                    complain.setBounds(300,340,180,180);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==complain){
                    complain.setBounds(300,350,180,180);
                }    
            }
            
        });
        
        JLabel cancelled=new JLabel(image6);
        cancelled.setBounds(300,550,180,180);
        cancelled.addMouseListener(new MouseListener(){
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
                if(me.getSource()==cancelled){
                    cancelled.setBounds(300,540,180,180);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==cancelled){
                    cancelled.setBounds(300,550,180,180);
                }    
            }
            
        });
        
        JLabel edit2=new JLabel(image7);
        edit2.setBounds(1300,670,220,220);
        edit2.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {

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
                if(me.getSource()==edit2){
                    edit2.setBounds(1300,660,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==edit2){
                    edit2.setBounds(1300,670,220,220);
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
        
        
        back.add(total);back.add(view);back.add(statis);back.add(edit);back.add(complain);back.add(cancelled);back.add(edit2);back.add(m);
        frame.add(back);
        frame.setSize(1500,900);
        frame.setTitle("Admin");
        frame.setResizable(false);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
    JButton up;
    JTextField nam,ema,pho;
    JComboBox reg;
    String a;
    public void ubdate(){
        JFrame frame=new JFrame();
        JPanel back=new JPanel();
        Font f=new Font("Arial",Font.BOLD,20);
        back.setBackground(Color.DARK_GRAY);
        back.setLayout(null);
        
        
         up=new JButton("Update");
        up.addActionListener(this);
        up.setBounds(120,400,140,50);
        up.setFont(f);
        up.setBackground(Color.WHITE);
        
        JLabel n=new JLabel("City :");
        n.setForeground(Color.CYAN);
        n.setFont(f);
        n.setBounds(20,40,100,40);
         nam=new JTextField();
        nam.setBounds(120,40,130,35);
        
        
        
        JLabel r=new JLabel("Region :");
        r.setForeground(Color.CYAN);
        r.setFont(f);
        r.setBounds(20,100,100,40);
         String[] arr={"Giza","Alex","Cairo","Helwan","October"};
         reg=new JComboBox(arr);
        reg.setBounds(120,100,130,35);
        
        JLabel e=new JLabel("Email :");
        e.setForeground(Color.CYAN);
        e.setFont(f);
        e.setBounds(20,160,100,40);
         ema=new JTextField();
        ema.setBounds(120,160,130,35);
        JLabel p=new JLabel("Phone :");
        p.setForeground(Color.CYAN);
        p.setFont(f);
        p.setBounds(20,220,100,40);
         pho=new JTextField();
        pho.setBounds(120,220,130,35);
        
         nam.setText(perr.getCity());
         a=reg.getSelectedItem().toString();
         ema.setText(perr.getEmail());
         pho.setText(q);
       
        back.add(up);back.add(n);back.add(r);back.add(e);back.add(p);back.add(nam);back.add(reg);back.add(ema);back.add(pho);
        frame.add(back);
        frame.setLocation(600,200);
        frame.setTitle("Update");
        frame.setSize(400,500);
        frame.setVisible(true);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==blg2)
        {
            edit_old_customers();
            //f2.setVisible(false);
        }
        if(ae.getSource()==blg1)
        {
            edit_new_customers();  
           // f2.setVisible(false);
        }
        if(ae.getSource()==b1){
          
            try{

                        conn c=new conn();

                       String q="insert into old(name,passward,email,phone,adress,city,region) values('"+perr.getName()+"','"+perr.getPassward()+"','"+perr.getEmail()+"','"+perr.getPhone()+"','"+perr.getAdress()+"','"+perr.getCity()+"','"+perr.getRegion()+"')";

                        c.s.executeUpdate(q);
                        
                        String a="delete from new where phone='"+perr.getPhone()+"'";
                        c.s.executeUpdate(a);
                        
                        JOptionPane.showMessageDialog(null,"Sucsess");
                        frame.setVisible(false);
                        
                    }   catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,ex);

                    }
        }
        if(ae.getSource()==b2){
            try {
                conn c=new conn();
                String a="delete from new where phone='"+perr.getPhone()+"'";
                c.s.executeUpdate(a);
                JOptionPane.showMessageDialog(null,"Sucsess");
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(ae.getSource()==bb1){
            try {
                conn c=new conn();
                String a="delete from old where phone='"+perr.getPhone()+"'";
                c.s.executeUpdate(a);
                JOptionPane.showMessageDialog(null,"Sucsess");
            } catch (SQLException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(ae.getSource()==bb2){
            ubdate();
        }
        if(ae.getSource()==up){
            
            perr.setCity(nam.getText());
            perr.setEmail(ema.getText());
            perr.setRegion(reg.getSelectedItem().toString());
            perr.setPhone(Integer.parseInt(pho.getText()));
            
            try {
                conn c=new conn();
                String x="update old set city='"+perr.getCity()+"',email='"+perr.getEmail()+"',phone='"+perr.getPhone()+"',region='"+perr.getRegion()+"' where mater='"+perr.getMater()+"'";
                c.s.executeUpdate(x);
               
                JOptionPane.showMessageDialog(null,nam.getText()+ema.getText()+a+pho.getText());
            } catch (Exception ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(ae.getSource()==comp){
            JFrame frame=new JFrame();
            JPanel panel=new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.WHITE);
            Font f=new Font("Arial",Font.BOLD,30);
            Font f2=new Font("Thoma",Font.BOLD,20);
            Font f3=new Font("Thoma",Font.ITALIC,20);
            
            JLabel l1=new JLabel("ELECTRICITY Billing System");
            l1.setBounds(20,-10,500,80);
            l1.setFont(f);
            JLabel l2=new JLabel("_________________________");
            l2.setBounds(20,0,500,80);
            l2.setFont(f);
            
            JLabel l3=new JLabel("Month:");
            l3.setBounds(15,40,150,80);
            l3.setFont(f2);
        
           JLabel l4=new JLabel("Mater Code :");
           l4.setBounds(15,60,150,80);
           l4.setFont(f2);
           
           JLabel mon=new JLabel(month);
            mon.setBounds(95,40,300,80);
           mon.setFont(f3);
            
           
          JLabel mat=new JLabel(mater);
          mat.setBounds(135,60,300,80);
          mat.setFont(f3);
          
          JLabel l5=new JLabel("Complain:");
            l5.setBounds(15,90,150,80);
            l5.setFont(f2);
            
           JLabel co=new JLabel(perr.getComplain());
            co.setBounds(15,110,600,100);
           co.setFont(f3); 
             
            frame.setSize(500, 350);
            frame.setLocation(600,300);
            
            frame.add(panel);
            
            
           
            panel.add(l1);panel.add(l2);panel.add(l3);panel.add(l4);panel.add(mon);panel.add(mat);panel.add(l5);panel.add(co);
            frame.setVisible(true);
        }
        
    }
    
    
}    
   
