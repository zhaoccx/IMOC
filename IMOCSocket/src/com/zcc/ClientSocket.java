package com.zcc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端
 * 
 * @author zhaocc
 *
 */
public class ClientSocket {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 9999);
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();
			InputStreamReader isd = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isd);
			PrintWriter pw = new PrintWriter(os);
			pw.write("username:admin;password:123");
			pw.flush();
			String rev = null;
			while ((rev = reader.readLine()) != null) {
				System.out.println(rev);
				rev = reader.readLine();
			}
			socket.shutdownOutput();
			socket.shutdownInput();
			pw.close();
			os.close();
			reader.close();
			isd.close();
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
