package Assignments;
import java.util.Scanner;

public class Addition {
	int number1, number2, total;
	
	public int sum(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first number:");
		number1 = s1.nextInt();
		System.out.println("Enter the second number:");
		number2 = s1.nextInt();
		total = number1+number2;
		System.out.println("Sum of 2 numbers is: "+total);
		return total;
	}

	public static void main(String[] args) {
		
	
		

	}

}
