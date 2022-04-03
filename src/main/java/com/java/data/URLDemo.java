package com.java.data;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.javatpoint.com");
			System.out.println("the Protocol is "+ url.getProtocol());
			System.out.println("the host Name "+ url.getHost());
			System.out.println("Port Number is " + url.getPort());
			System.out.println("the file is "+ url.getFile());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
