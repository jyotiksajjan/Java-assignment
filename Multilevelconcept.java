package javapractice;

class Hyundai {
	
	Hyundai()
	{
		System.out.println("Hyundai model");
	}
	public void Asta()
	{
		System.out.println("Asta model");
	}
}
class Tata extends Hyundai
{
	public void tatamodel() 
	{
		System.out.println("tata model");
	}
}
public class Multilevelconcept extends Tata{
	Multilevelconcept (int a)
	{
		System.out.println("Multilevelconcept");
	}
	void add()
	{
		System.out.println("childest method");
	}
	
	public static void main(String[] args) {
		Multilevelconcept m1=new Multilevelconcept(12);
		m1.tatamodel();
		m1.Asta();
		m1.add();
	

	}

}
