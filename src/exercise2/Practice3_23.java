package exercise2;

import java.util.Scanner;

public class Practice3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the x, y coordinates of a point: ");
		double x = input.nextDouble();
	    double y = input.nextDouble();
	    
	    if (x <= 5 && y <= 2.5)
	    	System.out.println("Point (" + x + ", " + y +") is in the rectangle");
	    else
	    	System.out.println("Point (" + x + ", " + y +") is not in the rectangle");
	}

}
