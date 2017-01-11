import java.net.*;
import java.io.*;
public class cli{
	public static void main(String args[]){
		String str;
		Socket sc;
		DataInputStream in;
		DataOutputStream out;
		try{
			sc=new Socket("localhost",8000);
			System.out.println("Client connected :"+sc);
			in=new DataInputStream(sc.getInputStream());
			out=new DataOutputStream(sc.getOutputStream());
			while(true){
					java.util.Scanner input=new java.util.Scanner(System.in);
					str=input.nextLine();
					out.writeUTF(str);
					System.out.println("Server :"+in.readUTF());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}