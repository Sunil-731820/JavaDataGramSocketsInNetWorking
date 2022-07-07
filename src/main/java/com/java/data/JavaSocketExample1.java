package com.java.data;

import java.net.*;
public class JavaSocketExample1 {
	public static void main(String[] args) throws UnknownHostException, SocketException {
		int port = 1085;
		InetAddress inetAddress = InetAddress.getByName("localhost");
		System.out.println(inetAddress);
		try (//this is used to create the dataGram Sockets Objects
		DatagramSocket dataGramSocket = new DatagramSocket()) {
			//Connects method is used to connect the inetAddress and port Number With this Sockets
			dataGramSocket.connect(inetAddress,port);
			//it returns null if the sockets is closed 
			System.out.println("the remote Sockets Address is " + dataGramSocket.getRemoteSocketAddress());
			
			//print the local port NUmber if sockets is bound
			System.out.println("the Local Port number " + dataGramSocket.getLocalPort());
			//print the local Socket Address 
			System.out.println("the LocalSocket Address is " + dataGramSocket.getLocalAddress());
			//getting the port Number on which the Sockets is bound
			System.out.println("the port Number is " + dataGramSocket.getPort());
		}
	}

}
