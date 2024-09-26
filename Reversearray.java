package javapractice;

import java.util.Arrays;
import java.util.Collections;

public class Reversearray {

	public static void main(String[] args) {
		int a1[]= {1,2,6,4,3,5};
		int rev[]=new int[a1.length];
		for(int i=a1.length-1,k=0;i>=0;i--)
		{
			rev[k]=a1[i];
			k++;
		}
         System.out.println(Arrays.toString(rev));
	}

}
