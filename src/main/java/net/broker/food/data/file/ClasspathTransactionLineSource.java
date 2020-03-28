package net.broker.food.data.file;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.Item;
import net.broker.food.pojo.Transaction;
import net.broker.food.pojo.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasspathTransactionLineSource implements IdentifiableSource<Transaction> {
    private static final Pattern TRANSACTION_LINE_PATTERN = Pattern.compile("^([^~]+)~([^~]+)~([^~]+)~([^~]+)$");
    private static final String filePath = "transaction.dat";

    private final Map<Integer,User> users;
    private final Map<Integer,Item> items;

    public ClasspathTransactionLineSource(Map<Integer,User> users, Map<Integer,Item> items) {
        this.users = users;
        this.items = items;
    }

    @Override
    public Map<Integer,Transaction> sourceAll() {
        Map<Integer,Transaction> results = new HashMap<>();
        Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
        logger.info(String.format("Loading transactions from classpath %1$s", filePath));

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(filePath)))) {
            String line;
            while ( (line = reader.readLine()) != null) {
                Matcher matcher = TRANSACTION_LINE_PATTERN.matcher(line);
                if (matcher.matches()) {
                    int id = Integer.parseInt(matcher.group(1));
                    int userId = Integer.parseInt(matcher.group(2));
                    int itemId = Integer.parseInt(matcher.group(3));
                    int quantity = Integer.parseInt(matcher.group(4));
                    User user = users.get(userId);
                    Item item = items.get(itemId);
                    Transaction transaction = new Transaction(id, user, item, quantity);
                    results.put(transaction.getId(), transaction);
                }
            }
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
        logger.info(String.format("Loaded %1$d transactions", results.size()));
        return results;
    }
}
