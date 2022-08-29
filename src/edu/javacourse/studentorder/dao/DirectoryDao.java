package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.Street;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DirectoryDao
{
    private Connection getConnection() throws SQLException {
//        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jc_student", "postgres", "postgres");
        return con;
    }

    public List<Street> findStreets(String pattern) throws SQLException {
        List<Street> result = new LinkedList<>();
        String sql = "SELECT street_code, street_name FROM jc_student WHERE UPPER(street_name, LIKE UPPER('%" + pattern + "%')";

        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Street str = new Street (rs.getLong("street_code"), rs.getString("street_name"));
            result.add(str);
        }
        System.out.println(result);
        return result;
    }
}
