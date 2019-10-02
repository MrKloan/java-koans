package io.fries.koans.collections;

import java.util.List;

public class Shop {

    private final String name;
    private final List<Item> items;

    public Shop(final String name, final List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }
}
