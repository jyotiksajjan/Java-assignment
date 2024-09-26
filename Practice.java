package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice {
	
	static void sumofarray()
	{
		int a[]= {1,2,3,-4,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	static void copyonearraytoanother()
	{
		int b[]= {1,2,3,4,5};
		int c[]=new int[b.length];
		for(int i=0;i<b.length;i++)
		{
			c[i]=b[i];
		}
		System.out.println("new array:"+Arrays.toString(c));
		System.out.println("Old array:"+Arrays.toString(b));
	}
	static void userinput()
	{
		Scanner s1=new Scanner(System.in);
		int a[]=new int[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s1.nextInt();	
		}
		System.out.println(Arrays.toString(a));
	}
	static void Removeelement()
	{
		List l1=new ArrayList(4);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.removeAll(l1);
		System.out.println(l1);
		
		
	}
	
	public static void main(String[] args) {
		//sumofarray();
		//copyonearraytoanother();
		//userinput();
		Removeelement();
		
		
	}	

}
