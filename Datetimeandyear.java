package javapractice;

import java.util.Date;

public class Datetimeandyear {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime()+(1000*60*60*24));
         System.out.println(d2);
         
         String Current_time=d2.toString();
         System.out.println(Current_time);
         
          String year=Current_time.substring(Current_time.length()-4);
          System.out.println(year);
          
          String month=Current_time.substring(4,7);
          System.out.println(month);
          
          String day=Current_time.substring(8,10);
          System.out.println(day);
          
          String date=day.concat("/").concat(month).concat("/").concat(year);
         System.out.println(date);
         
   
	}

}
