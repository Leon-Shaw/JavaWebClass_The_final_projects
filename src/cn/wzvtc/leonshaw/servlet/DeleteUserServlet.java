package cn.wzvtc.leonshaw.servlet;

import cn.wzvtc.leonshaw.dao.UsersDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteUserServlet", urlPatterns = "/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        UsersDao usersDao = new UsersDao();
        if (usersDao.delete(id)) {
            response.getWriter().println("delete success");
        } else {
            response.getWriter().println("delete fail");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }
}
