package com.imoc;

public class InitPhone {

	public static void main(String[] args) {
		Telphone telphone = new Telphone();
		telphone.setCpu(34);
		telphone.setMem(45);
		telphone.setScreen(90);
		System.out.println(telphone.toString());
	}

}
