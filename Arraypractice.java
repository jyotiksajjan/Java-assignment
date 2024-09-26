package javapractice;

public class Arraypractice {
	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=1;
		a[1]=3;
		a[2]=6;
		
		String name[]=new String[3];
		 name[0]="Jyoti";
		 name[1]="Kalyan";
		 name[2]="Shresta";
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			System.out.println(name[i]);
		}
	}

}
