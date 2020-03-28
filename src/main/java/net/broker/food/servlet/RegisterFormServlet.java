package net.broker.food.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.logging.Logger;

@WebServlet(name="process_register_form", urlPatterns = {"/submit_register"})
@MultipartConfig
public class RegisterFormServlet extends HttpServlet {
    private static final int BUFFER_SIZE = 4096;
    private static final String FIRST_NAME_KEY = "first_name";
    private static final String LAST_NAME_KEY = "last_name";
    private static final String PHOTO_KEY = "profile_pic";

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String firstName = request.getParameter(FIRST_NAME_KEY);
        String lastMame = request.getParameter(LAST_NAME_KEY);
        Part part = request.getPart(PHOTO_KEY);

        Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

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

        PrintWriter output = response.getWriter();
        output.println(String.format("<html><body><p>Thanks for registering %1$s, %2$s<br/>%3$s</p><p>%4$s</p></body></html>", firstName, lastMame, part.getSubmittedFileName(), new File(".").getAbsolutePath()));
    }
}
