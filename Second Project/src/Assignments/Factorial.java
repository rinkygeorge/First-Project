package Assignments;

import java.util.Scanner;

public class Factorial {
	int number, factorial = 1;

	public void getresult(int number) {
		
		while(number>0){
			factorial = factorial * number;
			number = number - 1;			
		}
		
		showresult(factorial);

	}
	public void showresult(int factorial){
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Factorial f1 = new Factorial();
		System.out.println("Enter the number:");
		int number = s1.nextInt();
		f1.getresult(number);

	}

}
