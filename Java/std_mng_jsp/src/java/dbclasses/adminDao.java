/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class adminDao {
    Connection con = null;
        
    void connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection( //makes connection to db
                    "jdbc:mysql://localhost:3306/std_mng",
                    "root", ""); //?user=root&password=xyz");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet selectById(admin s){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select * from admin where id=(?) and password=(?)"); //update code
            pst.setInt(1,s.id);
            pst.setString(2, s.password);
            pst.executeQuery();
            res = pst.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    }
}
