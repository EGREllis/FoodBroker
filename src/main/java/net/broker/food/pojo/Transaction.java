package net.broker.food.pojo;

public class Transaction {
    private final int id;
    private final User user;
    private final Item item;
    private final int quantity;

    public Transaction(int id, User user, Item item, int quantity) {
        this.id = id;
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public int getId() {return id;}

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public Transaction updateQuantity(int quantity) {
        return new Transaction(id, user, item, quantity);
    }
}
