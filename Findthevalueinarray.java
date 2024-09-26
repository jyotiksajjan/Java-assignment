package javapractice;

import java.util.Arrays;

public class Findthevalueinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,45,6};
		int b=2;
		for(int i=0;i<a.length;i++)
		{
			if(b==a[i])
			{
				System.out.println("value is present in array");
			}
		}
	 System.out.println("not present");
	}

}
