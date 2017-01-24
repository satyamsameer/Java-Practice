public class PolymorphismDemo{
	public static void main(String[] args){
		displayObject(new CircleFromSimpleGMObject(2,"blue",false));
		displayObject(new RectangleFromSimpleGMObject(2,5,"black",true));
	}
	
	public static void displayObject(SimpleGMObject object){
		System.out.println("Created on "+object.getDateCreated()+". Color is "+object.getColor());
	}
}