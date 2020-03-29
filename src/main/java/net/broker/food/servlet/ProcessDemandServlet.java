package net.broker.food.servlet;

import net.broker.food.data.Constants;
import net.broker.food.pojo.Item;
import net.broker.food.pojo.Transaction;
import net.broker.food.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ProcessDemandServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int nRolls = Integer.parseInt(request.getParameter("toilet_roll"));
        int nNappy = Integer.parseInt(request.getParameter("nappy"));
        int nCleaner = Integer.parseInt(request.getParameter("cleaner"));
        int nSanitizer = Integer.parseInt(request.getParameter("sanitizer"));
        int nWipes = Integer.parseInt(request.getParameter("wipes"));
        int nOxygen = Integer.parseInt(request.getParameter("oxygen"));

        int userId = 1; //This needs to come from the HttpSession

        Map<Integer,Transaction> allTransactions = (Map<Integer,Transaction>)getServletContext().getAttribute(Constants.TRANSACTION_KEY);
        Map<Integer,Item> allItems = (Map<Integer,Item>)getServletContext().getAttribute(Constants.ITEM_KEY);
        Map<Integer,User> allUsers = (Map<Integer,User>)getServletContext().getAttribute(Constants.USER_KEY);

        Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

        Map<Item,Transaction> myTransactions = new HashMap<>();
        for (Transaction transaction : allTransactions.values()) {
            if (transaction.getUser().getUserId() == userId) {
                myTransactions.put(transaction.getItem(), transaction);
            }
        }

        //Determine correct values for all transactions moving forward
        Map<Item,Transaction> updatedTransactions = new HashMap<>();
        for (Item item : allItems.values()) {
            Transaction trans = myTransactions.get(item);
            int newValue = 0;
            switch (item.getName()) {
                case "ToiletRoll":
                    newValue = nRolls;
                    break;
                case "Nappy":
                    newValue = nNappy;
                    break;
                case "Cleaner":
                    newValue = nCleaner;
                    break;
                case "Hand Wash":
                    newValue = nSanitizer;
                    break;
                case "Soap":
                    newValue = nWipes;
                    break;
                case "Oxygen":
                    newValue = nOxygen;
                    break;
            }
            logger.info(String.format("New value for item %1$s : %2$d (id %3$d)", item.getName(), newValue, item.getId()));
            if (trans == null) {
                updatedTransactions.put(item, new Transaction(allTransactions.size()+10, allUsers.get(userId), item, newValue));
            } else if (trans.getQuantity() != newValue) {
                updatedTransactions.put(item, trans.updateQuantity(newValue));
            } else {
                updatedTransactions.put(item, trans);
            }
        }

        //Update the in memory representations
        for (Transaction trans : updatedTransactions.values()) {
            allTransactions.put(trans.getId(), trans);
        }

        getServletContext().setAttribute(Constants.TRANSACTION_KEY, allTransactions);

        request.getRequestDispatcher("/map.jsp").forward(request, response);
    }
}
