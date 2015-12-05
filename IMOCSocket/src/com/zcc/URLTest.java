package com.zcc;

import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) {
		try {
			URL imooc = new URL("http://www.imooc.com");
			URL url = new URL(imooc, "/index.html?username=tom#test");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getFile());
			System.out.println(url.getRef());
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
