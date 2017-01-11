public class testClassPrivate {
	public static void main(String args[]){
		circlePrivate c=new circlePrivate(5.0);
		System.out.println("The area is of radius "+c.getRadius()+" is "+c.getArea());
		
		c.setRadius(c.getRadius()+1.1);
		System.out.println("The area is of radius "+c.getRadius()+" is "+c.getArea());
		
		System.out.println("The number of objects created are "+c.getNumberOfObjects());
		
		circlePrivate c1=new circlePrivate(6.0);
		System.out.println("The number of objects created are "+c.getNumberOfObjects());
		
	}
}
