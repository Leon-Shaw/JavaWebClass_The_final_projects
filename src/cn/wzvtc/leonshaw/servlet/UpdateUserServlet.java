package cn.wzvtc.leonshaw.servlet;

import cn.wzvtc.leonshaw.dao.UsersDao;
import cn.wzvtc.leonshaw.domain.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "UpdateUserServlet", urlPatterns = "/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = new User();
        user.setId(request.getParameter("id"));
        user.setUsername(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        user.setSex(request.getParameter("sex"));
        user.setAge(Integer.valueOf(request.getParameter("age")));
        user.setBirthday(Date.valueOf(request.getParameter("birthday")));
        UsersDao usersDao = new UsersDao();
        if (usersDao.update(user)) {
            response.getWriter().println("update success");
        } else {
            response.getWriter().println("update fail");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
}
