package cn.wzvtc.leonshaw.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

import static cn.wzvtc.leonshaw.dao.UsersDao.findByName;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username1 = request.getParameter("username");
        String password1 = request.getParameter("password");
        String password2 = Objects.requireNonNull(findByName(username1)).getPassword();
        if (password1.equals(password2))
            response.sendRedirect("Htmlpage/index.html");
        else
            response.sendRedirect("Htmlpage/error.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request, response);
    }

}
