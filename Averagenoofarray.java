package javapractice;

public class Averagenoofarray {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,10,};
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/a.length;
		}
		System.out.println(sum);
		System.out.println(avg);

	}

}
