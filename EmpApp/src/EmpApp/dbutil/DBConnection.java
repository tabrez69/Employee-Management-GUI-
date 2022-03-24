/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpApp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnection {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
             
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//WINDOWS-UIOVJVQ:1521/XE","project","java");
            JOptionPane.showMessageDialog(null,"Connected DB");
         }
         catch(Exception e){
            JOptionPane.showMessageDialog(null,"Cannot connect DB");
            e.printStackTrace();
            System.exit(1);
         }
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected DB");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Cannot Disconnect DB");
            e.printStackTrace();
         }
    }

    public static Connection getConnection() {
        return conn;
    }
}
