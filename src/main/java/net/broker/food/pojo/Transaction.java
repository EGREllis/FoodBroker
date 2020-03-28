package net.broker.food.pojo;

public class Transaction {
    private final User user;
    private final Item item;
    private final int quantity;

    public Transaction(User user, Item item, int quantity) {
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
