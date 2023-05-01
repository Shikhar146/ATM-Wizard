package bank.management.system;
import java.sql.*;


public class Conn 
{
    Connection c;
    Statement s;
    
    public Conn()
    {
        try
        {
            //Register the Driver
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem" , "root" , "shikhar1111"); // Create connection
            s = c.createStatement();  // Create Statement
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
