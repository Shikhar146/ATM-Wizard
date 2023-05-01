package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
       JButton signin, signup, clear;
       JTextField cardTextField ;
       JPasswordField pinTextField;
    
        Login() //Constructor
        {
            setTitle("ATM");
            
            setLayout(null);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); 
            Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel label = new JLabel(i3); 
            label.setBounds(70, 10, 100, 100);
            add(label);  // To place any component on the frame we use add()
            
            JLabel lname = new JLabel("National Bank");
            lname.setFont(new Font("Osward" , Font.BOLD , 20));
            lname.setForeground(Color.red);
            lname.setBounds(60,110,200,40);
            add(lname);
            
            JLabel text = new JLabel("National Bank of India");
            text.setFont(new Font("Osward" , Font.BOLD , 35));
            text.setBounds(250,60,600,40);
            add(text);
            
            JLabel cardNo = new JLabel("Card No. :");
            cardNo.setFont(new Font("Raleway" , Font.BOLD , 24));
            cardNo.setBounds(120,180,150,40);
            add(cardNo);
            
            cardTextField = new JTextField();
            cardTextField.setBounds(300 , 185, 250 ,30);
            cardTextField.setFont(new Font("Arial" , Font.BOLD , 14));
            add(cardTextField);
            
            JLabel pin = new JLabel("PIN :");
            pin.setFont(new Font("Raleway" , Font.BOLD , 24));
            pin.setBounds(120,240,150,40);
            add(pin);
            
            pinTextField = new JPasswordField();
            pinTextField.setBounds(300 , 245, 250 ,30);
            pinTextField.setFont(new Font("Arial" , Font.BOLD , 14));
            add(pinTextField);
            
            signin = new JButton("SIGN IN");
            signin.setBounds(300, 310, 100, 30);
            signin.setBackground(Color.GRAY);
            signin.setForeground(Color.BLACK);
            signin.addActionListener(this);
            add(signin);
            
            clear = new JButton("CLEAR");
            clear.setBounds(450, 310, 100, 30);
            clear.setBackground(Color.GRAY);
            clear.setForeground(Color.BLACK);
            clear.addActionListener(this);
            add(clear);
            
            signup = new JButton("SIGN UP");
            signup.setBounds(300, 370, 250, 30);
            signup.setBackground(Color.GRAY);
            signup.setForeground(Color.BLACK);
            signup.addActionListener(this);
            add(signup);
            
            getContentPane().setBackground(Color.WHITE);
            
            setSize(800 , 480); //setSize function defines the dimension of the frame
            setVisible(true);
            setLocation(350 , 200);
        }
        
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource() == clear)
            {
                cardTextField.setText("");
                pinTextField.setText("");
            }
            else if(ae.getSource() == signin)
            {
                Conn conn = new Conn();
                String cardnumber = cardTextField.getText();
                String pinnumber = pinTextField.getText();
                String query  = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
                //String query = "select * from login where cardnumber = '"+cardnumber+"' and pinnumber = '"+pinnumber+"'";
                
                try
                {
                    ResultSet rs = conn.s.executeQuery(query);
                    if(rs.next())
                    {
                        setVisible(false);
                        new Transactions(pinnumber).setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
            else if(ae.getSource() == signup)
            {
                setVisible(false);
                new SignupOne().setVisible(true);
            }
            
        }
        
        public static void main(String args[])
        {
            new Login();
        }
}

