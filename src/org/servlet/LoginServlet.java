package org.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dao.*;
import org.model.*;
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        request.setCharacterEncoding("UTF-8");
        LoginDao loginDao=new LoginDao();
        Login l = loginDao.checkLogin(request.getParameter("name"),request.getParameter("password"));
        if (l!=null)
        {
            HttpSession session=request.getSession();
            session.setAttribute("login",l);
            response.sendRedirect("main.jsp");
        }else{
            response.sendRedirect("error.jsp");
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        doGet(request, response);

    }
}
