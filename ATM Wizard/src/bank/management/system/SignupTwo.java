package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener
{
    JTextField panTextField , adhaarTextField;
    JButton next;
    JRadioButton syes , sno , eyes , eno;
    JComboBox religion , category , income ,education , occupation;
    String formno;
    
    SignupTwo(String formno)
    {
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details.");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD , 24));
        additionalDetails.setBounds(260 , 80 , 600 , 30);
        add(additionalDetails);
        
        JLabel rname = new JLabel("Religion :");
        rname.setFont(new Font("Raleway", Font.BOLD , 20));
        rname.setBounds(90 , 150 , 100 , 30);
        add(rname);
        
        String valReligion[] = {"", "Hindu", "Muslim", "Christian", "Sikh", "Buddhist", "Jain", "Other"};
        
        religion = new JComboBox(valReligion);
        religion.setBounds(350, 150, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel cname = new JLabel("Category :");
        cname.setFont(new Font("Raleway", Font.BOLD , 20));
        cname.setBounds(90 , 200 , 200 , 30);
        add(cname);
        
        String[] valCategory = {"","General", "OBC", "SC", "ST", "Other"};
        
        category = new JComboBox(valCategory);
        category.setBounds(350, 200, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel iname = new JLabel("Income :");
        iname.setFont(new Font("Raleway", Font.BOLD , 20));
        iname.setBounds(90 , 250 , 200 , 30);
        add(iname);
        
        String[] valIncome = {"","< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000", "NULL"};
        
        income = new JComboBox(valIncome);
        income.setBounds(350, 250, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel ename = new JLabel("Educational");
        ename.setFont(new Font("Raleway", Font.BOLD , 20));
        ename.setBounds(90 , 300 , 200 , 30);
        add(ename);
        
        JLabel qname = new JLabel("Qualification :");
        qname.setFont(new Font("Raleway", Font.BOLD , 20));
        qname.setBounds(90 , 325 , 200 , 30);
        add(qname);
        
        String[] valEducation = {"", "High School", "Intermediate", "Diploma", "Bachelor's Degree", "Master's Degree", "Ph.D."};
        
        education = new JComboBox(valEducation);
        education.setBounds(350, 325, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel oname = new JLabel("Occupation :");
        oname.setFont(new Font("Raleway", Font.BOLD , 20));
        oname.setBounds(90 , 400 , 200 , 30);
        add(oname);
        
        String[] valOccupation = {"" , "Doctor", "Engineer", "Lawyer", "Teacher", "Businessperson", "Artist", "Writer", "Homemaker", "Student", "Unemployed", "Other"};
        
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(350, 400, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        JLabel pan = new JLabel("PAN Number :");
        pan.setFont(new Font("Raleway", Font.BOLD , 20));
        pan.setBounds(90 , 450 , 200 , 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        panTextField.setBounds(350, 450, 400, 30);
        add(panTextField);
        
        JLabel adhaar = new JLabel("Adhaar Number :");
        adhaar.setFont(new Font("Raleway", Font.BOLD , 20));
        adhaar.setBounds(90 ,500 , 200 , 30);
        add(adhaar);
        
        adhaarTextField = new JTextField();
        adhaarTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        adhaarTextField.setBounds(350, 500, 400, 30);
        add(adhaarTextField);
        
        JLabel sname = new JLabel("Senior Citizen :");
        sname.setFont(new Font("Raleway", Font.BOLD , 20));
        sname.setBounds(90 ,550 , 200 , 30);
        add(sname);
        
        syes = new JRadioButton("YES");
        syes.setBounds(350, 550, 80, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("NO");
        sno.setBounds(550, 550, 80, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);
        
        JLabel eaccount = new JLabel("Existing Account :");
        eaccount.setFont(new Font("Raleway", Font.BOLD , 20));
        eaccount.setBounds(90 ,600 , 200 , 30);
        add(eaccount);
        
        eyes = new JRadioButton("YES");
        eyes.setBounds(350, 600, 80, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("NO");
        eno.setBounds(550, 600, 80, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);
        
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
            String rname = (String)religion.getSelectedItem();
            String cname = (String)category.getSelectedItem();
            String iname = (String)income.getSelectedItem();
            String qname = (String)education.getSelectedItem();
            String oname = (String)occupation.getSelectedItem();
            String sname = null;
            if(syes.isSelected())
            {
                sname = "YES";
            }
            else if(sno.isSelected())
            {
                sname = "NO";
            }
            
            String eaccount = null;
            if(eyes.isSelected())
            {
                eaccount = "YES";
            }
            else if(eno.isSelected())
            {
                eaccount = "NO";
            }
            
            if(ae.getSource() == next)
            {
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
            
            String pan = panTextField.getText();
            String adhaar = adhaarTextField.getText();
            
            try
            {
                    Conn c = new Conn();
                    //"String"+variable+"String" = 'String'"+variable+"'String'
                    
                    String query = "insert into signuptwo values('"+formno+"','"+rname+"','"+cname+"','"+iname+"','"+qname+"','"+oname+"','"+pan+"','"+adhaar+"','"+sname+"','"+eaccount+"')";
                    c.s.executeUpdate(query); // execute the SQL statement
                
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    
    public static void main(String args[])
    {
        new SignupTwo("");
    }
}
