import java.rmi.*;
import java.rmi.server.*;
public class serverR extends UnicastRemoteObject implements multiply{
	public serverR() throws RemoteException{}
	public int multiply(int x, int y){
		return(x*y);
	}
	public static void main(String args[]) throws Exception{
		System.out.println("Server Starts");
		serverR s=new serverR();
		Naming.rebind("server",s);
	}
}