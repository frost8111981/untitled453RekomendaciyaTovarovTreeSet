package com.company;

import java.math.BigDecimal;

public class Product {
    String name;
    BigDecimal cost;

    public Product(String name, BigDecimal cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s, цена: %s", name, cost);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getCost() {
        return cost;
    }
}
