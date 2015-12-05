package com.zcc;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddr {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName());
		System.out.println(address.getHostAddress());
		byte[] address2 = address.getAddress();
		System.out.println(Arrays.toString(address2));
		System.out.println(address);
		InetAddress inetAddress = InetAddress.getByName("zhaocc-PC");
		System.out.println(inetAddress.getHostAddress());
	}
}
