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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class ListDataServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        Map<Integer, User> user = (Map<Integer,User>)context.getAttribute(Constants.ALL_USERS_KEY);
        Map<Integer, Item> item = (Map<Integer,Item>)context.getAttribute(Constants.ITEM_KEY);
        Map<Integer, Transaction> transaction = (Map<Integer,Transaction>)context.getAttribute(Constants.TRANSACTION_KEY);

        Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
        logger.info(String.format("Loaded %1$d users, %2$d items, %3$d transactions", user.size(), item.size(), transaction.size()));
        List<User> userList = new ArrayList(user.values());
        List<Item> itemList = new ArrayList(item.values());
        List<Transaction> transactionList = new ArrayList<>(transaction.values());

        req.setAttribute(Constants.ALL_USERS_KEY, userList);
        req.setAttribute(Constants.ITEM_KEY, itemList);
        req.setAttribute(Constants.TRANSACTION_KEY, transactionList);
        req.getRequestDispatcher("list_data.jsp").forward(req, resp);
    }
}
