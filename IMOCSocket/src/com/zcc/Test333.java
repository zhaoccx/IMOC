package com.zcc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 * @author zhaocc
 *
 */
public class Test333 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.baidu.com");
			InputStream stream = url.openStream();
			InputStreamReader reader = new InputStreamReader(stream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(reader);
			String readLine = bufferedReader.readLine();
			while (readLine != null) {
				System.out.println(readLine);
				readLine = bufferedReader.readLine();
			}
			bufferedReader.close();
			reader.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
