import java.util.*;
public class TestPassArray
{
	public static void main(String[] args)
	{
		int[] a={1,2};
		System.out.println("Before swap: ");
		System.out.println("Array is {"+a[0]+","+a[1]+"}");
		swapA(a);
		System.out.println("After swap :");
		System.out.println("Array is {"+a[0]+","+a[1]+"}");
	}
	public static void swapA(int[] b)
	{
		int temp=b[0];
		b[0]=b[1];
		b[1]=temp;
	}
}