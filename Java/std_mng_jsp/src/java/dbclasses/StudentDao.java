/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclasses;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentDao {
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
    public int insert(student s){
        connection();
        int res = 0;
        PreparedStatement ast;
        try {
            ast = con.prepareStatement("INSERT INTO student (name, email, cnic,phone,password) values(?,?,?,?,?)"); // insert code
            ast.setString(1, s.name);
            ast.setString(2,s.email);
            ast.setString(3,s.cnic);
            ast.setString(4,s.phone);
            ast.setString(5,s.password);
           
           res = ast.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return res;
    }
    
    public int update(student s){
        connection();
        int res = 0;
        PreparedStatement st;
        try {
            st = con.prepareStatement("update student set name=(?),email=(?),cnic=(?),phone=(?),password=(?) where id=(?)"); //update code
            st.setString(1, s.name);
            st.setString(2,s.email);
            st.setString(3,s.cnic);
            st.setString(4,s.phone);
            st.setString(5,s.password);
            st.setInt(6, s.id);
          res = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
            
        
    public ResultSet selectById(student s){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select * from student where id=(?)"); //update code
            pst.setInt(1,s.id);
            pst.executeQuery();
            res = pst.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    }
    public ResultSet validate(student s){
        connection();
        ResultSet res = null;
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("select * from student where id=(?) and password=(?)"); //update code
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