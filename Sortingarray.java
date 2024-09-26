package javapractice;

import java.util.Arrays;

public class Sortingarray {

	public static void main(String[] args) {
		int array1[]= {2,1,5,4,3};
		//int array2[]=new int[array1.length];
		for(int i=0;i<array1.length;i++)	
		{
			Arrays.sort(array1);
			for(int j=array1.length-1;j>0;j--)
			{
				System.out.println(array1[j]);
			}
			
		}
		System.out.println(Arrays.toString(array1));

	}

}
