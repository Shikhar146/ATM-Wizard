package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener
{
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit , cancel;
    String formno;
    
    SignupThree(String formno)
    {
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3 : Account Details"); 
        l1.setFont(new Font("Raleway" , Font.BOLD , 24));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type :"); 
        type.setFont(new Font("Raleway" , Font.BOLD , 20));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway" , Font.BOLD , 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(320,140,150,30);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway" , Font.BOLD , 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(510,140,200,30);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway" , Font.BOLD , 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(320,190,150,30);
        add(r3);
       
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway" , Font.BOLD , 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(510,190,230,30);
        add(r4);
        
        JLabel card = new JLabel("Card Number :"); 
        card.setFont(new Font("Raleway" , Font.BOLD , 20));
        card.setBounds(100, 270, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-1432"); 
        number.setFont(new Font("Raleway" , Font.BOLD , 20));
        number.setBounds(320,270, 300, 30);
        add(number);
        
        JLabel carddetail = new JLabel("(Your 16 Digit Card Number)"); 
        carddetail.setFont(new Font("Raleway" , Font.BOLD , 15));
        carddetail.setBounds(320,300, 300, 30);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN Number :"); 
        pin.setFont(new Font("Raleway" , Font.BOLD , 20));
        pin.setBounds(100, 340, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX"); 
        pnumber.setFont(new Font("Raleway" , Font.BOLD , 20));
        pnumber.setBounds(320,340, 300, 30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("(Your 4 Digit PIN Number)"); 
        pindetail.setFont(new Font("Raleway" , Font.BOLD , 15));
        pindetail.setBounds(320,370, 300, 30);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required :"); 
        services.setFont(new Font("Raleway" , Font.BOLD , 20));
        services.setBounds(100, 430, 200, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway" , Font.BOLD , 16));
        c1.setBounds(320, 430, 150, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway" , Font.BOLD , 16));
        c2.setBounds(470, 430,150, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway" , Font.BOLD , 16));
        c3.setBounds(660, 430, 150, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway" , Font.BOLD , 16));
        c4.setBounds(320, 480, 150, 30);
        add(c4);
        
        JLabel c4i = new JLabel("Alerts"); 
        c4i.setFont(new Font("Raleway" , Font.BOLD , 17));
        c4i.setBounds(340, 505, 150, 30);
        add(c4i);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway" , Font.BOLD , 16));
        c5.setBounds(470, 480,150, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway" , Font.BOLD , 16));
        c6.setBounds(660, 480, 150, 30);
        add(c6);
        
        c7 = new JCheckBox("\"I hereby declare that the above details are correct to the best of my knowledge.\"");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway" , Font.BOLD , 13));
        c7.setBounds(150, 570, 550, 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.GRAY);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Raleway", Font.BOLD , 14));
        submit.setBounds(490, 670, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.GRAY);
        cancel.setForeground(Color.BLACK);
        cancel.setFont(new Font("Raleway", Font.BOLD , 14));
        cancel.setBounds(650, 670, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == submit)
        {
            String accountType = null;
            if(r1.isSelected())
            {
                accountType = "Saving Account";
            }
            else if(r2.isSelected())
            {
                accountType = "Fixed Deposit Account";
            }
            else if(r3.isSelected())
            {
                accountType = "Current Account";
            }
            else if(r4.isSelected())
            {
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected())
            {
                facility = facility + " ATM CARD";
            }
            else if(c2.isSelected())
            {
                facility = facility + " Internet Banking";
            }
            else if(c3.isSelected())
            {
                facility = facility + " Mobile Banking";
            }
            else if(c4.isSelected())
            {
                facility = facility + " Email & SMS Alerts";
            }
            else if(c5.isSelected())
            {
                facility = facility + " Cheque Book";
            }
            else if(c6.isSelected())
            {
                facility = facility + " E-Statement";
            }
            
            try
            {
                if(accountType.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Account Type is required");
                }
                else
                {
                    Conn conn = new Conn();
                    //"String"+variable+"String" = 'String'"+variable+"'String'
                    
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    
                    conn.s.executeUpdate(query1); // execute the SQL statement
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number : " + cardnumber + "\n PIN : " + pinnumber);
                    
                    //SignupThree object
                    setVisible(false);
                    //new SignupThree(formno).setVisible(true);
                    new Deposit(pinnumber).setVisible(false);
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            
            
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String args[])
    {
        new SignupThree("");
    }
}
