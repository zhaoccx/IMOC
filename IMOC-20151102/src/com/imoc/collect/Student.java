package com.imoc.collect;

import java.util.HashSet;
import java.util.Set;

public class Student {
	public String		id;
	public String		name;
	public Set<Course>	course;

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.course = new HashSet<Course>();
	}
}
