package net.broker.food.servlet;

import net.broker.food.data.Constants;
import net.broker.food.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;

import static net.broker.food.data.Constants.HTTP_SESSION_USER_ID_KEY;


@MultipartConfig
public class CreateNewAccountServlet extends HttpServlet {
    private static final int BUFFER_SIZE = 4096;
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
        Map<Integer,User> users = (Map<Integer,User>)getServletContext().getAttribute(Constants.USER_KEY);
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String address1 = request.getParameter("address_1");
        String address2 = request.getParameter("address_2");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String country = request.getParameter("country");

        String dateCode = request.getParameter("dob_year") + request.getParameter("dob_month") + request.getParameter("dob_day");
        Date dateOfBirth;
        try {
            dateOfBirth = dateFormat.parse(dateCode);
        } catch (ParseException pe) {
            throw new RuntimeException(pe);
        }
        String password = request.getParameter("password");

        Part part = request.getPart("photo");
        try (FileOutputStream photo = new FileOutputStream(part.getSubmittedFileName());
             InputStream fileData = part.getInputStream()) {
            int read;
            final byte[] buffer = new byte[BUFFER_SIZE];
            while ( (read = fileData.read(buffer)) > 0 ) {
                logger.info("Read part: "+read);
                photo.write(buffer, 0 , read);
                logger.info("Wrote file: "+read);
            }
        } catch (FileNotFoundException fnfe) {
            throw new RuntimeException(fnfe);
        }

        User user = new User(users.size()+1, firstName, lastName, address1, address2, city, state, country, part.getSubmittedFileName(), 0, 0, 0, password, dateOfBirth);
        users.put(user.getUserId(), user);
        request.getSession().setAttribute(HTTP_SESSION_USER_ID_KEY, user.getUserId());
        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }
}
