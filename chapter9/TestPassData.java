public class TestPassData {
	public static void main(String args[]){
		circlePrivate c=new circlePrivate(1);
		 int n=5;
		 printAreas(c,n);
		 
		 System.out.println("\n Radius is "+c.getRadius());
		 System.out.println("n is "+n);
	}
	
	public static void printAreas(circlePrivate c1,int times){
		System.out.println("Radius \t\tArea");
		while(times>=1){
			System.out.println(c1.getRadius()+"\t\t"+c1.getArea());
			c1.setRadius(c1.getRadius()+1);
			times--;
		}
	}
}
