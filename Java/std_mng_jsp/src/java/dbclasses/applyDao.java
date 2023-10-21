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
public class applyDao {
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
    public int insert(apply s){
        connection();
        int res = 0;
        PreparedStatement ast;
        try {
            ast = con.prepareStatement("INSERT INTO apply (id, pid,status) values(?,?,?)"); // insert code
            ast.setInt(1, s.id);
            ast.setInt(2,s.pid);
            ast.setString(3, s.status);
           
           res = ast.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;
    }
    public ResultSet selectById(apply s){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select aid,id,pid from apply where id=(?)"); //update code
            pst.setInt(1,s.id);
            pst.executeQuery();
            res = pst.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    }
    public ResultSet selectPid(apply s){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select pid from apply where id=(?)"); //update code
            pst.setInt(1,s.id);
            pst.executeQuery();
            res = pst.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    } 
    public int updateCourse(apply s){
        connection();
        int res = 0;
        PreparedStatement st;
        try {
            st = con.prepareStatement("update apply set pid=(?) where id=(?)"); //update code
            st.setInt(1, s.pid);
            
            st.setInt(2,s.id);
          res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    public int updateStatus(apply s){
         connection();
        int res = 0;
        PreparedStatement st;
        try {
            st = con.prepareStatement("update apply set status=(?) where aid=(?)"); //update code
            st.setString(1, s.status);
            st.setInt(2,s.aid);
          res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
