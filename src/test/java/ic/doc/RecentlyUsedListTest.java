package ic.doc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
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
        assertThat(recentlyUsedList.size(), is(1));
    }
}
