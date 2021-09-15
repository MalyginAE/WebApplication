package com.example.server_app.servlet;

import com.example.server_app.Data;
import com.example.server_app.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
    private Data data;
    @Override
    public void init() throws ServletException {
        data = new Data();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name = req.getParameter("name");
       String password = req.getParameter("password");
        if (data.isExists(new User(name, password))) {
            resp.getWriter().println("Такой пользователь существует");
        } else {
            resp.getWriter().println("Нет такого пользователя");
        }

    }
}
