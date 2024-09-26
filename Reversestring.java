package javapractice;

public class Reversestring {

	public static void main(String[] args) {
		String s1="Jyoti";
		String result="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			result=result+ch;
		}
		System.out.println(result);

	}

}
