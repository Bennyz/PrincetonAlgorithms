package org.coursera.algs;

public class WeightedQuickUnion {
	
	private int id[];
	private int size[];
	
	public WeightedQuickUnion(final int n) {
		this.id = new int[n];
		this.size= new int[n];
		
		for (int i = 0; i < n; i++) {
			id[i] = i;
			size[i] = 0;
		}
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	private int root(int i) {
		while (i != id[i]) {
			id[i] = id[id[i]];
			i = id[i];
		}
		
		return i;
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		
		if (i == j) {
			return;
		}
		
		// Determine which tree is going to contain the other tree
		if (size[i] < size[j]) {
			id[i] = j;
			size[j] += size[i];
		} else {
			id[j] = i;
			size[i] += size[j];
		}
	}
}
