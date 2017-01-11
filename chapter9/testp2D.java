import java.util.*;
import javafx.geometry.Point2D;
public class testp2D{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter point 1's x and y co-ordinates:");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.print("Enter point 2's x and y co-ordinates:");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		Point2D p1=new Point2D(x1,y1);
		Point2D p2=new Point2D(x2,y2);
		System.out.println("p1 is "+p1.toString());
		System.out.println("p2 is "+p2.toString());
		System.out.println("The distance between p1 and p2 is "+p1.distance(p2));
		System.out.println(Math.sqrt(2));
	}
}