import java.net.*;
import java.io.*;
public class serverT implements Runnable{
	Socket csocket;
	int cnum=0;
	boolean done;
	
	public serverT(Socket s,int x){
		this.csocket=s;
		this.cnum=x;
		this.done=false;
	}
	
	public static void main(String args[]) throws Exception{
		ServerSocket server=new ServerSocket(8000);
		int iter=0;
		System.out.println("Server started: " + server);
		while(true){
			Socket nwsocket=server.accept();
			iter++;
			System.out.println("Client "+iter+" connected: " + nwsocket);
			new Thread(new serverT(nwsocket,iter)).start();
		}
		
	}
	
	public void run(){
		try{
			DataInputStream in=new DataInputStream(csocket.getInputStream());
			DataOutputStream out=new DataOutputStream(csocket.getOutputStream());
			String str;
			 while (!done)
			 {  try
				{  str = in.readUTF();
					System.out.println("Client "+cnum+" types : "+str);
					if(str.contains("server")){
						//String reply=input.nextLine();
						out.writeUTF("Server says hello to Client "+cnum); 
					}
				   done = str.equals(".bye");
				}
				catch(IOException ioe)
				{  done = true;
				}
			 }
			 if(done){
				 System.out.println("Client "+cnum+" closes");
			 }
			 if (csocket != null)    csocket.close();
			if (in != null)  in.close();
			if(out !=null) out.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}