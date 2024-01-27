package elec;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class oldcustomer   implements ActionListener{
     
String s;
int x ;
int mater_code ;
JFrame  frame,fram,pframe,framec;
JPanel p,panel,ppanel;
JTextField t,read,pt1,pt2;
JButton b1,b2,pcalc,hb1,hb2,hb3,bc,b;
JLabel l1,label,plabel1,plabel2,plabel3;
JTextArea txa;
JComboBox comboBox;
public void Pay_bill()
{
    pframe = new JFrame();
    pframe.setLocation(600,300);
    pframe.setSize(500,350);
    Font newfont = new Font("Arial", Font.BOLD,20);
    Font f1=new Font("Tahoma",Font.BOLD,40);
    
    ppanel = new JPanel();
    ppanel.setLayout(null);
    ppanel.setBackground(Color.DARK_GRAY);
    
    plabel1 = new JLabel("Mater Code :");
    plabel1.setBounds(10, 100, 300, 35);
    plabel1.setFont(newfont);
    plabel1.setForeground(Color.CYAN);
    
    
    plabel2 = new JLabel("Visa Number :");
    plabel2.setFont(newfont);
    plabel2.setBounds(10, 160, 300, 35);
    plabel2.setForeground(Color.CYAN);
    
    
    plabel3 = new JLabel("PAY BIIL");
    plabel3.setBounds(150,10,200,50);
    plabel3.setForeground(Color.yellow);
    plabel3.setFont(f1);
    
    pt1 = new JTextField();
    pt1.setBounds(150, 100,180,40);
    pt1.setFont(newfont);
    pt1.setBorder(new LineBorder(Color.BLACK,3));
    
    pt2 = new JTextField();
    pt2.setFont(newfont);
    pt2.setBounds(150,160,180,40);
    pt2.setBorder(new LineBorder(Color.BLACK,3));
    
    b= new JButton("pay");
    b.setBounds(200,220,100,60);
    b.setBackground(Color.WHITE);
    b.setFont(newfont);
    b.setBorder(new LineBorder(Color.BLACK,3));
    b.addActionListener(this);
    
    String[] items = { "January", "February", "March", "April" , "May" , "June", "July", "August" ,"September", "October", "November", "	December" };
        JComboBox comboBox = new JComboBox( items );  
        comboBox.setBounds(350,102,130,35);
        comboBox.setFont(newfont);
        comboBox.setForeground(Color.BLACK);   
        comboBox.setBackground(Color.WHITE); 
        ppanel.add(comboBox);ppanel.add(plabel1);ppanel.add(plabel2);ppanel.add(plabel3);ppanel.add(pt1);ppanel.add(pt2);ppanel.add(b);
        
           
        pframe.add(ppanel);
        pframe.setVisible(true);
        pframe.setTitle("Pay Bill");
        pframe.setResizable(false);
        
}

public void calculate_and_read()
{

     fram = new JFrame();
     Font f=new Font("Arial",Font.BOLD,20);
     Font f1=new Font("Tahoma",Font.BOLD,40);
     panel =new JPanel();
     panel.setBackground(Color.DARK_GRAY);
     panel.setLayout(null);
     
     
     JLabel l=new JLabel("Reading");
     l.setBounds(160,10,200,50);
     l.setForeground(Color.yellow);
     l.setFont(f1);
     
     
    label = new JLabel("Enter Your Read :");
    label.setBounds(10,109,200,20);
    label.setForeground(Color.CYAN);
    label.setFont(f);

    read = new JTextField();
    read.setFont(f);
    read.setBounds(200,100,180,40);
    read.setBorder(new LineBorder(Color.BLACK,3));
    
    pcalc = new JButton("Calculat");
    pcalc.setBounds(200,220,120,60);
    pcalc.setBackground(Color.WHITE);
    pcalc.setFont(f);
    pcalc.setBorder(new LineBorder(Color.BLACK,3));
    pcalc.addActionListener(this);
    
    
    panel.add(read);panel.add(pcalc);panel.add(label);panel.add(l);
    
    fram.add(panel);
    fram.setSize(500,350);
    fram.setTitle("Reading");
    fram.setVisible(true);
    fram.setResizable(false);
    fram.setLocation(600,300);
    
    
}

public void complain(){
    framec=new JFrame();
    JPanel back=new JPanel();
    Font f=new Font("Arial",Font.BOLD,20);
    Font f1=new Font("Tahoma",Font.BOLD,40);
    back.setBackground(Color.DARK_GRAY);
    back.setLayout(null);
    
    
    JLabel l=new JLabel("Complain");
     l.setBounds(150,10,200,50);
     l.setForeground(Color.yellow);
     l.setFont(f1);
    
     label = new JLabel("Mater Code:");
    label.setBounds(10,109,200,20);
    label.setForeground(Color.CYAN);
    label.setFont(f);

    read = new JTextField();
    read.setFont(f);
    read.setBounds(140,100,180,40);
    read.setBorder(new LineBorder(Color.BLACK,3));
     
    
    
     
    String[] items = { "January", "February", "March", "April" , "May" , "June", "July", "August" ,"September", "October", "November", "	December" };
        comboBox = new JComboBox( items );  
        comboBox.setBounds(350,102,130,35);
        comboBox.setFont(f);
        comboBox.setForeground(Color.BLACK);   
        comboBox.setBackground(Color.WHITE);
        
    l1= new JLabel("Enter Your Complain:");
    l1.setBounds(70,155,250,20);
    l1.setForeground(Color.CYAN);
    l1.setFont(f);    
    
    txa = new JTextArea();
    txa.setBounds(70,180,300,200);
    txa.setBorder(new LineBorder(Color.BLACK,3));
    txa.setFont(f);
    
    
    bc = new JButton("Send");
    bc.addActionListener(this);
    bc.setBounds(200,400,100,60);
    bc.setBackground(Color.WHITE);
    bc.setBorder(new LineBorder(Color.BLACK,3));
    bc.addActionListener(this);
    bc.setFont(f);
    
    
    
    back.add(txa);back.add(l);back.add(comboBox);back.add(label);back.add(read);back.add(l1);back.add(bc);
    framec.add(back);
    framec.setSize(500,500);
    framec.setTitle("Reading");
    framec.setVisible(true);
    framec.setResizable(false);
    framec.setLocation(600,300);

}
    String month,w;
    person pers=new person();

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            frame.setVisible(true);
        }

        if(ae.getSource()==pcalc){
            
            s = read.getText();
            read.setText("");
            x=0;
            x = Integer.parseInt(s);
            JOptionPane.showMessageDialog(null, "you should pay  " + x*.3 + " EG", "Plain Message", JOptionPane.PLAIN_MESSAGE);
        }
        if(ae.getSource()== bc){
            
            month= comboBox.getSelectedItem().toString();
            w=read.getText();
            pers.setMater(Integer.parseInt(w));
            pers.setComplain(txa.getText());
            
            String q="insert into complain (matere,month,complain) values('"+pers.getMater()+"','"+month+"','"+pers.getComplain()+"')";
            
            try{
            conn c2=new conn();
            c2.s.executeUpdate(q);
             JOptionPane.showMessageDialog(null,"Sucsess");
            }catch(Exception s){
                 JOptionPane.showMessageDialog(null,s);
            }
            
           // framec.setVisible(false);
        }
//        if(ae.getSource()== b){
//            JOptionPane.showMessageDialog(null, "sucsseccfully operation", "Plain Message", JOptionPane.PLAIN_MESSAGE);
//            pframe.setVisible(false);
//        }
 
 
    }
    
    
    JButton up;
    JTextField nam,ema,pho,na,pa;
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
        up.setBounds(130,400,130,40);
        up.setFont(f);
        up.setBackground(Color.WHITE);
        
        JLabel n=new JLabel("name:");
        n.setForeground(Color.CYAN);
        n.setFont(f);
        n.setBounds(20,40,100,40);
         nam=new JTextField();
        nam.setBounds(140,40,130,35);
        
        
        
        JLabel r=new JLabel("passward :");
        r.setForeground(Color.CYAN);
        r.setFont(f);
        r.setBounds(20,100,110,40);
          pa=new JTextField();
        pa.setBounds(140,100,130,35);
         
        
        JLabel e=new JLabel("Email :");
        e.setForeground(Color.CYAN);
        e.setFont(f);
        e.setBounds(20,160,100,40);
         ema=new JTextField();
        ema.setBounds(140,160,130,35);
        
        JLabel p=new JLabel("Phone :");
        p.setForeground(Color.CYAN);
        p.setFont(f);
        p.setBounds(20,220,100,40);
        
         pho=new JTextField();
        pho.setBounds(140,220,130,35);
         
        JLabel pe=new JLabel("City :");
        pe.setForeground(Color.CYAN);
        pe.setFont(f);
        pe.setBounds(20,280,100,40);
        
         na=new JTextField();
        na.setBounds(140,280,130,35);
        
          JLabel pee=new JLabel("Region  :");
        pee.setForeground(Color.CYAN);
        pee.setFont(f);
        pee.setBounds(20,340,110,40);
        String[] arr={"Giza","Alex","Cairo","Helwan","October"};
         reg=new JComboBox(arr);
        reg.setBounds(140,340,130,35);
       
        
        
        
         nam.setText(pers.getCity());
         a=reg.getSelectedItem().toString();
         ema.setText(pers.getEmail());
//         pho.setText();
       
        back.add(up);back.add(n);back.add(r);back.add(e);back.add(p);back.add(nam);back.add(reg);back.add(ema);back.add(pho);
        back.add(pe);back.add(na);back.add(pee);back.add(pa);
        frame.add(back);
        frame.setLocation(600,200);
        frame.setTitle("Update");
        frame.setSize(400,500);
        frame.setVisible(true);
        
    }
    
    
    
    //-----------------------------------
    
    
    public void OldCustomer(){
        
         frame=new JFrame();
        ImageIcon image=new ImageIcon(getClass().getResource("a.jpg"));
        ImageIcon image1=new ImageIcon(getClass().getResource("pay.png"));
        ImageIcon image2=new ImageIcon(getClass().getResource("complain.png"));
        ImageIcon image3=new ImageIcon(getClass().getResource("reading.png"));
        ImageIcon image4=new ImageIcon(getClass().getResource("edit.png"));

        
        JLabel back=new JLabel(image);
        back.setLayout(null);
        
        JLabel pay=new JLabel(image1);
        pay.setBounds(300,350,220,220);
        pay.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 //pframe.setVisible(true);
                 Pay_bill();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(me.getSource()==pay){
                    pay.setBounds(300,340,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==pay){
                    pay.setBounds(300,350,220,220);
                }    
            }

            
        });
        
        JLabel complain=new JLabel(image2);
        complain.setBounds(600,350,220,220);
        complain.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 complain();
            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(me.getSource()==complain){
                    complain.setBounds(600,340,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==complain){
                    complain.setBounds(600,350,220,220);
                }    
            }
            
        });
        
        JLabel reading=new JLabel(image3);
        reading.setBounds(900,350,220,220);
        reading.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                calculate_and_read();
            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(me.getSource()==reading){
                    reading.setBounds(900,340,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==reading){
                    reading.setBounds(900,350,220,220);
                }    
            }
            
        });
        

        JLabel edit=new JLabel(image4);
        edit.setBounds(1300,670,220,220);
        edit.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                 ubdate();
            }

            @Override
            public void mousePressed(MouseEvent me) {

            }

            @Override
            public void mouseReleased(MouseEvent me) {

            }

            @Override
            public void mouseEntered(MouseEvent me) {
                if(me.getSource()==edit){
                    edit.setBounds(1300,660,220,220);
                }
            }

            @Override
            public void mouseExited(MouseEvent me) {
                if(me.getSource()==edit){
                    edit.setBounds(1300,670,220,220);
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
        
        back.add(pay);back.add(complain);back.add(reading);back.add(pay);back.add(edit);back.add(m);
        frame.add(back);
        frame.setSize(1500,900);
        frame.setTitle("old customer");
        frame.setResizable(false);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
