package net.broker.food.pojo;

public class Item {
    private final int id;
    private final String name;
    private final String image;
    private final int pointValue;

    public Item(int id, String name, String image, int pointValue) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.pointValue = pointValue;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
    
    public int getPointValue() {
        return pointValue;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Item) {
            Item other = (Item)obj;
            result = id == other.id;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
