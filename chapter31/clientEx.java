import java.net.*;
import java.io.*;
public class clientEx{
	public static void main(String args[]){
		int port=8000;
		String host="localhost";
		DataInputStream in;
		DataOutputStream out;
		Socket socket;
		double num=30;
		try{
			socket=new Socket(host,port);
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
			out.writeDouble(num);
			System.out.println(in.readDouble());
		}catch(Exception e){
				e.printStackTrace();
		}
	}
	
}