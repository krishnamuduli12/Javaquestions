package JavaQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Armstrong number - 
		//153 = 1*1*1 + 5*5*5 + 3*3*3
		//371 = 3*3*3 + 7*7*7 + 1*1*1
		
		int num = 154;
		int actualNum = num;
		double result = 0;
		
		while (num != 0) {
			int n = num % 10;
			result = result + Math.pow(n, 3);
			num = num / 10;
		}
		
		if (actualNum == result )
		{
			System.out.println("The number is a Armstrong Number !!!");
		}
		else
		{
			System.out.println("The number is not an Armstrong Number !!!");
		}

	}

}
