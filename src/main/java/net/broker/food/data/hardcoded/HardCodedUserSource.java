package net.broker.food.data.hardcoded;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.User;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HardCodedUserSource implements IdentifiableSource<User> {
    @Override
    public Map<Integer, User> sourceAll() {
        Map<Integer,User> users = new HashMap<>();
        User user = new User(1, "Sarah","Johnson","Line1","Line2","San Fransisco","CA","USA","Broker_FakeUser1.png", 156, 15, 10, "password", new Date());
        users.put(user.getUserId(), user);
        return users;
    }
}
