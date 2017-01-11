import java.net.*;
import java.io.*;
public class webscrap{
	public static void main(String args[]){
		try{
			URL url=new URL("http://www.google.co.in");
			URLConnection con=url.openConnection();
			BufferedReader b=new BufferedReader(new InputStreamReader(con.getInputStream()));
			String line;
			while((line=b.readLine())!=null){
				System.out.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}