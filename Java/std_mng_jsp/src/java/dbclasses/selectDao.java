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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class selectDao {
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
    
     public ResultSet selectstatus(){
        connection();
        ResultSet res = null;
        Statement St;
        try {
            St = con.createStatement(); // a simple statement for select
            String qry ="select student.id,student.name,program.course,apply.status,apply.aid from student inner join apply on student.id=apply.id inner join program on program.pid=apply.pid";//query 
            St.executeQuery(qry);
            res = St.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;                
    }
    public ResultSet edit_status(int aid){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select student.id,student.name,program.course,apply.status from apply inner join student on student.id=apply.id inner join program on program.pid=apply.pid where apply.aid=(?)  "); //update code
            pst.setInt(1,aid);
            pst.executeQuery();
            res = pst.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    }
     public ResultSet selectapplied(){
        connection();
        ResultSet res = null;
        Statement St;
        try {
            St = con.createStatement(); // a simple statement for select
            String qry ="select student.id,student.name,student.email,program.course,apply.status,apply.aid from student inner join apply on student.id=apply.id inner join program on program.pid=apply.pid";//query 
            St.executeQuery(qry);
            res = St.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;     
    }
    public ResultSet select_Selected(){
        connection();
        ResultSet res = null;
        Statement St;
        try {
            St = con.createStatement(); // a simple statement for select
            String qry ="select student.id,student.name,student.email,program.course,apply.status from student inner join apply on student.id=apply.id inner join program on program.pid=apply.pid where status='selected'";//query 
            St.executeQuery(qry);
            res = St.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;     
    }
    public ResultSet select_nonSelected(){
        connection();
        ResultSet res = null;
        Statement St;
        try {
            St = con.createStatement(); // a simple statement for select
            String qry ="select student.id,student.name,student.email,program.course,apply.status from student inner join apply on student.id=apply.id inner join program on program.pid=apply.pid where status='not selected'";//query 
            St.executeQuery(qry);
            res = St.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;     
    }
    public ResultSet select_pending(){
        connection();
        ResultSet res = null;
        Statement St;
        try {
            St = con.createStatement(); // a simple statement for select
            String qry ="select student.id,student.name,student.email,program.course,apply.status from student inner join apply on student.id=apply.id inner join program on program.pid=apply.pid where status='not pending'";//query 
            St.executeQuery(qry);
            res = St.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;     
    }
    
    
    
  public ResultSet slt_prog_wise(int pid){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select student.id,student.name,student.email,program.course,apply.status from apply inner join student on student.id=apply.id inner join program on program.pid=apply.pid where program.pid=(?)  "); //update code
            pst.setInt(1,pid);
            pst.executeQuery();
            res = pst.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    }
  public ResultSet slt_stat_wise(String stat){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select student.id,student.name,student.email,program.course,apply.status from apply inner join student on student.id=apply.id inner join program on program.pid=apply.pid where apply.status=(?)  "); //update code
            pst.setString(1,stat);
            pst.executeQuery();
            res = pst.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    }
  public ResultSet select_not_applied(){
        connection();
        ResultSet res = null;
        Statement St;
        try {
            St = con.createStatement(); // a simple statement for select
            String query = "SELECT s.id, s.name, s.email " +
               "FROM student s " +
               "LEFT JOIN application a ON s.id = a.id " +
               "WHERE a.id IS NULL";
               
                
              
            St.executeQuery(query);
            res = St.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;     
    }
  public ResultSet slt_stat(int stat){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select status from apply where id=(?)"); //update code
            pst.setInt(1,stat);
            pst.executeQuery();
            res = pst.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    }
  
  
      
}
