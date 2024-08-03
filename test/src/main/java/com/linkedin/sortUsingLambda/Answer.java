package com.linkedin.sortUsingLambda;
// Java code​​​​​​‌​‌‌​‌​‌‌​​​​‌‌‌‌‌‌​‌​‌​​ below

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Write your answer here, and then test your code.

class Answer {

    // Change these boolean values to control whether you see
    // the expected answer and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the largest number in the 'numbers' array.
    static List<Item> sortList(List<Item> items) {

        List<Item> result = new ArrayList<>(items);
        // Your code goes here. Sort the result list using a lambda expression.
        Comparator<Item> comparator = (a, b) -> (int) (a.price - b.price);

        return result.stream().sorted(comparator).toList();
    }

    public static class Item {
        int id;
        String name;
        float price;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public float getPrice() {
            return price;
        }
        public void setPrice(float price) {
            this.price = price;
        }
        public Item(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString() {
            return "[" + this.id + ", " + this.name + ", " + this.price + "]";
        }
    }

}