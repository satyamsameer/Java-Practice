import java.util.Scanner;
public class ReadFileFromURL{
	public static void main(String[] args){
		System.out.print("Enter the URL: ");
		Scanner input=new Scanner(System.in);
		String URLString=input.next();
		try{
			java.net.URL url=new java.net.URL(URLString);
			int count=0;
			Scanner input2=new Scanner(url.openStream());
			while(input2.hasNext()){
				String line=input2.nextLine();
				count+=line.length();
			}
			System.out.println("The file size is "+count+" characters.");
		}catch(java.net.MalformedURLException ex){
			System.out.println("Invalid URL");
		}catch(java.io.IOException ex){
			System.out.println("I/O Errors: no such file");
		}
	}
}