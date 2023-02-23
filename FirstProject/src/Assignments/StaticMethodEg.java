//Write a program to set your name and age by a static method 
//and get them in an another static method

package Assignments;
import java.util.Scanner;

public class StaticMethodEg {
	static String name;
	static int age;
	
	static String values(){
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter name:");
		name = s1.nextLine();
		System.out.println("Enter age:");
		age = s1.nextInt();
		return name;
	}
	static void display(){
		System.out.println("Name: "+name+" and age:"+age);
	}

	public static void main(String[] args) {
		values();
		display();
		String a = values();
		System.out.println(a);
	}

}
