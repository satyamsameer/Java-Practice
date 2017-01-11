import java.net.*;
import java.io.*;
public class serverA{
	public static void main(String args[]){
		int port=8000;
		String str;
		DataInputStream in=null;
		DataOutputStream out=null;
		ServerSocket server=null;
		Socket socket=null;
		try{
			server=new ServerSocket(port);
			System.out.println("Server started: " + server);
			socket=server.accept();
			System.out.println("Client accepted: " + socket);
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
			java.util.Scanner input= new java.util.Scanner(System.in);
			boolean done = false;
			 while (!done)
			 {  try
				{  str = in.readUTF();
					System.out.println("Client types : "+str);
					if(str.contains("server")){
						System.out.print("Server reply : ");
						String reply=input.nextLine();
						out.writeUTF(reply); 
					}
				   done = str.equals(".bye");
				}
				catch(IOException ioe)
				{  done = true;
				System.out.println("Client closes");
				}
			 }
			 
			 if (socket != null)    socket.close();
			if (in != null)  in.close();
			if (out != null)  out.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}