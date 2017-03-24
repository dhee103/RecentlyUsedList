package ic.doc;

public class RecentlyUsedList {
    private int size;

    public RecentlyUsedList() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public <T> void add(T elem) {
        size++;
    }

    public int size() {
        return size;
    }

    public String get() {
        return null;
    }
}
