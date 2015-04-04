package org.coursera.algs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickFindTest {
	private QuickFind q;
	
	@Before
	public void initQuickFind() {
		this.q = new QuickFind(5);
	}
	
	@Test
	public void test_connectedTrue() {
		q.union(1, 2);
		Assert.assertTrue(q.connected(1, 2));
	}
	
	@Test
	public void test_connectedFalse() {
		Assert.assertFalse(q.connected(1, 2));
	}
}
