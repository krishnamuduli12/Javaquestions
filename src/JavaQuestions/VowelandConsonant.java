package JavaQuestions;

import java.util.Scanner;

public class VowelandConsonant {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter one Character : ");
		char ch = reader.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
		  System.out.println("Input Character " + ch + " is a Vowel !!!");
		else
		 System.out.println("Input Character " + ch + " is a Consonant !!!");
	
		System.out.println("With Swich Case !!!");
		
	switch (ch){
	
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
		System.out.println("Input Character " + ch + " is a Vowel !!!");
		break;
		
	default:
		System.out.println("Input Character " + ch + " is a Consonant !!!");
		break;
				
	}
		
		

	}

}
