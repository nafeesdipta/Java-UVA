/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamysql;

/**
 *
 * @author nafees
 */
import java.sql.*;
public class Javamysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //1. get a connection
       Connection  myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
//2. create a statement
            //
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
