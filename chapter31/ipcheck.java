import java.net.*;
import java.io.*;
import java.lang.*;
public class ipcheck{
	
	public void urladd(String s){
		System.out.println("\nUrl information of link "+s+" :");
		try{
			URL url=new URL(s);
			System.out.println("By Url method :");
			System.out.println("Host name is "+url.getHost());
			System.out.println("Port number is "+url.getDefaultPort());
			System.out.println("Protocol is "+url.getProtocol());
			System.out.println("By InetAddress method :");
			InetAddress address=InetAddress.getByName(url.getHost());
			System.out.println("Host name: "+address.getHostName()+" ");
			System.out.println("IP Address: "+address.getHostAddress());
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void localAdd(String u){
		try{
			System.out.println("\nLocalhost information is:");
			InetAddress ai=InetAddress.getLocalHost();
			System.out.println("Local host name is : "+ai.getHostName());
			System.out.println("Local host IP Address is : "+ai.getHostAddress());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		ipcheck ip=new ipcheck();
		for(int i=0;i<args.length;i++){
			ip.localAdd(args[i]);
			ip.urladd(args[i]);
		}
	}
}