package JavaQuestions;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// num = 10 
		// the number is divisible by 1 , 2 , 5, 10
		
		 int num = 60;
		 System.out.println("The Factors are : ");
		 for(int i =1; i <= num; i++)
		 {
			if (num % i ==0)
				System.out.println(i);
		 }

	}

}
