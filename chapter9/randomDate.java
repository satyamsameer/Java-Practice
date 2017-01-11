/*Random numbers generating same number sequence due to same seed*/

public class randomDate {
	public static void main(String ags[]){
		java.util.Date date= new java.util.Date();
		System.out.println("The elapsed time is "+date.getTime()+" millisecond");
		System.out.println(date.toString());
		
		java.util.Random r1=new java.util.Random(3);
		System.out.println("Random numbers 1:");
		for(int i=0;i<10;i++){
			System.out.println(r1.nextInt(1000)+ " ");
		}
		java.util.Random r2=new java.util.Random(3);
		System.out.println("\nRandom numbers 2:");
		for(int i=0;i<10;i++){
			System.out.println(r2.nextInt(1000)+ " ");
		}
	}
	
}