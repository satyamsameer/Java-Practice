import java.util.ArrayList;
public class TestArrayList{
	public static void main(String[] args){
		ArrayList<String> l=new ArrayList<>();
		
		l.add("London");
		l.add("Denver");
		l.add("Paris");
		l.add("Miami");
		l.add("Seoul");
		l.add("Tokyo");
		
		System.out.println("List size- "+l.size());
		System.out.println("Is Miami in list? "+l.contains("Miami"));
		System.out.println("Is the list empty? "+l.isEmpty());
		
		l.add(2,"Xian");
		l.remove("Miami");
		l.remove(1);
		
		System.out.println(l.toString());
		
		for(int i=l.size()-1;i>=0;i--){
			System.out.print(l.get(i)+" ");
		}
		System.out.println();
		
		ArrayList<CircleFromSimpleGMObject> list=new ArrayList<>();
		
		list.add(new CircleFromSimpleGMObject(2));
		list.add(new CircleFromSimpleGMObject(3));
		
		System.out.println("The area of the circle? "+list.get(0).getArea());
	}
}