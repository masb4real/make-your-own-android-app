package com.example.mahmuda.mamafood.app.food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Murtala Adamu.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class FoodContent {

    /**
     * An array of sample (food) items.
     */
    public static List<FoodItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (food) items, by ID.
     */
    public static Map<String, FoodItem> ITEM_MAP = new HashMap<>();

    static {
        // Add  items.
        addItem(new FoodItem("1", "Tuwo"));
        addItem(new FoodItem("2", "Amala"));
        addItem(new FoodItem("3", "Gari"));
        addItem(new FoodItem("4", "Akpu"));
    }

    private static void addItem(FoodItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A food item representing a piece of content.
     */
    public static class FoodItem {
        public String id;
        public String content;

        public FoodItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
