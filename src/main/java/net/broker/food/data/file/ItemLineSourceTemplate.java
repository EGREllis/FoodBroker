package net.broker.food.data.file;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class ItemLineSourceTemplate implements IdentifiableSource<Item> {
    private static final Pattern ITEM_LINE_PATTERN = Pattern.compile("^([^~]+)~([^~]+)~([^~]+)~([^~]+)$");

    protected abstract BufferedReader getBufferedReader() throws IOException;

    @Override
    public Map<Integer, Item> sourceAll() {
        Map<Integer,Item> results = new HashMap<>();
        try (BufferedReader reader = getBufferedReader()) {
            String line;

            while ( (line = reader.readLine()) != null ) {
                Matcher matcher = ITEM_LINE_PATTERN.matcher(line);
                if (matcher.matches()) {
                    int id = Integer.parseInt(matcher.group(1));
                    String name = matcher.group(2);
                    String image = matcher.group(3);
                    int point = Integer.parseInt(matcher.group(4));
                    Item item = new Item(id, name, image, point);
                    results.put(item.getId(), item);
                }
            }
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
        return results;
    }
}
