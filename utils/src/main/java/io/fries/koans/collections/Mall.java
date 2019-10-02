package io.fries.koans.collections;

import java.util.List;

public class Mall {

    private final List<Shop> shops;
    private final List<Customer> customers;

    public Mall(final List<Shop> shops, final List<Customer> customers) {
        this.shops = shops;
        this.customers = customers;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
