package io.fries.koans.collections;

public class Item {

    private final String name;
    private final Integer price;

    public Item(final String name, final Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
