package logical.program;

import java.util.Scanner;

public class LeapYear {
	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("enter year to check leap or not");
			int year= sc.nextInt();
			
		if ((year%4==0 && year%100!=0) || (year%400==0)){
		
			System.out.println(year +" year is leap year");
		}
		else 
			
			System.out.println(year +" year is not leap year");
			
		}
	}


