package org.example;

public class Smelly {

    // 🚨 BUG: możliwy NullPointerException (New Code)
    public static int explode(String text) {
        return text.length();
    }
}
