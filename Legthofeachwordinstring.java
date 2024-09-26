package javapractice;

public class Legthofeachwordinstring {
	public static void main(String[] args) {
	String s1="my name is jyoti";
	String [] s2=s1.split(" ");
	for(String result:s2)
	{
		System.out.println(result.length());
	}

}
}
