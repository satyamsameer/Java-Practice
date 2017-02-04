public class TestException{
	public static void main(String args[]){
		try{
			System.out.println(sum(new int[]{1,2,3,4,5}));
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("\n"+e.getMessage());
			System.out.println("\n"+e.toString());
			
			System.out.println("\nTrace Info Obtained form getStackTrace");
			StackTraceElement[] traceElement=e.getStackTrace();
			for(int i=0;i<traceElement.length;i++){
				System.out.print("method "+traceElement[i].getMethodName());
				System.out.print("("+traceElement[i].getClassName()+":");
				System.out.println(traceElement[i].getLineNumber()+")");
			}
		}
	}
	private static int sum(int[] list){
		int result=0;
		for(int i=0;i<=list.length;i++){
			result+=list[i];	
		}
		return result;
	}
}