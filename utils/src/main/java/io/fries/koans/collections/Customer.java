package io.fries.koans.collections;

import java.util.List;

public class Customer {

    private final String name;
    private final Integer age;
    private final Integer budget;
    private final List<Item> wantsToBuy;

    public Customer(final String name, final Integer age, final Integer budget, final List<Item> wantsToBuy) {
        this.name = name;
        this.age = age;
        this.budget = budget;
        this.wantsToBuy = wantsToBuy;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getBudget() {
        return budget;
    }

    public List<Item> getWantsToBuy() {
        return wantsToBuy;
    }
}
