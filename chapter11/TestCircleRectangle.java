public class TestCircleRectangle{
	public static void main(String args[]){
		CircleFromSimpleGMObject circle=new CircleFromSimpleGMObject(1,"red",true);
		System.out.println("A circle "+circle.toString());
		System.out.println("The color is "+circle.getColor());
		System.out.println("The radius is "+circle.getRadius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The diameter is "+circle.getDiameter());
		
		RectangleFromSimpleGMObject rectangle=new RectangleFromSimpleGMObject(2,4,"black",false);
		System.out.println("\nA Rectagle "+rectangle.toString());
		System.out.println("The area is "+rectangle.getArea());
		System.out.println("The perimeter is "+rectangle.getPerimeter());
	}
}