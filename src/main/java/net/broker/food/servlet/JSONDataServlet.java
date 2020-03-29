package net.broker.food.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
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

public class JSONDataServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        ServletContext context = getServletContext();

        Map<Integer,User> users = (Map<Integer,User>)context.getAttribute(Constants.USER_KEY);
        Map<Integer,Item> items = (Map<Integer,Item>)context.getAttribute(Constants.ITEM_KEY);
        Map<Integer,Transaction> transactions = (Map<Integer,Transaction>)context.getAttribute(Constants.TRANSACTION_KEY);

        mapper.writeValue(resp.getOutputStream(), users);
        mapper.writeValue(resp.getOutputStream(), items);
        mapper.writeValue(resp.getOutputStream(), transactions);
    }
}
