package JavaQuestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pls Enter a number to find Factorial: ");
		int num = input.nextInt();
		
		getFact(num);
	}
		
	public static void getFact(int num) {
		
	
	double fact = 1;
		
		int j =1;
		
		while(j <= num) {
			fact = fact * j;
			j++;
		}
		
		System.out.println("Factorial of number " + num + " is : " + fact);	
	}
		
}


