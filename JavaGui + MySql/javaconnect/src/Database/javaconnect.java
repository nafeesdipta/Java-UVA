package Database;

import java.sql.*;
import javax.swing.*;
public class javaconnect {
private static Connection conn=null;
    public static Connection ConnectDb()
    {
        try {
     Class.forName("com.mysql.jdbc.Driver");
      conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Demo","root","");
            JOptionPane.showMessageDialog(null,"Connection Established");
            return conn;
        } catch (Exception e) {
            System.out.println("d");
           JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
