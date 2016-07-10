package com.develogical;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {

	@Test 
	public void isInitialisedEmpty() {
        RecentlyUsedList l = new RecentlyUsedList();
		assertThat(l.isEmpty(), is(true));
        assertThat(l.size(), is(0));
	}

	@Test
    public void canAddTo() {
        RecentlyUsedList l = new RecentlyUsedList();
        l.add("hello");
        assertThat(l.isEmpty(), is(false));
        assertThat(l.size(), is(1));
    }
}
