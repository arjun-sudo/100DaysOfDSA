package Day001;

import java.util.Scanner;
//taking input as array uing for loop
public class InputInArray {
	public static void main(String[] args) {
		Scanner obj=new Scanner (System.in);
		int[] myIntArray=new int[20];
		System.out.println("Enter any 10 numbers :");
		for(int i=0;i<10;i++)
		{
			myIntArray[i]=obj.nextInt();
		}
		System.out.println("Entered numbers are :");
		for(int i=0;i<10;i++)
		{
			System.out.print(myIntArray[i]+" ");
		}
	}

}
