package com.java.data;

import java.net.*;
public class JavaSocketExample1 {
	public static void main(String[] args) throws UnknownHostException {
//		int port = 1085;
		InetAddress inetAddress = InetAddress.getByName("localhost");
		System.out.println(inetAddress);
	}

}
