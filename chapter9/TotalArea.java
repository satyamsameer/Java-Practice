public class TotalArea {
	public static void main(String args[]){
		circlePrivate[] circleArray;
		
		circleArray=createCircleArray();
		printCircleArray(circleArray);
	}
	
	public static circlePrivate[] createCircleArray(){
		circlePrivate[] circleArray=new circlePrivate[5];
		for(int i=0;i<circleArray.length;i++){
			circleArray[i]=new circlePrivate(Math.random()*100);
		}
		return circleArray;
	}
	
	public static void printCircleArray(circlePrivate[] circleArray){
		System.out.printf("%-30s%-15s\n","Radius","Area");
		for(int i=0;i<circleArray.length;i++){
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
		}
		System.out.println("----------------------------------------------------");
		System.out.printf("%-30s%-15f\n","The total area of circles is ",sum(circleArray));
	}
	public static double sum(circlePrivate[] circleArray){
		double sum=0;
		for(int i=0;i<circleArray.length;i++){
			sum+=circleArray[i].getArea();
		}
		return sum;
	}
}
