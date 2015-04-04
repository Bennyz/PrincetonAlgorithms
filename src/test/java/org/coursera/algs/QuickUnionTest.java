package org.coursera.algs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuickUnionTest {
	private QuickUnion q;
	
	@Before
	public void initQuickUnion() {
		this.q = new QuickUnion(10);
	}
	
	@Test
	public void test_connectTrue() {
		q.union(2, 1);
		q.union(5, 9);
		q.union(8, 4);
		q.union(8, 2);
		q.union(7, 8);
		q.union(6, 3);
		q.union(6, 9);
		q.union(6, 7);
		q.union(7, 0);
		Assert.assertTrue(q.connected(1, 2));
	}
	
	@Test
	public void test_connectFalse() {
		Assert.assertFalse(q.connected(1, 2));
	}
}
