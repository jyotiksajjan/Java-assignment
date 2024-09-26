package javapractice;

public class String_practice {
	public static void main(String[] args) {
		String s1="Jyoti";
		
			System.out.println(s1.concat(" Sajjan"));
			System.out.println(s1);
			
			
			StringBuffer sb=new StringBuffer("Jyoti");
			StringBuffer result=sb.append(" Kalyan Sajjan");
			System.out.println(result);
			
			StringBuilder sbb=new StringBuilder("Growtech");
			StringBuilder result1=sbb.append(" minds");
			System.out.println(result1);
			//StringBuilder rev=result1.reverse();
			//System.out.println(rev);
			System.out.println(result1.replace(0, 4, "Happy"));
			
		
	}
}
