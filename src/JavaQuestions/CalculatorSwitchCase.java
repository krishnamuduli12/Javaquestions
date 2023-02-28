package JavaQuestions;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		// Creating Calculator using Switch Case
		Scanner input = new Scanner(System.in);
		System.out.println("Pls Ener two numbers : ");
		
		double first = input.nextDouble();
		double second = input.nextDouble();
		
		double result = 0;
	    System.out.println("Pls Ener the operator e.g. +, -, * or / : ");
		char operator = input.next().charAt(0);
		
		switch (operator) {
		case '+': 
			result = first + second;
			break;
		case '-': 
			result = first - second;
			break;
		case '*': 
			result = first * second;
			break;
		case '/': 
			result = first / second;
			break;
				
		default:
			break;
		}
		
		System.out.println("The result is: " + result );

	}

}
