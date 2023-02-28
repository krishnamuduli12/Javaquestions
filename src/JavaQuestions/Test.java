package JavaQuestions;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		float f1, f2, f3;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Pls enter a float number: ");
		f1 = reader.nextFloat();
		
		Scanner reader1 = new Scanner(System.in);
		System.out.println("Pls enter one more float number: ");
		f2 = reader1.nextFloat();
		
		f3 = f1*f2;
		
		System.out.println("Multilication of two float number is : " +  f3 );

	}

}
