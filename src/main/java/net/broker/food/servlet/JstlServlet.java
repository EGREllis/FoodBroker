package net.broker.food.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JstlServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            data.add((int)Math.round(Math.random()*10));
        }
        request.setAttribute("randomData", data);
        request.getRequestDispatcher("/table.jsp").forward(request, response);
    }
}
