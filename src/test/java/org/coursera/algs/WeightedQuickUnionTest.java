package org.coursera.algs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WeightedQuickUnionTest {
	private WeightedQuickUnion q;
	
	@Before
	public void initQuickUnion() {
		this.q = new WeightedQuickUnion(50000);
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
