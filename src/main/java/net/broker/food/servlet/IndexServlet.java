package net.broker.food.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IndexServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String type = request.getParameter("type");
        if (type.toLowerCase().equals("donor")) {
            request.getRequestDispatcher("donor_map.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("recipient_map.jsp").forward(request, response);
        }
    }
}
