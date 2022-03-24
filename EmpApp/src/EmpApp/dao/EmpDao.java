/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpApp.dao;

import EmpApp.dbutil.DBConnection;
import EmpApp.pojo.Emp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EmpDao {
    public static boolean addEmployee(Emp e) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Insert into employee values(?,?,?)");
        ps.setInt(1, e.getEmpId());
        ps.setString(2, e.getName());
        ps.setDouble(3, e.getSal());
        int res = ps.executeUpdate();
        if(res != 1) return false;
        return true;
    }
    public static Emp findEmployeeById(int id) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from employee where empid=?");
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
           Emp e = new Emp();
           e.setEmpId(rs.getInt(1));
           e.setName(rs.getString(2));
           e.setSal(rs.getDouble(3));
           return e;
           
        }
        return null;
    }
    public static List<Emp> getAllEmployee() throws SQLException{
        List<Emp> ret = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from employee");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
           Emp e = new Emp();
           e.setEmpId(rs.getInt(1));
           e.setName(rs.getString(2));
           e.setSal(rs.getDouble(3));;
           ret.add(e);
        }
        return ret;
    }
    public static boolean updateName(int id, String name) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update employee set ename = ? where empid = ?");
        ps.setString(1,name);
        ps.setInt(2, id);
        int res = ps.executeUpdate();
        if(res != 1) return false;
        return true;
    }
    public static boolean updateSalary(int id, Double salry) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update employee set sal = ? where empid = ?");
        ps.setDouble(1,salry);
        ps.setInt(2, id);
        int res = ps.executeUpdate();
        if(res != 1) return false;
        return true;
    }
    public static boolean delete(int id) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("delete from employee where empid = ?");
        ps.setInt(1, id);
        int res = ps.executeUpdate();
        if(res != 1) return false;
        return true;
    }
}
