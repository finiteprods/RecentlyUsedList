package com.develogical;

import java.util.ArrayList;
import java.util.List;

class RecentlyUsedList {
    private final List<String> content = new ArrayList<>();

    boolean isEmpty() {
        return content.isEmpty();
    }

    void add(String element) {
        content.add(element);
    }

    int size() {
        return content.size();
    }

    String get(int i) {
        return content.get(i);
    }

}
