package exercise2;

import java.util.Scanner;

public class Practice3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three sides:");
		int side1 = input.nextInt();
	    int side2 = input.nextInt();
	    int side3 = input.nextInt();
	    if((side1+side2>side3) && (side2+side3>side1) && (side1+side3>side2)) {
	    	System.out.println("The circle is "+(side1+side2+side3));
	    }else 
	    	System.out.println("The side is not legal.");
	    
	}

}
