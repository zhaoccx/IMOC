package com.imoc.animal;

public class Dog extends Animal {
	@Override
	public void eat() {
		System.err.println("sssssssssssssssssssss");
	}

	public Dog() {
		System.out.println("Dog is init");
		System.out.println(man);
	}
}
