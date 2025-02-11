package arrayMerging_SpecialOperations;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Even_Print_Reverse 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Array Size");
		int size1 = s.nextInt();
		int arr1[] = new int[size1];
		System.out.println("Enter 1st Array Elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i] = s.nextInt();
		}		
		System.out.println("Enter 2nd Array Size");
		int size2 = s.nextInt();
		int arr2[] = new int[size2];
		System.out.println("Enter 2nd Array Elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i] = s.nextInt();
		}
		int count1 = 0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]%2==0)
				count1++;
		}
		int count2 = 0;
		for(int i=0;i<=arr2.length-1;i++)
		{
			if(arr2[i]%2==0)
				count2++;
		}
		System.out.println(count1);
		System.out.println(count2);
		int newArr[] = new int [count1+count2];
		System.out.println(newArr.length);

		int a[] = isEven(arr1,count1);
		int b[]= isEven(arr2,count2);
		for(int i=0;i<=newArr.length-1;i++)
		{
			if(i<a.length)
				newArr[i] = a[i];
			else
				newArr[i] = b[i-a.length];
		}
		
		for(int i=newArr.length-1;i>=0;i--)
		{
			System.out.print(newArr[i] + ",");
		}
	}
	
	public static int[] isEven(int a[],int count)
	{
		int index = 0;
		int arr[] = new int[count];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
				arr[index++] = a[i];
		}
		return arr;
	}
}

/*
5
2
8 
6
4

4
2
8
6
1
 */

