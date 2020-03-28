package net.broker.food.data.file;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.User;
import org.junit.Test;

import java.util.Map;

public class ClasspathUserLineSourceTest {
    @Test
    public void when_usersLoadedFromClasspath_then_dataPresentAsExpected() {
        IdentifiableSource<User> source = new ClasspathUserLineSource();
        Map<Integer,User> users = source.sourceAll();
        assert users.size() == 1;
        assert users.get(1).getFirstName().equals("Sarah");
    }
}
