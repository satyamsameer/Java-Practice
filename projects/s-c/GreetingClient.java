// File Name GreetingClient.java

import java.net.*;
import java.io.*;
import java.util.*;

public class GreetingClient
{
   public static void main(String [] args)
   {
		Scanner inp = new Scanner(System.in);
      String serverName = "";
      int port = 0;
	  System.out.println("Enter host name: ");
	  serverName=inp.nextLine();
	  System.out.println("Enter the port for host "+serverName+" : ");
	  port=inp.nextInt();
      try
      {
         System.out.println("Connecting to " + serverName +" on port " + port);
         Socket client = new Socket(serverName, port);
         System.out.println("Just connected to " + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         out.writeUTF("Hello from "+ client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in =new DataInputStream(inFromServer);
         System.out.println("Server says " + in.readUTF());
         client.close();
      }catch(IOException e)
      {
         e.printStackTrace();
      }
   }
}