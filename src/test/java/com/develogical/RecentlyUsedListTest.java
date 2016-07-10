package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {

    private final RecentlyUsedList l = new RecentlyUsedList();

	@Test 
	public void isInitialisedEmpty() {

		assertThat(l.isEmpty(), is(true));
        assertThat(l.size(), is(0));
	}

	@Test
    public void canAddTo() {
        l.add("hello");
        assertThat(l.isEmpty(), is(false));
        assertThat(l.size(), is(1));
        l.add("goodbye");
        assertThat(l.size(), is(2));
    }

    @Test
    public void canRetrieveFrom() {
        l.add("cat");
        l.add("dog");
        assertThat(l.get(0), is("cat"));
    }

    @Test
    public void mostRecentIsFirstInList() {
        l.add("cat");
        l.add("dog");
        assertThat(l.get(0), is("dog"));
        assertThat(l.get(1), is("cat"));
    }

    @Test
    public void dupMovedNotAdded() {
        l.add("cat");
        l.add("cat");
        assertThat(l.size(), is(1));
    }
}
