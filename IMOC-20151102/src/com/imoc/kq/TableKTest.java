package com.imoc.kq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TableKTest {
	private List<TableK>	collection;

	public Collection<TableK> getCollection() {
		return collection;
	}

	public void setCollection(List<TableK> collection) {
		this.collection = collection;
	}

	public TableKTest() {
		this.collection = new ArrayList<TableK>();
	}

	public static void main(String[] args) {
		TableKTest kTest = new TableKTest();
		kTest.getTableKs();
		kTest.showCollection();
	}

	public Collection<TableK> getTableKs() {
		for (HuiK k : HuiK.values()) {
			this.collection.add(new TableK(1, k, "A"));
			for (int i = 2; i <= 10; i++) {
				this.collection.add(new TableK(i, k, i + ""));
			}
			this.collection.add(new TableK(10, k, "J"));
			this.collection.add(new TableK(11, k, "Q"));
			this.collection.add(new TableK(12, k, "K"));
		}
		return this.collection;
	}

	public void showCollection() {
		Collections.sort(this.collection);
		System.out.println(this.collection);
	}
}
