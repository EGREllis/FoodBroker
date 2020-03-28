package net.broker.food.data.file;

import net.broker.food.pojo.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.logging.Logger;

public class ClasspathItemLineSource extends ItemLineSourceTemplate {
    private static final String filePath = "item.dat";

    @Override
    protected BufferedReader getBufferedReader() throws IOException {
        return new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(filePath)));
    }

    @Override
    public Map<Integer, Item> sourceAll() {
        Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
        logger.info(String.format("Reading items from classpath %1$s", filePath));
        Map<Integer, Item> result = super.sourceAll();
        logger.info(String.format("Read %1$d items", result.size()));
        return result;
    }
}
