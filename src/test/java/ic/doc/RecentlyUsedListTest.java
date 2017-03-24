package ic.doc;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RecentlyUsedListTest {

    // List should be empty when initialised
    @Test
    public void isInitialisedEmtpy() {
        assertTrue(new RecentlyUsedList().isEmpty());
    }
}
