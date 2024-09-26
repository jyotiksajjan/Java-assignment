package javapractice;

class Vehicle
{
	 void model()
	{
		System.out.println("vehicle model");
	}
}
public class SimpleInheritanceConcept extends Vehicle {
	 void Colour()
	{
		System.out.println("vehicle colour");
	}
	public static void main(String[] args) {
		SimpleInheritanceConcept s1=new SimpleInheritanceConcept();
		s1.Colour();
		s1.model();
		

	}

}	
