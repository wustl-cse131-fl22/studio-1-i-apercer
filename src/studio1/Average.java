package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What are the two intergers to be averaged?: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		double average = ((num1 + num2)/2.0);
		System.out.println("The average is " + average);
		
	}

}
