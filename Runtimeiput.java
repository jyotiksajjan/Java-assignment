package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class Runtimeiput {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.println("Array values are:"+(Arrays.toString(a)));
		
	}

}
