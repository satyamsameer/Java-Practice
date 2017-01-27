public class ListStackOp{
	public static void main(String args[]){
		MyStack m=new MyStack();
		
		m.push("Cool");
		m.push("Swag");
		m.push("Bravery");
		m.toString();
		System.out.println("Size is: "+m.getSize()+" peek: "+m.peek());
	}
}