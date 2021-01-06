package exercise2;

import java.util.Scanner;

public class Practice3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an IBSN as integer: ");
		String sentence =sc.nextLine();

		int i=Integer.parseInt(sentence);
		int num=0;
		for(int j=9;j>0;j--) {
			num=num+(i%10)*j;
			i=i/10;
		}
		num=num%11;
		String n=""+num;
		sentence=sentence+n;
		System.out.print("The ISBN-10 number is "+sentence);
	}

}
