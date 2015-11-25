package com.imoc;

import java.util.Scanner;

public class Dome1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int socre =input.nextInt();
		
		int count = 0;
		System.out.println(socre);
		
		while(socre<60){
			socre++;
			count++;
		}
		System.out.println(socre);
		System.out.println(count);
		System.out.println(count);
		System.out.println(count);
	}
}
