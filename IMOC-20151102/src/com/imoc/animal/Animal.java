package com.imoc.animal;

public class Animal {
	public int			age;
	public String		name;
	public final String	man	= "Animal";

	public void eat() {
		System.out.println("吃东西");
	}

	public Animal() {
		System.out.println("Animal is inits");
	}
}
