package javapractice;

import java.util.Arrays;

public class Givenarrayequalornot {

	public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,5};
           if(!(Arrays.equals(a,b)))
            {
                System.out.println("both arrays are not equal");
            }
            else
            {
                System.out.println("both arrays are equal");
            }

	}

}
