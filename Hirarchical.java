package javapractice;

class Ecommerce
{
	void login()
	{
		System.out.println("Login");
	}
}
class Flipcart extends Ecommerce
{
	void  fliplogin()
	{
		System.out.println("flipcart login");
	}
}
class Amazon extends Ecommerce
{
	void amazonlogin()
	{
		System.out.println("amazon login");
	}
}
public class Hirarchical extends Ecommerce{
	void childestlogin()
	{
		System.out.println("Childest login");
	}
	public static void main(String[] args) {
		Hirarchical h1=new Hirarchical();
		h1.childestlogin();
		h1.login();
		
		Amazon a1=new Amazon();
         a1.amazonlogin();
         a1.login();
         
         Flipcart f1=new Flipcart();
         f1.fliplogin();
         f1.login();
         
         Ecommerce e1=new Ecommerce();
         e1.login();
         
         
         
	}

}
