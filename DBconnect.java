/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Mukuria
 */
public class DBconnect {
     public static  Connection connect() 
    {
        Connection con=null;
        try {
        
          Class.forName("com.mysql.jdbc.Driver");
            
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
    }
    

    return con;
    }
}


