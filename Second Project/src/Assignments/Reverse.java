package Assignments;

import java.util.Scanner;

public class Reverse {
	static int number; static int reverse = 0; static int remainder;

	Reverse(int number, int remainder, int reverse) {
		
		this();
		this.number = number;
		this.reverse = reverse;
		this.remainder = remainder;
		
		while (this.number > 0) {
			this.remainder = this.number % 10;
			this.reverse = this.reverse * 10 + this.remainder;
			this.number = this.number / 10;
		}
		System.out.println(this.reverse);

	}
	Reverse(){
		System.out.println("Finding Reverse");
	}

	public static int input() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = s1.nextInt();
		return number;

	}

	public static void main(String[] args) {

		int number = input();
		Reverse r1 = new Reverse(number, reverse, remainder);

	}

}
