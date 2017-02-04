public class CircleWithException{
	private double radius;
	private static int numberOfObjects=0;
	public CircleWithException(){
		this(1.0);
	}
	public CircleWithException(double nradius){
		setRadius(nradius);
		numberOfObjects++;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double nradius) throws IllegalArgumentException{
			if(nradius>=0)
				radius=nradius;
			else
				throw new IllegalArgumentException("Radius cannot be negative");
		}
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	public double findArea(){
		return radius*radius*Math.PI;
	}
}