package com.frolov.mirang.servlet;

import com.frolov.mirang.Util;
import com.frolov.mirang.entity.User;
import com.frolov.mirang.entity.Wish;
import com.thedeanda.lorem.Lorem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "Registration", urlPatterns = "/registration")
public class Registration extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String passwordConfirm = request.getParameter("passwordConfirm");

        if (password.equals(passwordConfirm)) {
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setAge(Integer.parseInt(age));
            user.setCity(city);
            user.setCreated(new ArrayList<Wish>());
            user.setPerformed(new ArrayList<Wish>());
            user.setCoins(Util.RANDOM.nextInt(100));
            response.sendRedirect("/servlet");
        } else {
            printWriter.println("Error");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/registration.jsp");
        requestDispatcher.forward(request, response);
    }
}
