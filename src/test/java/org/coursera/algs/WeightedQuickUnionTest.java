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
	public void test_connectedDirectTrue() {
		q.union(1, 2);

		Assert.assertTrue(q.connected(1, 2));
	}
	
	@Test
	public void test_connectedIndirectTrue() {
		q.union(1, 2);
		q.union(2, 6);
		q.union(6, 4560);
		Assert.assertTrue(q.connected(4560, 1));
	}
	
	@Test
	public void test_connectedDirectFalse() {
		Assert.assertFalse(q.connected(1, 2));
	}
	
	@Test
	public void test_connectedIndirectFalse() {
		q.union(1, 2);
		q.union(2, 6);
		q.union(6, 4560);
		q.union(7, 250);
		Assert.assertFalse(q.connected(7, 2));
	}

}
