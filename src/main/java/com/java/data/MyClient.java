package com.java.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) {  
		try{      
		Socket s=new Socket("localhost",6660);  
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		dout.writeUTF("Hello Server");  
		dout.flush();  
		dout.close();  
		s.close();  
		}catch(Exception e){System.out.println(e);}  
		}  

}
