package JavaQuestions;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		char c ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pls Enter one  charater or special character: ");
		c = input.next().charAt(0);
		
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println("Enter character is an Alphabet !!");
		else
			System.out.println("Entered character is not an Alphabet !!!");
		
		

	}

}
