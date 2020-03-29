package net.broker.food.listener;

import net.broker.food.data.Constants;
import net.broker.food.data.hardcoded.HardCodedItemSource;
import net.broker.food.data.hardcoded.HardCodedTransactionSource;
import net.broker.food.data.hardcoded.HardCodedUserSource;
import net.broker.food.pojo.Item;
import net.broker.food.pojo.Transaction;
import net.broker.food.pojo.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Map;

@WebListener
public class ApplicationDataLoaderListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        ServletContext context = event.getServletContext();

        Map<Integer, User> users = new HardCodedUserSource().sourceAll();
        Map<Integer, Item> items = new HardCodedItemSource().sourceAll();
        Map<Integer, Transaction> transactions = new HardCodedTransactionSource(items, users).sourceAll();

        context.setAttribute(Constants.ITEM_KEY, items);
        context.setAttribute(Constants.USER_KEY, users);
        context.setAttribute(Constants.TRANSACTION_KEY, transactions);
    }
}
