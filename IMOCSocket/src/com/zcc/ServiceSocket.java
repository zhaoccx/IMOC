package com.zcc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务器
 */
public class ServiceSocket {
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("服务器即将启动，正在等待客户端的连接数*************");
			Socket accept = serverSocket.accept();
			InputStream is = accept.getInputStream();
			OutputStream os = accept.getOutputStream();
			InputStreamReader reader = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(reader);
			PrintWriter pw = new PrintWriter(os);
			String info = null;
			while ((info = br.readLine()) != null) {
				System.out.println("客户端的信息是：" + info);
				pw.write("接收的信息是：" + info);
				pw.flush();
			}
			accept.shutdownInput();
			accept.shutdownOutput();
			br.close();
			pw.close();
			reader.close();
			is.close();
			os.close();
			accept.close();
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
