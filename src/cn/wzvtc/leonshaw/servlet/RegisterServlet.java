package cn.wzvtc.leonshaw.servlet;

import cn.wzvtc.leonshaw.dao.UsersDao;
import cn.wzvtc.leonshaw.domain.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.UUID;

@WebServlet(name = "RegisterServlet", urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setAge(Integer.valueOf(request.getParameter("age")));
        user.setSex(request.getParameter("sex"));
        user.setBirthday(Date.valueOf(request.getParameter("birthday")));
        user.setId(UUID.randomUUID().toString().trim().replaceAll("-", ""));
        UsersDao.insert(user);
        response.sendRedirect("Htmlpage/login.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
}
