package com.develogical;

class RecentlyUsedList {
    private String content; // 1 item max

    boolean isEmpty() {
        return content == null;
    }

    void add(String element) {
        content = element;
    }

    int size() {
        return content == null ? 0 : 1;
    }
}
