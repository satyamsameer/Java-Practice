public class TestCircleWithException{
	public static void main(String args[]){
		try{
			CircleWithException c1=new CircleWithException(5);
			CircleWithException c2=new CircleWithException(-5);
			CircleWithException c3=new CircleWithException(0);//this line will not execute due to Exception
		}catch(IllegalArgumentException ex){
			System.out.println(ex);
		}
		System.out.println("Number of objects created: "+CircleWithException.getNumberOfObjects());
	}
}