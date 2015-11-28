package com.imoc.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
	public List<Course>	courseseToSelect;

	public ListTest() {
		this.courseseToSelect = new ArrayList<Course>();
	}

	public void testAdd(Course course) {
		Course course2 = new Course("1", "数据结构");
		this.courseseToSelect.add(course2);
		Course[] courses = { new Course("2", "C语言"), new Course("4", "汇编语言") };
		this.courseseToSelect.addAll(Arrays.asList(courses));
	}
}
