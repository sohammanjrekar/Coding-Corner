package GreedyMethodology;

import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {
    static class Item {
        int value, weight;
        double ratio;
        
        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    public static void main(String[] args) {
        int capacity = 50;
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        
        // Create an array of items
        Item[] items = new Item[values.length];
        for (int i = 0; i < values.length; i++) {
            items[i] = new Item(values[i], weights[i]);
        }
        
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, Comparator.comparingDouble(item -> -item.ratio));
        
        // Calculate the maximum value we can get
        double totalValue = 0;
        for (Item item : items) {
            if (capacity >= item.weight) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                totalValue += item.ratio * capacity;
                break;
            }
        }
        
        System.out.println("Final value: " + totalValue);
    }
}
