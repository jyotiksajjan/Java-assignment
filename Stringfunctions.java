package javapractice;

public class Stringfunctions {
	public void method1()
	{
	String s1="Jyoti";
	Boolean s2=s1.matches("(.*)J");
	Boolean s3=s1.matches("J(.*)");
	Boolean s4=s1.matches("(.*)J(.*)");
	Boolean s5=s1.matches(".....");
	Boolean s6=s1.equals("jyoti");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);
	
	}
	public static void main(String[] args) {
		Stringfunctions s1=new Stringfunctions();
		s1.method1();

	}

}
