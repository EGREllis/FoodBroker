package net.broker.food.servlet.examples;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ExampleServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter htmlOutput = response.getWriter();
        htmlOutput.println("<html><head></head><body><p>This html was from the servlet, here is a random number: "+(Math.round(Math.random()*10))+"</p></body></html>");
    }
}
