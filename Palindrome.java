package javapractice;

public class Palindrome {

	public static void main(String[] args) {
		String s1="mamk";
		String result="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			result=result+ch;
		}
		if(s1.equals(result))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
