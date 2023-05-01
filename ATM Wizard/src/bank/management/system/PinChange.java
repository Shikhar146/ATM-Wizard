package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener
{
    JPasswordField pin , repin;
    JButton change , back;
    String pinnumber;
    
    PinChange(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setLayout(null);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(250, 285, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.BOLD , 18));
        image.add(text);
       
        JLabel pintext = new JLabel("New PIN");
        pintext.setBounds(165,330, 180, 35);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Raleway", Font.BOLD , 16));
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setBounds(330, 330, 180, 25);
        pin.setForeground(Color.BLACK);
        pin.setFont(new Font("Raleway", Font.BOLD , 20));
        image.add(pin);
        
        JLabel repintext = new JLabel("Re-Enter New PIN");
        repintext.setBounds(165, 370, 180, 35);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("Raleway", Font.BOLD , 16));
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setBounds(330, 370, 180, 25);
        repin.setForeground(Color.BLACK);
        repin.setFont(new Font("Raleway", Font.BOLD , 20));
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.setFont(new Font("Raleway", Font.BOLD , 16));
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.setFont(new Font("Raleway", Font.BOLD , 16));
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900 , 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == change)
        {
            try
        {
            String npin = pin.getText();
            String rpin = repin.getText();
            
            if(!npin.equals(rpin))
            {
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if(npin.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please enter new PIN");
                return;
            }
            if(rpin.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Re-Enter new PIN");
                return;
            }
            
            Conn conn = new Conn();
            String query1 = "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"' ";
            String query2 = "update login set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"' ";
            String query3 = "update signupthree set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"' "; 
            
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "PIN changed successfully");
                
            setVisible(false);
            new Transactions(rpin).setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
        else
        {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String rags[])
    {
        new PinChange("").setVisible(true);
    }
}
