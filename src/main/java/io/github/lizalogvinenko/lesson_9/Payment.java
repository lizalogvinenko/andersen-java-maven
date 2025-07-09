package io.github.lizalogvinenko.lesson_9;

import java.util.List;

public class Payment {
    private final List<Item> items;

    public Payment(List<Item> items) {
        this.items = items;
    }

    public int total() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.price * item.quantity;
        }
        return totalPrice;
    }

    public List<Item> getItems() {
        return items;
    }

    public static class Item {
        private final String name;
        private final int price;
        private final int quantity;

        public Item(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
