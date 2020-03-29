package net.broker.food.servlet;

import net.broker.food.data.Constants;
import net.broker.food.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class LoginServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String password = request.getParameter("password");

        Map<Integer,User> users = (Map<Integer,User>)getServletContext().getAttribute(Constants.ALL_USERS_KEY);
        User login = null;
        for (User user : users.values()) {
            if (    user.getFirstName().toLowerCase().equals(firstName.toLowerCase()) &&
                    user.getLastName().toLowerCase().equals(lastName.toLowerCase()) &&
                    user.getPassword().equals(password)) {
                login = user;
            }
        }
        if (login == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            request.getSession().setAttribute(Constants.HTTP_SESSION_USER_ID_KEY, login.getUserId());
//            request.getRequestDispatcher("/profile.jsp").forward(request, response);
            response.sendRedirect("profile.html");
        }
    }
}
