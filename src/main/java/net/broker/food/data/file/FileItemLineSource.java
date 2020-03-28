package net.broker.food.data.file;

import net.broker.food.pojo.Item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Logger;

public class FileItemLineSource extends ItemLineSourceTemplate {
    private final String filePath;

    public FileItemLineSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    protected BufferedReader getBufferedReader() throws IOException {
        return new BufferedReader(new FileReader(filePath));
    }

    @Override
    public Map<Integer, Item> sourceAll() {
        Logger logger = Logger.getLogger(this.getClass().getCanonicalName());
        logger.info(String.format("Reading items from file %1$s", filePath));
        Map<Integer, Item> result = super.sourceAll();
        logger.info(String.format("Read $1$d items", result.size()));
        return result;
    }
}
