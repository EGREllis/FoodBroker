package net.broker.food.servlet.examples;

import net.broker.food.data.Constants;
import net.broker.food.pojo.Item;
import net.broker.food.pojo.Transaction;
import net.broker.food.pojo.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class ListDataServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Map<Integer, User> user = (Map<Integer,User>)context.getAttribute(Constants.USER_KEY);
        Map<Integer, Item> item = (Map<Integer,Item>)context.getAttribute(Constants.ITEM_KEY);
        Map<Integer, Transaction> transaction = (Map<Integer,Transaction>)context.getAttribute(Constants.TRANSACTION_KEY);

        req.setAttribute(Constants.USER_KEY, user);
        req.setAttribute(Constants.ITEM_KEY, item);
        req.setAttribute(Constants.TRANSACTION_KEY, transaction);
        req.getRequestDispatcher("list_data.jsp").forward(req, resp);
    }
}
