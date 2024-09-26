package javapractice;

public class Typecasting {

	public static void main(String[] args) {
		int a=10;
		double b=(double)a;  //explicitly(widening)
		System.out.println(a); 
		
		int x=20;
		double res=x;
		System.out.println(res); //implicitly(widening)

		double y=100;
		int z=(int) y;
		System.out.println(z);  narrowing (only explicitly)
	}

}
