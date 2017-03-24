package ic.doc;

import java.util.LinkedList;
import java.util.List;

public class RecentlyUsedList<T> {
    private int size;
    private List<T> list;

    public RecentlyUsedList() {
        this.size = 0;
        this.list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public void add(T elem) {
        list.add(elem);
        size++;
    }

    public T get() {
        return list.get(0);
    }
}
