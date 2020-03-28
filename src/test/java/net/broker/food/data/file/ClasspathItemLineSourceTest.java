package net.broker.food.data.file;

import net.broker.food.data.IdentifiableSource;
import net.broker.food.pojo.Item;
import org.junit.Test;

import java.util.Map;

public class ClasspathItemLineSourceTest {
    @Test
    public void when_loadedFromClasspath_then_returnsExpectedResults() {
        IdentifiableSource<Item> itemSource = new ClasspathItemLineSource();
        Map<Integer,Item> items = itemSource.sourceAll();
        assert items.size() == 5;
        assert items.get(1).getImage().equals("Broker_ToiletRollIcon.png");
    }
}
