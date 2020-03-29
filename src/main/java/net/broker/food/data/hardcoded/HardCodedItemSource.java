package net.broker.food.data.hardcoded;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.Item;

import java.util.HashMap;
import java.util.Map;

public class HardCodedItemSource implements IdentifiableSource<Item> {
    @Override
    public Map<Integer, Item> sourceAll() {
        Map<Integer,Item> map = new HashMap<>();
        map.put(1, new Item(1, "ToiletRoll", "Broker_ToiletRollIcon.png", 15));
        map.put(2, new Item(2, "Nappy", "Broker_NappyIcon.png", 10));
        map.put(3, new Item(3, "Cleaner", "Broker_CleanerIcon.png", 10));
        map.put(4, new Item(4, "Hand Wash", "Broker_HandWashIcon.png", 15));
        map.put(5, new Item(5, "Soap", "Broker_SoapIcon.png", 5));
        map.put(6, new Item(6, "Oxygen", "Broker_Oxygen.png", 20));
        return map;
    }
}
