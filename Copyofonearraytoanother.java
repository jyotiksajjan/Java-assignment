package javapractice;

import java.util.Arrays;

public class Copyofonearraytoanother {
	public static void main(String[] args) 
	{
		int a[]= {1,3,4,8,5,6};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("orginal array:"+(Arrays.toString(a)));
		System.out.println("copied array->"+(Arrays.toString(b)));
		
	}
	}
	
	
