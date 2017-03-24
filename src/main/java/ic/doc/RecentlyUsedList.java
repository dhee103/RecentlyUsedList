package ic.doc;

import java.util.LinkedList;
import java.util.List;

public class RecentlyUsedList {
    private List<String> list;

    public RecentlyUsedList() {
        this.list = new LinkedList<>();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void add(String elem) {
        list.add(elem);
    }

    public String get(int i) {
        return list.get(i);
    }


}
