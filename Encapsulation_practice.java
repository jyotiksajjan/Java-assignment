package javapractice;

class Login
{
	private String un="jyoti@gmail.com";	

public void setun(String un)
{
	this.un=un;
}
public String getun()
{
	return un;	
}
}
public class Encapsulation_practice {
	public static void main(String[] args) {
		Login l1=new Login();
		l1.setun("jyotik@gmail.com");
		l1.getun();
		System.out.println(l1.getun());
	}

}
