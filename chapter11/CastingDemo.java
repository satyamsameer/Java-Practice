public class CastingDemo{
	public static void main(String[] args){
		Object object1=new CircleFromSimpleGMObject(1);
		Object object2=new RectangleFromSimpleGMObject(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object ob){
		if(ob instanceof CircleFromSimpleGMObject){
			System.out.println("The circle area is "+((CircleFromSimpleGMObject)ob).getArea());
		}
		else if(ob instanceof RectangleFromSimpleGMObject){
			System.out.println("The rectangle area is "+((RectangleFromSimpleGMObject)ob).getArea());
		}
	}
}