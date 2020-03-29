package net.broker.food.servlet;

import net.broker.food.data.Constants;
import net.broker.food.pojo.Item;
import net.broker.food.pojo.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ProfileServlet extends HttpServlet {
    protected static Logger logger = Logger.getLogger(ProfileServlet.class.getCanonicalName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = req.getServletContext();
        // user info
        logger.info("Getting user info ...");
        Integer currentUserId = (Integer)req.getSession().getAttribute(Constants.HTTP_SESSION_USER_ID_KEY);
        Map<Integer, User> users = (Map<Integer,User>)context.getAttribute(Constants.ALL_USERS_KEY);
        User user = users.entrySet().stream()
                .filter(item -> item.getValue().getUserId() == currentUserId)
                .map(item -> item.getValue())
                .collect(Collectors.toList())
                .get(0);

        // items
        logger.info("Getting items needed ...");
        Map<Integer, Item> items = (Map<Integer,Item>)context.getAttribute(Constants.ITEM_KEY);

        req.setAttribute(Constants.USER_KEY, user);
        req.setAttribute(Constants.ITEM_KEY, items.values());
        req.getRequestDispatcher("profile.jsp").forward(req, resp);
    }
}
