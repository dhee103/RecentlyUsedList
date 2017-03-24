package ic.doc;

public class RecentlyUsedList {
    private int size;

    public RecentlyUsedList() {
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String s) {
        size++;
    }

    public int size() {
        return size;
    }
}
