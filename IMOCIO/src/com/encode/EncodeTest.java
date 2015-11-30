package com.encode;

import java.io.UnsupportedEncodingException;

public class EncodeTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "中国你好，ABC";
		byte[] bytes = string.getBytes();
		for (byte b : bytes) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println();
		byte[] bytes2 = string.getBytes("GBK");
		for (byte b : bytes2) {
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
	}
}
