package bank.management.system;
import javax.swing.*;
import java.awt.*;  //Images 
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener
{
    JButton deposit , withdrawl , ministatement , pinchange , fastcash , balanceenquiry , exit;
    String pinnumber;
    
    Transactions(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction Below");
        text.setBounds(195, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD , 16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(160,415,145,30);
        deposit.setFont(new Font("Raleway", Font.BOLD , 13));
        deposit.addActionListener(this);
        image.add(deposit);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(160,450,145,30);
        fastcash.setFont(new Font("Raleway", Font.BOLD , 13));
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        pinchange = new JButton("PIN Change");
        pinchange.setBounds(160,485,145,30);
        pinchange.setFont(new Font("Raleway", Font.BOLD , 13));
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        withdrawl = new JButton("Cash Withdraw");
        withdrawl.setBounds(365,415,145,30);
        withdrawl.setFont(new Font("Raleway", Font.BOLD , 13));
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(365,450,145,30);
        ministatement.addActionListener(this);
        ministatement.setFont(new Font("Raleway", Font.BOLD , 13));
        image.add(ministatement);
        
        balanceenquiry = new JButton("Balance Enquiry");
        balanceenquiry.setBounds(365,485,145,30);
        balanceenquiry.setFont(new Font("Raleway", Font.BOLD , 13));
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(430,520,80,25);
        exit.setFont(new Font("Raleway", Font.BOLD , 12));
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900 , 900);
        setLocation(300, 0);
        //setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == exit)
        {
            System.exit(0);
        }
        else if(ae.getSource() == deposit)
        {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == withdrawl)
        {
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == fastcash)
        {
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == pinchange)
        {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == balanceenquiry)
        {
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == ministatement)
        {
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new Transactions("");
        
    }
}
