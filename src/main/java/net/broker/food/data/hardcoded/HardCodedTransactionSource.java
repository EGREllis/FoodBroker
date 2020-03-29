package net.broker.food.data.hardcoded;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.Item;
import net.broker.food.pojo.Transaction;
import net.broker.food.pojo.User;

import java.util.HashMap;
import java.util.Map;

public class HardCodedTransactionSource implements IdentifiableSource<Transaction> {
    private final Map<Integer, User> users;
    private final Map<Integer, Item> items;

    public HardCodedTransactionSource(Map<Integer, Item> items, Map<Integer,User> users) {
        this.items = items;
        this.users = users;
    }

    @Override
    public Map<Integer, Transaction> sourceAll() {
        Map<Integer, Transaction> map = new HashMap<>();

        map.put(1, new Transaction(1, users.get(1), items.get(1), 10));
        map.put(2, new Transaction(2, users.get(1), items.get(4), 10));
        map.put(3, new Transaction(3, users.get(1), items.get(5), 5));

        return map;
    }
}
