package exercise2;

import java.util.Scanner;

public class Practice3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the x, y coordinates of a point: ");
		double x = input.nextDouble();
	    double y = input.nextDouble();
	    double sum = x * x +y * y;
	    sum = Math.pow(sum, 0.5);
	    if(sum < 10)
	    	System.out.println("Point (" + x + ", " + y +") is in the circle");
	    else 
	    	System.out.println("Point (" + x + ", " + y +") is not in the circle");
		
	}

}
