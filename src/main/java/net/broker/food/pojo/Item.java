package net.broker.food.pojo;

public class Item {
    private final int id;
    private final String name;
    private final String image;

    public Item(int id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
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
}
