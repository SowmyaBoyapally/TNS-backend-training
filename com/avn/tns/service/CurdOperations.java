package com.avn.tns.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.avn.tns.dao.DBUtil;

public class CurdOperations {

    static Connection con = DBUtil.getConnection();

    // READ
    public static void showStudent() {
        try {
            String query = "SELECT * FROM student";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("sid") + " " + rs.getString("sname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // INSERT
    public static void addStudent(int sid, String sname) {
        try {
            String query = "INSERT INTO student VALUES (?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, sid);
            pst.setString(2, sname);
            pst.executeUpdate();
            System.out.println("Record inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public static void updateStudent(int sid, String sname) {
        try {
            String query = "UPDATE student SET sname = ? WHERE sid = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, sname);
            pst.setInt(2, sid);
            pst.executeUpdate();
            System.out.println("Record updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void deleteStudent(int sid) {
        try {
            String query = "DELETE FROM student WHERE sid = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, sid);
            pst.executeUpdate();
            System.out.println("Record deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

