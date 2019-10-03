package Day001;

import java.util.Scanner;

//array with taking input of size
public class ArrayWithSizeDeclaration {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n=obj.nextInt();
		int[] myIntArray=new int[n];
		System.out.println("Enter the numbers in array:");
		for(int i=0;i<n;i++)
		{
			myIntArray[i]=obj.nextInt();
		}
		System.out.println("Entered numbers are :");
		for(int i=0;i<n;i++)
		{
			System.out.print(myIntArray[i]+" ");
		}
	}

}
