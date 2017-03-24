package ic.doc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RecentlyUsedListTest {

    // List should be empty when initialised
    @Test
    public void isInitialisedEmtpy() {
        assertTrue(new RecentlyUsedList().isEmpty());
    }

    // should be able to add things to the list
    @Test
    public void canAddToList() {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("hello");
        assertFalse(recentlyUsedList.isEmpty());
        assertThat(recentlyUsedList.size(), is(1));
        recentlyUsedList.add("goodbye");
        assertThat(recentlyUsedList.size(), is(2));
    }

    // should be able to retrieve things from list
    @Test
    public void canRetrieveByIndexFromList() {
        RecentlyUsedList recentlyUsedList = new RecentlyUsedList();
        recentlyUsedList.add("hello");
        assertThat(recentlyUsedList.get(), is("hello"));
    }
}
