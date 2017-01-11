import java.net.*;
import java.io.*;
public class clientT{
	public static void main(String args[]){
		int port=8000;
		String host="localhost";
		String str="l";
		DataInputStream in;
		DataOutputStream out;
		Socket socket;
		try{
			socket=new Socket(host,port);
			System.out.println("Connected: " + socket);
			System.out.println("Local port : "+socket.getLocalPort());
			out=new DataOutputStream(socket.getOutputStream());
			in=new DataInputStream(socket.getInputStream());
			while(!str.equalsIgnoreCase(".bye")){
				java.util.Scanner input=new java.util.Scanner(System.in);
				System.out.print("Type here (.bye): ");
				str=input.nextLine();
				out.writeUTF(str);
				if(str.contains("server")){
					System.out.println("\n"+in.readUTF()+"\n");
				}
			}
			if (socket != null)    socket.close();
			if (out != null)  out.close();
			if (in != null)  in.close();
		}catch(Exception e){
				e.printStackTrace();
		}
	}
}