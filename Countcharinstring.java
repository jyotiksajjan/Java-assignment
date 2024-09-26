package javapractice;

public class Countcharinstring {

	public static void main(String[] args) {
		String s="jyoti123@gmail.com";
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean alphabets=Character.isLetter(ch[i]);
			if(alphabets==true)
			{
				count++;
			}
		}
		System.out.println("count of alphabets in string:"+count);

	}
}
