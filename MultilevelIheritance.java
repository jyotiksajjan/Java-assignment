package javapractice;

interface Flipcarta
{
	void add();
	int a=10;
}
interface Amazonaa
{
	void sub();
}
public class MultilevelIheritance implements Amazonaa,Flipcarta {
	void mul() {
		System.out.println("multiplication");
		
	}

	public static void main(String[] args) {
		MultilevelIheritance m1=new MultilevelIheritance();
		m1.mul();
		m1.add();
		m1.sub();
		

	}

	@Override
	public void add() {
		System.out.println("addition");
		
	}

	@Override
	public void sub() {
		System.out.println("substraction");
		
	}

}
