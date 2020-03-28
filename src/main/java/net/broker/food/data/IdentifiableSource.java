package net.broker.food.data;

import java.util.Map;

public interface IdentifiableSource<T> {
    Map<Integer,T> sourceAll();
}
