package cn.wzvtc.leonshaw.servlet;

import cn.wzvtc.leonshaw.dao.UsersDao;
import cn.wzvtc.leonshaw.domain.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "InsertUserServlet", urlPatterns = "/InsertUserServlet")
public class InsertUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = new User();
        user.setId(request.getParameter("id"));
        user.setUsername(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setSex(request.getParameter("sex"));
        user.setAge(Integer.valueOf(request.getParameter("age")));
        user.setBirthday(Date.valueOf(request.getParameter("birthday")));
        if (UsersDao.insert(user)) {
            response.getWriter().println("insert success");
        } else {
            response.getWriter().println("insert fail");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
}
