package bank.management.system;
import javax.swing.*;
import java.awt.*;  //Images 
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener
{
    JButton cash100 , cash2000 , cash5000 , cash1000 , cash500 , cash10000 , back;
    String pinnumber;
    
    FastCash(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(215, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD , 16));
        image.add(text);
        
        cash100 = new JButton("Rs. 100");
        cash100.setBounds(160,415,145,30);
        cash100.setFont(new Font("Raleway", Font.BOLD , 13));
        cash100.addActionListener(this);
        image.add(cash100);
        
        cash500 = new JButton("Rs. 500");
        cash500.setBounds(160,450,145,30);
        cash500.setFont(new Font("Raleway", Font.BOLD , 13));
        cash500.addActionListener(this);
        image.add(cash500);
        
        cash1000 = new JButton("Rs. 1000");
        cash1000.setBounds(160,485,145,30);
        cash1000.setFont(new Font("Raleway", Font.BOLD , 13));
        cash1000.addActionListener(this);
        image.add(cash1000);
        
        cash2000 = new JButton("Rs. 2000");
        cash2000.setBounds(365,415,145,30);
        cash2000.setFont(new Font("Raleway", Font.BOLD , 13));
        cash2000.addActionListener(this);
        image.add(cash2000);
        
        cash5000 = new JButton("Rs. 5000");
        cash5000.setBounds(365,450,145,30);
        cash5000.addActionListener(this);
        cash5000.setFont(new Font("Raleway", Font.BOLD , 13));
        image.add(cash5000);
        
        cash10000 = new JButton("Rs. 10000");
        cash10000.setBounds(365,485,145,30);
        cash10000.setFont(new Font("Raleway", Font.BOLD , 13));
        cash10000.addActionListener(this);
        image.add(cash10000);
        
        back = new JButton("Back");
        back.setBounds(430,520,80,25);
        back.setFont(new Font("Raleway", Font.BOLD , 12));
        back.addActionListener(this);
        image.add(back);
        
        setSize(900 , 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == back)
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else 
        {
            String amount = ((JButton)ae.getSource()).getText().substring(4);
            Conn c = new Conn();
            
            try
            {
                ResultSet rs = c.s.executeQuery("select * from bank where pin  = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next())
                {
                    if(rs.getString("type").equals("Deposit"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(ae.getSource() != back && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount+" Debited Successfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
    }
    
    public static void main(String args[])
    {
        new FastCash("");
        
    }
}
