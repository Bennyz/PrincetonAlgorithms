package org.coursera.algs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickUnionTest {
	private QuickUnion q;
	
	@Before
	public void initQuickUnion() {
		this.q = new QuickUnion(5);
	}
	
	@Test
	public void test_connectTrue() {
		q.union(1, 2);
		Assert.assertTrue(q.connected(1, 2));
	}
	
	@Test
	public void test_connectFalse() {
		Assert.assertFalse(q.connected(1, 2));
	}
}
