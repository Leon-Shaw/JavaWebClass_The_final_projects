package cn.wzvtc.leonshaw.servlet;

import cn.wzvtc.leonshaw.dao.CourseDao;
import cn.wzvtc.leonshaw.domain.Course;
import com.alibaba.fastjson.JSON;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SelectAllUserServlet", urlPatterns = "/SelectAllUserServlet")
public class SelectAllUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        CourseDao courseDao;
        courseDao = new CourseDao();
        List<Course> courses;
        courses = courseDao.findAll();
        String jsonstr = JSON.toJSONString(courses);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().println(jsonstr);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
}
