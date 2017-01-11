import java.net.*;
import java.io.*;
public class serverEx{
	public static void main(String args[]){
		int port=8000;
		DataInputStream in;
		DataOutputStream out;
		ServerSocket server;
		Socket socket;
		double num=20;
		
		try{
			server=new ServerSocket(port);
			socket=server.accept();
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
			System.out.println(in.readDouble());
			out.writeDouble(num);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}