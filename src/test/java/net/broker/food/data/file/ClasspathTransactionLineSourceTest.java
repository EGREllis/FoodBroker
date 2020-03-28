package net.broker.food.data.file;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.Item;
import net.broker.food.pojo.Transaction;
import net.broker.food.pojo.User;
import org.junit.Test;

import java.util.Map;

public class ClasspathTransactionLineSourceTest {
    @Test
    public void when_transactionLoadedFromClasspath_then_dataMatchesExpectations() {
        IdentifiableSource<Item> itemSource = new ClasspathItemLineSource();
        IdentifiableSource<User> userSource = new ClasspathUserLineSource();
        Map<Integer, Item> items = itemSource.sourceAll();
        Map<Integer, User> users = userSource.sourceAll();

        IdentifiableSource<Transaction> source = new ClasspathTransactionLineSource(users, items);
        Map<Integer,Transaction> transactions = source.sourceAll();
        assert transactions.size() == 3;
        assert transactions.get(2).getQuantity() == 10;
        assert transactions.get(2).getUser().getUserId() == 1;
        assert transactions.get(2).getItem().getId() == 4;
    }
}
