package JavaQuestions;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int num = reader.nextInt();
		
		if(num % 2 == 0)
		 System.out.println("Number " + num + " is a Even number !!!");
		else 
		 System.out.println("Number " + num + " is an Odd number !!!");
		
		

	}

}
