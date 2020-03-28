package net.broker.food.data.file;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasspathUserLineSource implements IdentifiableSource<User> {
    private static final Pattern USER_LINE_PATTERN = Pattern.compile("^([^~]*)~([^~]*)~([^~]*)~([^~]*)~([^~]*)~([^~]*)~([^~]*)~([^~]*)~([^~]*)~([^~]*)~([^~]*)~([^~]*)$");
    private static final String filePath = "user.dat";

    @Override
    public Map<Integer, User> sourceAll() {
        Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
        logger.info(String.format("Reading users from classpath %1$s", filePath));
        Map<Integer,User> results = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(filePath)))) {
            String line;
            while ( (line = reader.readLine()) != null) {
                Matcher matcher = USER_LINE_PATTERN.matcher(line);
                if (matcher.matches()) {
                    int id = Integer.parseInt(matcher.group(1));
                    String firstName = matcher.group(2);
                    String lastName = matcher.group(3);
                    String line1 = matcher.group(4);
                    String line2 = matcher.group(5);
                    String city = matcher.group(6);
                    String state = matcher.group(7);
                    String country = matcher.group(8);
                    String image = matcher.group(9);
                    int points = Integer.parseInt(matcher.group(10));
                    int range = Integer.parseInt(matcher.group(11));
                    int served = Integer.parseInt(matcher.group(12));
                    User user = new User(id, firstName, lastName, line1, line2, city, state, country, image, points, range, served);
                    results.put(user.getUserId(), user);
                }
            }
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
        logger.info(String.format("Read %1$d users", results.size()));
        return results;
    }
}
