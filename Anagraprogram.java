package javapractice;

import java.util.Arrays;

public class Anagraprogram {

	public static void main(String[] args) {
		String s1="are";
		String s2="eara";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("both strings are not anagram");
		}
		else
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s1.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)==true)
			{
				System.out.println("both strings are anagram");
			}
			else
			{
				System.out.println("both strings are anagram");
			}
			
		}
		

	}

}



