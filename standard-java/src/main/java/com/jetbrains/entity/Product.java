package com.jetbrains.entity;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    private final int id;
    private final String title;
    private final BigDecimal price;
    private final List<OrderItem> orderItems;

    public Product(int id, String title, BigDecimal price, List<OrderItem> orderItems) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.orderItems = orderItems;
    }
}
