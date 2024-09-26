package javapractice;

import java.util.Arrays;

public class Arraysequalornot {
	public static void checkstringarray()
	{
		String name1[]= {"Jyoti","Kalyan","Shresta"};
		String name2[]= {"Jyoti","Kalyan","Shresta"};
		if(Arrays.equals(name1,name2))
		{
			System.out.println("string arrays are equal");
		}
		else
		{
			System.out.println("string arrays are not not equal");
		}

	}
	public static void chararray() {
		int ch[]= {'a','b'};
		int dh[]= {'a','b'};
		if(Arrays.equals(ch, dh))
		{
			System.out.println("char array are equal");
		}
		else
		{
			System.out.println("char array are not equal");
		}
	}
	public static void intarray()
	{
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		  if( Arrays.equals(a,b))
			{
				System.out.println("arrays are equal");
			}
			else
			{
				System.out.println("arrays are not equal");
			}

	}
	public static void main(String[] args) {
		checkstringarray();
		chararray();
		intarray();
		
		}
	

}
