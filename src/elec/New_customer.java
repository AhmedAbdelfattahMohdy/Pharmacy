
package elec;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;


/**
 *
 * @author m
 */
public class New_customer extends person {
    
    person per=new person();

    public New_customer() {
    }

    public New_customer(String name, String adress, String region, String email, int phone, String city) {
        super(name, adress, region, email, phone, city);
    }


    
    
    

    
    
    JPanel p1,p2,p3,p4,p5,p6,p7;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t3,t4,t5,t7;
    JComboBox r; 
    
    public void show_new(){
        JFrame frame=new JFrame();
        JPanel back=new JPanel();
        Font f=new Font("Arial",Font.BOLD,17);
        
        p1=new JPanel();
        p1.setLayout(null);
         t1=new JTextField();
        t1.setBorder(new LineBorder(Color.BLACK, 3));
        t1.setBounds(120,0,150,40);
        t1.setFont(f);
         l1=new JLabel("Name:");
        l1.setBounds(30,0,250,40);
        l1.setFont(f);
        l1.setForeground(Color.CYAN);
        p1.add(l1);
        p1.add(t1);
        p1.setBackground(Color.DARK_GRAY);
        
        
         p2=new JPanel();
        JPasswordField pass=new JPasswordField();
        pass.setBounds(120,0,150,40);
        pass.setBorder(new LineBorder(Color.BLACK, 3));
        pass.setFont(f);
         l2=new JLabel("Password:");
        l2.setFont(f);
        l2.setBounds(30,0,250,40);
        l2.setForeground(Color.CYAN);
        p2.add(l2);p2.add(pass);
        p2.setLayout(null);
        p2.setBackground(Color.darkGray);       
        
        
        p3=new JPanel();
        p3.setLayout(null);
         t3=new JTextField();
        t3.setBorder(new LineBorder(Color.BLACK, 3));
        t3.setFont(f);
        t3.setBounds(120,0,150,40);
         l3=new JLabel("Email:");
        l3.setBounds(30,0,250,40);
        l3.setFont(f);
        l3.setForeground(Color.CYAN);
        p3.add(l3);
        p3.add(t3);
        p3.setBackground(Color.DARK_GRAY);
        
        
         p4=new JPanel();
        p4.setLayout(null);
         t4=new JTextField();
        t4.setBorder(new LineBorder(Color.BLACK, 3));
        t4.setFont(f);
        t4.setBounds(120,0,150,40);
         l4=new JLabel("Phone:");
        l4.setBounds(30,0,250,40);
        l4.setFont(f);
        l4.setForeground(Color.CYAN);
        p4.add(l4);
        p4.add(t4);
        p4.setBackground(Color.DARK_GRAY);
        
        
         p5=new JPanel();
        p5.setLayout(null);
         t5=new JTextField();
        t5.setBorder(new LineBorder(Color.BLACK, 3));
        t5.setFont(f);
        t5.setBounds(120,0,150,40);
         l5=new JLabel("Adress:");
        l5.setBounds(30,0,250,40);
        l5.setFont(f);
        l5.setForeground(Color.CYAN);
        p5.add(l5);
        p5.add(t5);
        p5.setBackground(Color.DARK_GRAY);
        
        
         p6=new JPanel();
        p6.setLayout(null);
        String[] arr={"Giza","Alex","Cairo","Helwan","October"};
         r=new JComboBox(arr);
        r.setBorder(new LineBorder(Color.BLACK, 3));
        r.setBounds(120,0,120,40);
        r.setFont(f);
         l6=new JLabel("Region:");
        l6.setBounds(30,0,250,40);
        l6.setFont(f);
        l6.setForeground(Color.CYAN);
        p6.add(l6);p6.add(r);
        p6.setBackground(Color.DARK_GRAY);
        
        p7=new JPanel();
        p7.setLayout(null);
         t7=new JTextField();
        t7.setBorder(new LineBorder(Color.BLACK, 3));
        t7.setBounds(120,0,150,40);
        t7.setFont(f);
         l7=new JLabel("City:");
        l7.setBounds(30,0,250,40);
        l7.setFont(f);
        l7.setForeground(Color.CYAN);
        p7.add(l7);
        p7.add(t7);
        p7.setBackground(Color.DARK_GRAY);
        
        
        back.setBackground(Color.darkGray);
        
        frame.setTitle("New Customer");
        frame.setSize(460,600);
        frame.setResizable(false);
        frame.setLocation(700, 100);
        

        
        back.setLayout(null);
        p1.setBounds(70,50,300,40);
        p2.setBounds(70,100,300,40);
        p3.setBounds(70,150,300,40);
        p4.setBounds(70,200,300,40);
        p5.setBounds(70,250,300,40);
        p7.setBounds(70,300,300,40);
        p6.setBounds(70,350,300,40);
        
        
        JButton signup=new JButton("SignUp");
        signup.setFont(f);
        signup.setBackground(Color.WHITE);signup.setForeground(Color.BLACK);
        signup.setBounds(160,450,130,40);
        signup.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 3));
        signup.setBorderPainted(true);
        
        signup.addActionListener((ActionEvent e) -> {
            if(e.getSource()==signup){
                per.setName(t1.getText());
                per.setPassward(pass.getText());
                String s=t4.getText();
                per.setAdress(t5.getText());
                per.setRegion(r.getSelectedItem().toString());
                per.setEmail(t3.getText());
                per.setCity(t7.getText());
                
                if("".equals(per.getName())||"".equals(per.getPassward())||"".equals(s)||"".equals(per.getAdress())||"".equals(per.getEmail())||"".equals(per.getCity())){
                    JOptionPane.showMessageDialog(null,"error >> the fields is'not completed !!");
                }
                
                else{
                        per.setPhone(Integer.parseInt(s));
                        String q="insert into new(name,passward,email,phone,adress,city,region) values('"+per.getName()+"','"+per.getPassward()+"','"+per.getEmail()+"','"+per.getPhone()+"','"+per.getAdress()+"','"+per.getCity()+"','"+per.getRegion()+"')";

                    
                    try{
                        
                        conn c=new conn();
                        c.s.executeUpdate(q);
                        
                        JOptionPane.showMessageDialog(null,"Sucsess");
                        frame.setVisible(false);
                        submit();
                    }   catch (Exception ex) {
                        JOptionPane.showMessageDialog(null,ex);

                    }
                    
                    t1.setText(""); t3.setText("");t4.setText("");t5.setText("");t7.setText("");pass.setText("");

                }
            }
        });
        
        
        back.add(p1);back.add(p2);back.add(p3);back.add(p4);back.add(p5);back.add(p6);back.add(p7);back.add(signup);

        frame.add(back);
        JDialog d=new JDialog(frame);
        d.setModal(false);
        d.setVisible(true);
        frame.setVisible(true);
                
    } 
    
    public void submit(){
        JFrame contract=new JFrame();
        JPanel back=new JPanel();
        JButton print=new JButton("Print");
        Font f=new Font("Arial",Font.BOLD,30);
        Font f2=new Font("Thoma",Font.BOLD,20);
        Font f3=new Font("Thoma",Font.ITALIC,20);
        back.setBackground(Color.WHITE);
        back.setLayout(null);
        
        JMenuBar m=new JMenuBar();
        m.setBounds(0, 0,500,30);
        
        JMenu help=new JMenu("Help");
        JMenu file=new JMenu("Tool");
        JMenu tool=new JMenu("File");
        m.add(help);m.add(tool); m.add(file);
        
        JMenuItem calc=new JMenuItem("calc");
        JMenuItem bill=new JMenuItem("bill");
        help.add(calc);help.add(bill);
        
        
        
        
        JLabel l1=new JLabel("ELECTRICITY Billing System");
        l1.setBounds(20,15,500,80);
        l1.setFont(f);
        JLabel l2=new JLabel("_________________________");
        l2.setBounds(20,30,500,80);
        l2.setFont(f);
        
        JLabel l3=new JLabel("NAME :");
        l3.setBounds(15,80,150,80);
        l3.setFont(f2);
        
        JLabel l4=new JLabel("ADDRESS :");
        l4.setBounds(15,120,150,80);
        l4.setFont(f2);
        
        
        JLabel l5=new JLabel("CITY :");
        l5.setBounds(15,160,150,80);
        l5.setFont(f2);
        
        JLabel l6=new JLabel("EMAIL :");
        l6.setBounds(15,200,150,80);
        l6.setFont(f2);
        
        JLabel l7=new JLabel("PHONE Number :");
        l7.setBounds(15,240,170,80);
        l7.setFont(f2);
        
        JLabel l8=new JLabel("Mater Type :");
        l8.setBounds(15,280,150,80);
        l8.setFont(f2);
        
        JLabel sg=new JLabel("your Signature :");
        sg.setBounds(15,320,190,80);
        sg.setFont(f2);
        
        
        JLabel name=new JLabel(per.getName());
        name.setBounds(98,80,300,80);
        name.setFont(f3);
        
        JLabel adress=new JLabel(per.getAdress());
        adress.setBounds(134,120,300,80);
        adress.setFont(f3);
        
        JLabel city=new JLabel(per.getCity());
        city.setBounds(90,160,200,80);
        city.setFont(f3);
        
        
        JLabel phone=new JLabel(Integer.toString(per.getPhone()));
        phone.setBounds(181,240,200,80);
        phone.setFont(f3);
        
        JLabel email=new JLabel(per.getEmail());
        email.setBounds(99,200,200,80);
        email.setFont(f3);
        
        JLabel mater=new JLabel("electronic");
        mater.setBounds(147,280,200,80);
        mater.setFont(f3);

        ImageIcon image=new ImageIcon(getClass().getResource("img_29364.PNG"));        
        
        JLabel img=new JLabel(image);
        img.setBounds(5,375,200,180);
        

        print.setBounds(300,450,100,50);
        print.setBackground(Color.WHITE);
        print.setBorder(new LineBorder(Color.BLACK, 3,true));
        print.setFont(f2);
        contract.setTitle("Contract");
        contract.setResizable(false);
        contract.setSize(500,600);
        contract.setLocation(700,100);
        back.add(l1);back.add(l2);back.add(l3);back.add(l4);back.add(l5);back.add(l6);back.add(l7);back.add(l8);back.add(sg);back.add(print);
        back.add(name);back.add(adress);back.add(city);back.add(phone);back.add(email);back.add(mater);back.add(m);back.add(img);


        contract.add(back);
        contract.setVisible(true);
    }
    
    public void Sign_Up(){
        
    }  
    

}
