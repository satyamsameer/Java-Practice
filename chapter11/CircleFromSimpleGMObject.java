public class CircleFromSimpleGMObject extends SimpleGMObject{
	private double radius;
	public CircleFromSimpleGMObject(){
		
	}
	public CircleFromSimpleGMObject(double radius){
		this.radius=radius;
	}
	public CircleFromSimpleGMObject(double radius,String color,boolean filled){
		this.radius=radius;
		setColor(color);
		setFilled(filled);
		}
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getArea(){
		return radius*radius*Math.PI;
	}
	public double getDiameter(){
		return 2*radius;
	}
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	public void printCircle(){
		System.out.println("The circle is created "+getDateCreated()+" and radius is "+radius);
	}
	
}