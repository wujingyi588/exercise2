package exercise2;

import java.util.Scanner;

public class Practice3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2012): ");
	    int year = input.nextInt();
	    System.out.print("Enter month: 1-12:  ");
	    int month = input.nextInt();
	    System.out.print("Enter the day of the month: 1-31: ");
	    int day = input.nextInt();
	    int week = 0;
	    
	    if(month==1) {
	    	month=13;
	    	year--;
	    	week = (day + 26 * (month + 1) / 10 + (year % 100) +(year % 100) / 4 + (year / 100) / 4 + (year / 100) * 5) % 7;
	    }
	    else if(month==2) {
	    	month=14;
	    	year--;
	    	week = (day + 26 * (month + 1) / 10 + (year % 100) +(year % 100) / 4 + (year / 100) / 4 + (year / 100) * 5) % 7;
	    }
	    
	    switch (week) {
		    case 0:System.out.println("Day of week is Saturday"); break;
	        case 1:System.out.println("Day of week is Sunday"); break;
	        case 2:System.out.println("Day of week is Monday"); break;
	        case 3:System.out.println("Day of week is Tuesday"); break;
	        case 4:System.out.println("Day of week is Wednesday"); break;
	        case 5:System.out.println("Day of week is Thursday"); break;
	        case 6:System.out.println("Day of week is Friday"); break;
		}
	}

}
