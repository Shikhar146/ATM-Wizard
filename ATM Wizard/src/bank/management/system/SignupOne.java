package bank.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener
{
    long random;
    JTextField nameTextField , fnameTextField , emailTextField , addressTextField , cityTextField , stateTextField , pinTextField;
    JButton next;
    JRadioButton male , female , others , married , unmarried;
    JDateChooser dateChooser;
    
    SignupOne()
    {
        setLayout(null);
        
        Random ran = new Random();
        random = (Math.abs((ran.nextLong() % 9000L) + 1000L));
        
        JLabel formno = new JLabel("Application Form No. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD , 38));
        formno.setBounds(170 , 20 , 600 , 40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1 : Personal Details.");
        personalDetails.setFont(new Font("Raleway", Font.BOLD , 24));
        personalDetails.setBounds(260 , 80 , 600 , 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD , 20));
        name.setBounds(90 , 150 , 100 , 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        nameTextField.setBounds(350, 150, 400, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway", Font.BOLD , 20));
        fname.setBounds(90 , 200 , 200 , 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        fnameTextField.setBounds(350, 200, 400, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raleway", Font.BOLD , 20));
        dob.setBounds(90 , 250 , 200 , 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(350, 250, 400 , 30);
        dateChooser.setFont(new Font("Raleway" , Font.BOLD , 15));
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD , 20));
        gender.setBounds(90 , 300 , 200 , 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(350, 300, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 300, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        others = new JRadioButton("Others");
        others.setBounds(550, 300, 80, 30);
        others.setBackground(Color.WHITE);
        add(others);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);
        
        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raleway", Font.BOLD , 20));
        email.setBounds(90 , 350 , 200 , 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        emailTextField.setBounds(350, 350, 400, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway", Font.BOLD , 20));
        marital.setBounds(90 , 400 , 200 , 30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(350, 400, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 400, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup maaritalgroup = new ButtonGroup();
        maaritalgroup.add(married);
        maaritalgroup.add(unmarried);
        
        JLabel address = new JLabel("Parmanent Address :");
        address.setFont(new Font("Raleway", Font.BOLD , 20));
        address.setBounds(90 , 450 , 200 , 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        addressTextField.setBounds(350, 450, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("Enter City :");
        city.setFont(new Font("Raleway", Font.BOLD , 20));
        city.setBounds(90 ,500 , 200 , 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        cityTextField.setBounds(350, 500, 400, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("Enter State :");
        state.setFont(new Font("Raleway", Font.BOLD , 20));
        state.setBounds(90 ,550 , 200 , 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        stateTextField.setBounds(350, 550, 400, 30);
        add(stateTextField);
        
        JLabel pin = new JLabel("Pin Code :");
        pin.setFont(new Font("Raleway", Font.BOLD , 20));
        pin.setBounds(90 ,600 , 200 , 30);
        add(pin);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        pinTextField.setBounds(350, 600, 400, 30);
        add(pinTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.GRAY);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD , 14));
        next.setBounds(650, 670, 100, 30);
        next.addActionListener(this);
        add(next);
                
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850 , 800);
        setLocation(350 , 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
        {
            String formno = "" + random; // random is a long value (NOTE : If we concate any long value with "" then it will be converted to as string)
            String name = nameTextField.getText();
            String fname = fnameTextField.getText();
            String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if(male.isSelected())
            {
                gender = "Male";
            }
            else if(female.isSelected())
            {
                gender = "Female";
            }
            else if(others.isSelected())
            {
                gender = "Others";
            }
            
            String email = emailTextField.getText();
            String marital = null;
            if(married.isSelected())
            {
                marital = "Married";
            }
            else if(unmarried.isSelected())
            {
                marital = "Unmarried";
            }
            
            String address = addressTextField.getText();
            String city = cityTextField.getText();
            String state = stateTextField.getText();
            String pin = pinTextField.getText();
            
            try
            {
                if(name.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Name is required");
                }
                else
                {
                    Conn c = new Conn();
                    //"String"+variable+"String" = 'String'"+variable+"'String'
                    
                    String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                    c.s.executeUpdate(query); // execute the SQL statement
                    
                    setVisible(false);
                    new SignupTwo(formno).setVisible(true);
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    
    public static void main(String args[])
    {
        new SignupOne();
    }
}
