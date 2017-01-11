import java.net.*;
import java.io.*;
public class ser{
	public static void main(String args[]){
		String str;
		ServerSocket s;
		Socket sc;
		DataOutputStream out;
		DataInputStream in;
		try{
			s=new ServerSocket(8000);
			System.out.println("Server started :"+s);
			sc=s.accept();
			System.out.println("Client accepted :"+sc);
			in=new DataInputStream(sc.getInputStream());
			out=new DataOutputStream(sc.getOutputStream());
			while(true){
						java.util.Scanner input=new java.util.Scanner(System.in);
						str=input.nextLine();
						out.writeUTF(str);
						System.out.println("Client :"+in.readUTF());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}