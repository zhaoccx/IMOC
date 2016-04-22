package com.imoc.animal;

public class Initail {
	/**
	 * Test方法
	 * 
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		Dog dog2 = new Dog();
		Animal animal = dog2;
		Dog dog3 = (Dog) animal;
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
		} else {
			System.out.println("无法进行类型转换");
		}
	}
}
