package cn.wzvtc.leonshaw.dao;


import cn.wzvtc.leonshaw.domain.Course;
import cn.wzvtc.leonshaw.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseDao {
    public ArrayList<Course> findAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Course> list = new ArrayList<>();
        try {
            conn = JDBCUtils.getConnecting();
            String sql = "SELECT * FROM course";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Course course = new Course();
                course.setId(rs.getInt("id"));
                course.setCode(rs.getString("code"));
                course.setName(rs.getString("name"));
                course.setCredit(rs.getInt("credit"));
                course.setHour(rs.getInt("hour"));
                list.add(course);
            }
            return list;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, pstmt, conn);
        }
        return null;
    }
}
