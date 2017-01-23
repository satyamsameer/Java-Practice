import java.util.Scanner;
public class PalindromeAlphan{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=input.nextLine();
		System.out.println("Ignoring non-alphanumeric characters for "+s+" is a Palindrome? "+isPalindrome(s));
	}
	public static boolean isPalindrome(String s){
		String s1=filter(s);
		String s2=reverse(s1);
		return s2.equals(s1);
	}
	public static String filter(String s){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(Character.isLetterOrDigit(s.charAt(i))){
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
	public static String reverse(String s){
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}