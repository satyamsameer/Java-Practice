class SimpleCircle
{
	double r;
	SimpleCircle()
	{
		r=1;
	}
	SimpleCircle(double nr)
	{
		r=nr;
	}
	double getArea()
	{
		return r*r*Math.PI;
	}
	double getPerimeter()
	{
		return 2*Math.PI*r;
	}
	void setRadius(double nr)
	{
		r=nr;
	}
}
public class TestSimpleCircle
{
	public static void main(String[] args)
	{
		SimpleCircle c1=new SimpleCircle();
		System.out.println("The area of the circle of radius "+c1.r+" is "+c1.getArea());
		SimpleCircle c2=new SimpleCircle(25);
		System.out.println("The area of the circle of radius "+c2.r+" is "+c2.getArea());
		SimpleCircle c3=new SimpleCircle(125);
		System.out.println("The area of the circle of radius "+c3.r+" is "+c3.getArea());
		c2.r=100;//c2.setRadius(100);
		System.out.println("The area of the circle of radius "+c2.r+" is "+c2.getArea());
	}
} 