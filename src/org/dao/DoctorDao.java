package org.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.db.DBConn;
import org.model.Doctor;
public class DoctorDao
{
    Connection conn;
    public Doctor selectDoctor(String dno)
    {
        try {
            conn=DBConn.getConn();
            PreparedStatement pstmt=conn.prepareStatement("select * from [doctor] where dno=?");
            pstmt.setString(1,dno);
            ResultSet rs=pstmt.executeQuery();
            if (rs.next())
            {
                Doctor doctor=new Doctor();
                doctor.setDno(rs.getString(1));
                doctor.setDname(rs.getString(2));
                doctor.setSex(rs.getString(3));
                doctor.setBirthday(rs.getString(4));
                doctor.setNation(rs.getString(5));
                doctor.setTelephone(rs.getString(6));
                doctor.setPosition(rs.getString(7));
                doctor.setWorkterm(rs.getInt(8));
                doctor.setEduacationlevel(rs.getString(9));
                doctor.setDepartmentno(rs.getString(10));
                return doctor;
            }else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }finally {
            DBConn.CloseConn();
        }
    }

    public boolean updateDoctor(Doctor doctor)
    {
        try {
            conn=DBConn.getConn();
            PreparedStatement pstmt=conn.prepareStatement("update [doctor] set Dname=?,Sex=?,Birthday=?,Nation=?,Telephone=?,Position=?,Workterm=?,Eduacationlevel=?,Departmentno=?where Dno=?");
            pstmt.setString(1,doctor.getDname());
            pstmt.setString(2,doctor.getSex());
            pstmt.setString(3,doctor.getBirthday());
            pstmt.setString(4,doctor.getNation());
            pstmt.setString(5,doctor.getTelephone());
            pstmt.setString(6,doctor.getPosition());
            pstmt.setInt(7,doctor.getWorkterm());
            pstmt.setString(8,doctor.getEduacationlevel());
            pstmt.setString(9,doctor.getDepartmentno());
            pstmt.setString(10,doctor.getDno());
            pstmt.execute();
                return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            DBConn.CloseConn();
        }
    }

    public boolean addDoctor(Doctor doctor)
    {
        try {
            conn=DBConn.getConn();
            PreparedStatement pstmt=conn.prepareStatement("insert into [doctor] value(?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1,doctor.getDno());
            pstmt.setString(2,doctor.getDname());
            pstmt.setString(3,doctor.getSex());
            pstmt.setString(4,doctor.getBirthday());
            pstmt.setString(5,doctor.getNation());
            pstmt.setString(6,doctor.getTelephone());
            pstmt.setString(7,doctor.getPosition());
            pstmt.setInt(8,doctor.getWorkterm());
            pstmt.setString(9,doctor.getEduacationlevel());
            pstmt.setString(10,doctor.getDepartmentno());

            pstmt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            DBConn.CloseConn();
        }
    }

    public boolean deleteDoctor(String dno)
    {
        try {
            conn=DBConn.getConn();
            PreparedStatement pstmt = conn.prepareStatement("delete from [doctor] where dno=?");
            pstmt.setString(1,dno);
            pstmt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally {
            DBConn.CloseConn();
        }
    }
}
